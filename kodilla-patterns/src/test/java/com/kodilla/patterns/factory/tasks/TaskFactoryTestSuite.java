package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Driving task has been executed", drivingTask.executeTask());
        Assert.assertEquals("Reverse", drivingTask.getTaskName());
        Assert.assertTrue("Driving test has been executed", drivingTask.isTaskExecuted());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting task has been executed", paintingTask.executeTask());
        Assert.assertEquals("Flowers", paintingTask.getTaskName());
        Assert.assertTrue("Painting task has been executed", paintingTask.isTaskExecuted());
    }
    @Test
    public void testShoppingtask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask =taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping task has been executed", shoppingTask.executeTask());
        Assert.assertEquals("Supermarket", shoppingTask.getTaskName());
        Assert.assertTrue("Shopping task has been executed", shoppingTask.isTaskExecuted());
    }
}
