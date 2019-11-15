package com.antz.tools.io;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.time.LocalDate;
import java.util.Properties;
import java.util.UUID;

/**
 * @author antz
 * @description
 * @date 2019/11/14
 */
@Slf4j
public class PropertiesTest {

    public String loadProperties(String filePath, String key) {
        Properties properties = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filePath));
            properties.load(in);
            String value = properties.getProperty(key);
            return value;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveProperties(String filePath, String key, String value) throws IOException {
        Properties pps = new Properties();
        InputStream in = new FileInputStream(filePath);
        pps.load(in);
        OutputStream out = new FileOutputStream(filePath);
        pps.setProperty(key, value);
        //实时追加到文件末梢
        pps.store(out, "Update " + key);
    }

    public static void main(String[] args) throws IOException {
        PropertiesTest propertiesTest = new PropertiesTest();
        propertiesTest.saveProperties("C:\\home\\pps\\test.instance", "instanceId", UUID.randomUUID().toString());
        propertiesTest.saveProperties("C:\\home\\pps\\test.instance", "startTime", LocalDate.now().toString());
        String instanceId = propertiesTest.loadProperties("C:\\home\\pps\\test.instance", "instanceId");
        String startTime = propertiesTest.loadProperties("C:\\home\\pps\\test.instance", "startTime");
        System.out.println(instanceId);
        System.out.println(startTime);
    }

}
