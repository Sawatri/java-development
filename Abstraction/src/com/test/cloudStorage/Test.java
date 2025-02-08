package com.test.cloudStorage;

public class Test {
    public static void main(String [] args){
        Storage s = new AmazonS3();
        s.setStorageName("AmazonS3");
        s.show();
        s.storageLimit();

        s = new GoogleDrive();
        s.setStorageName("GoogleDrive");
        s.show();
        s.storageLimit();

        s = new DropBox();
        s.setStorageName("DropBox");
        s.show();
        s.storageLimit();

    }
}
