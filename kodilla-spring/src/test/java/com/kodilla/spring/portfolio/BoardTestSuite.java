package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Show");
        board.getInProgressList().getTasks().add("Play");
        board.getDoneList().getTasks().add("Sing");
        //Then
        Assert.assertTrue(board.getDoneList().getTasks().contains("Sing"));
        Assert.assertTrue(board.getInProgressList().getTasks().contains("Play"));
        Assert.assertTrue(board.getToDoList().getTasks().contains("Show"));
    }
}
