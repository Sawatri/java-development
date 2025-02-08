package com.test.cloudStorage;

public class DropBox extends Storage{

    @Override
    public void storageLimit() {
        System.out.println("Gives 2 GB free storage space.");
    }
}
