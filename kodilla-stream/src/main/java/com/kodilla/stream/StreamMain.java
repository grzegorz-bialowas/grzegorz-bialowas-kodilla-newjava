package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String one = poemBeautifier.beautify("ABC*", n ->"\n"  + n + "MY FIRST LAMBDA TEXT" + "*ABC");
        System.out.println(one);
        String five = poemBeautifier.beautify("|||||", n ->"\n"  + n + "MY FIRST LAMBDA TEXT" + "||||");
        System.out.println(five.toLowerCase());
        String two = poemBeautifier.beautify("<===>*", n ->"\n"  + n + "My first lambda text" + "<===>");
        System.out.println(two);
        String three = poemBeautifier.beautify("|||||", n ->"\n"  + n + "My first lambda text" + "*|||||");
        System.out.println(three);
        String four = poemBeautifier.beautify("|||||", n ->"\n"  + n + "my first lambda text" + "||||");
        System.out.println(four.toUpperCase());
    }
}

