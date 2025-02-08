package com.test.cloudStorage;

public abstract class Storage {

    private String storageName;

    public abstract void storageLimit();

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public void show(){
        System.out.println("Storage Name: "+storageName);
    }
}
