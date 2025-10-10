package SpecialDocuments.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//LogBack日志框架的使用
public class LogBackTest {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("chu方法出现异常");
            chu(10, 0);
            LOGGER.info("执行成功");
        } catch (Exception e) {
            LOGGER.error("出现bug");
        }
    }

    public static void chu(int a, int b) {
        LOGGER.debug("参数a;", a);
        LOGGER.debug("参数b;", b);
        int c = a / b;
        System.out.println("结果为：" + c);
        LOGGER.info("结果为;", c);
    }
}
