package com.conpany.project;

import com.company.project.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest1 extends ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        Assert.assertSame("输出数字有误", 111, userService.testExample(11));
    }
}
