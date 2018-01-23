package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beauty = new PoemBeautifier ();
        String text = beauty.beautify("My dear,accept this task, please.", (() -> System.out.println("*A*B*C*")));
        System.out.println(text);
        String textOne = beauty.beautify("If You do.", (() -> System.out.println("<<<----->>>")));
        System.out.println(textOne);
        String textTwo = beauty.beautify("I LOVE YOU.", (() -> System.out.println("***|||***")));
        System.out.println(textTwo);
        String textThree = beauty.beautify("I LOVE YOU.", (() -> System.out.println("**|||||**")));
        System.out.println("<<<>>>" + textTwo + " <<<>>> " + textThree.toLowerCase() + "<<<>>>" + textOne.toUpperCase() + " " + textTwo + "<<<>>>");
        String textFour = beauty.beautify("Thank You.", (() -> System.out.println("========")));
        System.out.println(textFour);
    }
}
