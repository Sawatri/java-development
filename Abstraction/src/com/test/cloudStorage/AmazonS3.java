package com.test.cloudStorage;

public class AmazonS3 extends Storage{

    @Override
    public void storageLimit(){
        System.out.println("Gives 5GB free storage space.");

    }
}
