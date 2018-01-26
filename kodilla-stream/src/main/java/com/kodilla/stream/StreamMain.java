package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> newForum = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .filter(forumUser -> forumUser.getLocalDate().getYear()>1998)
                .filter(forumUser -> forumUser.getPostsPublicated()>=1)
                .collect(Collectors.toMap(ForumUser::getUniqueID, forumUser -> forumUser));
        System.out.println("New forum users after filtration:" + newForum.size());
        newForum.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}

