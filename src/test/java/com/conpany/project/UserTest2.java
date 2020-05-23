package com.conpany.project;

import com.company.project.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest2 extends ApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void testExample() {
        Assert.assertSame("hello world", 11, userService.testExample(11));
    }
}
