package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfigurationAnnotationTests {
    @Value("${openApi.serviceKey}")
    private String serviceKey;

    @Test
    public void valueAnnotationTest() {
        Assert.assertEquals(serviceKey.length(), 98);
    }
}
