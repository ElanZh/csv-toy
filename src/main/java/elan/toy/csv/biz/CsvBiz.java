package elan.toy.csv.biz;

import elan.toy.csv.config.SysConfig;

import java.io.FileInputStream;

/**
 * @author 张一然
 * @date 2019/6/7 23:27
 * @Package elan.toy.csv.biz
 * @Description csv 文件业务
 */
public class CsvBiz {

    public static void exec(FileInputStream fileIn, SysConfig sysConfig) throws Exception {
        // 读取完毕关闭IO
        fileIn.close();
    }
}
