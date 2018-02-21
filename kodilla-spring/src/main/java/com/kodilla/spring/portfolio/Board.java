package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public TaskList getToDoList() {
        return toDoList;
    }
    public TaskList getInProgressList() {
        return inProgressList;
    }
    public TaskList getDoneList() {
        return doneList;
    }
    public void read() {
        System.out.println("Reading" + getDoneList());
        System.out.println("Reading" + getInProgressList());
        System.out.println("Reading" + getToDoList());
    }
}
