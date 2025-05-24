package com.patterns.creations.factory;

public class WindowsOperatingSystem extends OperatingSystem{

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("change directory linux");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("remove directory windows");
    }
}
