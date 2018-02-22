package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void lastLog() {
        //Given
        Logger.getInstance().log("today");
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("today", log);
    }
}
