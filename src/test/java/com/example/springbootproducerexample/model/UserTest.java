package com.example.springbootproducerexample.model;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testName(){
        User user = new User("test", "tech", 1L);
        Assert.assertEquals("test", user.getName());

    }

    @Test
    public void testDept(){
        User user = new User("test", "tech", 1L);
        Assert.assertEquals("tech", user.getDept());

    }



}
