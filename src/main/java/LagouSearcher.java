import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-04-26 13:02
 **/
public class LagouSearcher {
    public static void main(String[] args) {
        //设置webDriver路径
        System.setProperty("webdriver.chrome.driver",LagouSearcher.class.getClassLoader().getResource("chromedriver.exe").getPath());

        //创建webDriver
        WebDriver webDriver=new ChromeDriver();

        //跳转页面
        webDriver.get("https://www.lagou.com/zhaopin/Java/?labelWords=label");

        //通过xpath选中元素

        clickOption(webDriver, "工作经验", "应届毕业生");
        clickOption(webDriver, "行业领域", "移动互联网");

        //解析页面元素
        extractJobsByPagination(webDriver);
    }

    private static void extractJobsByPagination(WebDriver webDriver) {
        List<WebElement> jobElements = webDriver.findElements(By.className("con_list_item"));
        for (WebElement jobElement:jobElements) {
            WebElement moneyElement = jobElement.findElement(By.className("position")).findElement(By.className("money"));
            String companyName = jobElement.findElement(By.className("company_name")).getText();
            System.out.println(companyName + " : " + moneyElement.getText());
        }
        WebElement nextPageBtn = webDriver.findElement(By.className("pager_next"));
        if (!nextPageBtn.getAttribute("class").contains("pager_next_disabled")){
            nextPageBtn.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            extractJobsByPagination(webDriver);
        }
    }

    private static void clickOption(WebDriver webDriver, String choseTitle, String optionTitle) {
        WebElement chosenElement = webDriver.findElement(By.xpath("//li[@class='multi-chosen']//span[contains(text(),'"+choseTitle+"')]"));
        WebElement optionElement = chosenElement.findElement(By.xpath("../a[contains(text(),'"+optionTitle+"')]"));
        optionElement.click();
    }
}
