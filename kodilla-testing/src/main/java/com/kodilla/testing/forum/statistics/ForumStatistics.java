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

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostCountPerUser() {
        return averagePostCountPerUser;
    }

    public double getAverageCommentsCountPerUser() {
        return averageCommentsCountPerUser;
    }

    public double getAveragePostCommentsPerPostCount() {
        return averagePostCommentsPerPostCount;
    }

    public int calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount > 0) {
            averagePostCountPerUser = (double) postCount / userCount;
        }
        averageCommentsCountPerUser = (double) commentsCount / userCount;
        if (postCount > 0) {
            averagePostCommentsPerPostCount = (double) commentsCount / postCount;
        }
        return 0;
    }
}
