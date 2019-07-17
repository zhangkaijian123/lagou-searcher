package Test;

import redis.clients.jedis.Jedis;

/**
 * @author 张铠建
 * @description
 * @createdate 2019-06-10 22:13
 **/
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.234.128",6379);
        System.out.println(jedis.ping());
    }
}
