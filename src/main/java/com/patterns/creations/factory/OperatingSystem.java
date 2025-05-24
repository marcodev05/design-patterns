package com.patterns.creations.factory;

public abstract class OperatingSystem {

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        Architecture = architecture;
    }

    private String version;
    private String Architecture;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return Architecture;
    }

    public void setArchitecture(String architecture) {
        Architecture = architecture;
    }

    public abstract void changeDir(String dir);

    public abstract void removeDir(String dir);
}
