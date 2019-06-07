package elan.toy.csv;

import elan.toy.csv.biz.ReadService;
import elan.toy.csv.config.SysConfig;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author 张一然
 * @date 2019/6/6 16:01
 * @Package elan.toy.csv
 * @Description
 */
public class Execute {

    public static void main(String[] args) throws Exception{
//        System.out.println("hello world!");
        // 读取yml文件
        Yaml yaml = new Yaml();
        SysConfig sysConfig = yaml.loadAs(new FileInputStream(new File("./application.yml")), SysConfig.class);

        ReadService.readSheet(sysConfig);
    }
}
