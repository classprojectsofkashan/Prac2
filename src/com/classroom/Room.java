package com.classroom;


public class Room {
    // constants
    private static final int MIN_CLASS_NUMBER = 101;
    // statics
    private static int lastClassNumber = MIN_CLASS_NUMBER;
    private static int numberOfClasses = 0;
    private static int maxCapacity = 0;
    // internals
    private int capacity;
    private int number;

    // services
    public int getCapacity() {
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getNumberOfClasses() {
        return numberOfClasses;
    }

    @Override
    protected void finalize() throws Throwable {
        Room.numberOfClasses--;
        super.finalize();
    }

    public void setNumber(int number) throws Exception {
        if (number < MIN_CLASS_NUMBER)
            throw new WrongRoomNumber("Please provide a number which is greater than " + MIN_CLASS_NUMBER);
        this.number = number;
    }

    // constructors
    private Room() {
        this.number = lastClassNumber;
        Room.lastClassNumber++;
        Room.numberOfClasses++;
    }

    public Room(int capacity) {
        this();
        this.capacity = capacity;
    }
}
