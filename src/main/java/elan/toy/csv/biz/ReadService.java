package elan.toy.csv.biz;

import elan.toy.csv.config.SysConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author 张一然
 * @date 2019/6/6 17:56
 * @Package elan.toy.csv.biz
 * @Description
 */
public class ReadService {
    /**
     * 读取 表格文件
     *
     * @param sysConfig 程序运行配置
     * @throws Exception
     */
    public static void readSheet(SysConfig sysConfig) throws Exception {
        String fileName = sysConfig.getFile().getReadInFile();
        // csv文件
        if (fileName.endsWith(".csv")) {
            CsvBiz.exec(getFileIO(fileName), sysConfig);
            return;
        }
        // exl03
        if (fileName.endsWith(".exl")) {
            ExlBiz.exec(getFileIO(fileName), sysConfig);
            return;
        }
        // exl07
        if (fileName.endsWith(".exls")) {
            ExlsBiz.exec(getFileIO(fileName), sysConfig);
            return;
        }
    }

    /**
     * 获取文件输入流
     *
     * @param fileName 文件名
     * @return 读取当前路径下的文件
     * @throws FileNotFoundException
     */
    private static FileInputStream getFileIO(String fileName) throws FileNotFoundException {
        return new FileInputStream(new File("./" + fileName));
    }
}
