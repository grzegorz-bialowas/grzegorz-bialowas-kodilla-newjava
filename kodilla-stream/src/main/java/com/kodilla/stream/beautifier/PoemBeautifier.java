package com.kodilla.stream.beautifier;
public class PoemBeautifier {
    public String beautify(String beauty, PoemDecorator poemDecorator){
      return poemDecorator.decorate(beauty);
    }
}

