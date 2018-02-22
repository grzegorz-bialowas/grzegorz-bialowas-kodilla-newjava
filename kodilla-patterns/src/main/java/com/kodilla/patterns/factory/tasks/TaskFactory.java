package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Reverse", "Corner", "Side mirrors");
            case PAINTINGTASK:
                return new PaintingTask("Flowers", "Blue", "Roses");
            case SHOPPINGTASK:
                return new ShoppingTask("Supermarket", "Shoes", 2);
            default:
                return null;
        }
    }

}
