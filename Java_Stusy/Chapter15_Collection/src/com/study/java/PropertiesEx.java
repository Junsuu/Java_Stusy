package com.study.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public void propertiesTest() throws IOException {
        System.out.println("Properties 읽어들이는 예제");
        Properties properties = new Properties();
        // .class.getResource() 메소드는 해당 클래스의 소스 파일 위치를 상대루트로 설정
        String path = Main.class.getResource("database.properties").getPath();
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
