package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskDone = false;
    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String executeTask() {
        taskDone = true;
        return "Painting task has been executed";
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public Boolean isTaskExecuted() {
        return taskDone;
    }
}
