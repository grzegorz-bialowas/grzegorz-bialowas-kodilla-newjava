package com.kodilla.stream.forumuser;
import java.time.LocalDate;
public class ForumUser {
    private final int uniqueID;
    private final String userName;
    private final char sex;
    private final LocalDate localDate;
    private final int postsPublicated;
    public ForumUser(int uniqueID, String userName, char sex, LocalDate localDate, int postsPublicated) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.sex = sex;
        this.localDate = localDate;
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
    public LocalDate getLocalDate() {
        return localDate;
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
                ", LocalDate=" + localDate +
                ", postsPublicated=" + postsPublicated +
                '}';
    }
}
