package com.patterns.creations.factory;

public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("change directory linux");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("remove directory linux");
    }
}
