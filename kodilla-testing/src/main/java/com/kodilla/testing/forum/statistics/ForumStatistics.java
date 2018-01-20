package com.kodilla.testing.forum.statistics;
public class ForumStatistics {
    private int userCount;
    private int postCount;
    private int commentsCount;
    private double averagePostCountPerUser;
    private double averageCommentsCountPerUser;
    private double averagePostCommentsPerPostCount;
    public ForumStatistics(Statistics statistics) {
    }
    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount > 0) {
            averagePostCountPerUser = (double) postCount / userCount;
        }
        averageCommentsCountPerUser = (double) commentsCount / userCount;
        if (postCount > 0 && commentsCount > 0) {
            averagePostCommentsPerPostCount = (double)commentsCount / postCount;
        }
    }
}

