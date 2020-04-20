package com.httpbclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author chenliang
 * @date 2020/4/19
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet get = new HttpGet("http://www.baibu.com");
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }

}
