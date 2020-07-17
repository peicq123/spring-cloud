package com.client.clientserver;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassNameTest
 * @Description
 * @Author
 * @Date2020/7/17 15:22
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        String httpUrl = "https://www.baidu.com/img/bd_logo1.png";

        URL url;

        BufferedInputStream in;

        FileOutputStream file;

        try {

            System.out.println("获取网络图片");

            String fileName = httpUrl.substring(httpUrl.lastIndexOf("/") + 1);

            String filePath = "F:\\";

            url = new URL(httpUrl);

            in = new BufferedInputStream(url.openStream());

            file = new FileOutputStream(new File(filePath + fileName));

            int t;

            while ((t = in.read()) != -1) {

                file.write(t);

            }

            file.close();

            in.close();

            System.out.println("图片获取成功");

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
