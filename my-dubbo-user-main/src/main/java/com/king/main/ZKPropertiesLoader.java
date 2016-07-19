package com.king.main;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by dell on 2015/12/14.
 */
public class ZKPropertiesLoader {

    /***
     * 系统 提前 加载配置文件 到系统变量里面
     * @param rootNode
     */
    public static void load(String rootNode){
        Properties properties = new Properties();
        try {
            Object e = ZKPropertiesLoader.class.getClassLoader().getResourceAsStream("zk.properties");
            properties.load((InputStream)e);
            String zkAddress = properties.getProperty("zk.address");
            String zkVersion = properties.getProperty("zk.version");
            System.setProperty("zk.address", zkAddress);
            System.setProperty("zk.version",zkVersion);
        } catch (Exception var2) {
            System.out.println("zkCLient: 未找到zk.properties配置文件");
            var2.printStackTrace();
            System.exit(0);
        }

    }

}
