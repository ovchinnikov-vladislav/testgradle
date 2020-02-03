package ru.vo;

import org.junit.Assert;
import org.junit.Test;

public class TestService {

    @Test
    public void test() {
        Assert.assertEquals("Hello, World", new Service().getGreeting());
    }
}
