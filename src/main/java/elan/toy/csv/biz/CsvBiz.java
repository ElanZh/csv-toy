package elan.toy.csv.biz;

import elan.toy.csv.config.SysConfig;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author 张一然
 * @date 2019/6/7 23:27
 * @Package elan.toy.csv.biz
 * @Description csv 文件业务
 */
public class CsvBiz {

    public static void exec(FileInputStream fileIn, SysConfig sysConfig) throws Exception {
//        List<User> userList = new CsvToBeanBuilder<User>(new BufferedReader(
//                new InputStreamReader(fileIn, "GB2312")
//        )).withType(User.class).build().parse();
        // 读取完毕关闭IO
        fileIn.close();
    }
}
