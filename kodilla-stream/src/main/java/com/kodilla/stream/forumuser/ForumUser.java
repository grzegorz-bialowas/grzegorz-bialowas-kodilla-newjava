package com.kodilla.stream.forumuser;

public class ForumUser {
    private final int uniqueID;
    private final String userName;
    private final char sex;
    private final double LocalDate;
    private final int postsPublicated;

    public ForumUser(int uniqueID, String userName, char sex, double localDate, int postsPublicated) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.sex = sex;
        LocalDate = localDate;
        this.postsPublicated = postsPublicated;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getLocalDate() {
        return (int) LocalDate;
    }

    public int getPostsPublicated() {
        return postsPublicated;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", LocalDate=" + LocalDate +
                ", postsPublicated=" + postsPublicated +
                '}';
    }
}
