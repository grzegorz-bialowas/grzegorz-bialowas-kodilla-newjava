package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User gregory = new Millenials("Greg");
        User thomas = new YGeneration("Thomas");
        User adam = new ZGeneration("Adam");
        //When
        String hello = gregory.sharePost();
        String summer = thomas.sharePost();
        String winter = adam.sharePost();
        //Then
        Assert.assertEquals("You are on Snapchat now", hello);
        Assert.assertEquals("You are on Facebook now", summer);
        Assert.assertEquals("Yoy are on Twitter now", winter);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User gregory = new Millenials("Gregory");
        //When
        String post = gregory.sharePost();
        gregory.setSocialPublisher(new TwitterPublisher());
        post = gregory.sharePost();
        //Then
        Assert.assertEquals("Yoy are on Twitter now", post);
    }
}
