package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
       // ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        //System.out.println("Calculating expressions with lambdas");
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        //System.out.println("Calculating expressions with method references");
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String one = poemBeautifier.beautify("ABC*", n ->"\n"  + n + "MY FIRST LAMBDA TEXT" + "*ABC");
        System.out.println(one);
        String five = poemBeautifier.beautify("|||||", n ->"\n"  + n + "MY FIRST LAMBDA TEXT" + "||||");
        System.out.println(one.toLowerCase());
        String two = poemBeautifier.beautify("<===>*", n ->"\n"  + n + "My first lambda text" + "<===>");
        System.out.println(two);
        String three = poemBeautifier.beautify("|||||", n ->"\n"  + n + "My first lambda text" + "*|||||");
        System.out.println(three);
        String four = poemBeautifier.beautify("|||||", n ->"\n"  + n + "my first lambda text" + "||||");
        System.out.println(four.toUpperCase());

        Forum forum = new Forum();
        Map<Integer,ForumUser> newForum = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .filter(forumUser -> forumUser.getLocalDate()>20)
                .filter(forumUser -> forumUser.getPostsPublicated()<=1)
                .collect(Collectors.toMap(ForumUser::getUniqueID, forumUser -> forumUser));
        System.out.println("New forum users after filtration:" + newForum.size());
        newForum.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::print);




    }
}

