package com.test.cloudStorage;

public class GoogleDrive extends Storage{

    @Override
    public void storageLimit() {
        System.out.println("Gives 15GB free storage space.");
    }
}
