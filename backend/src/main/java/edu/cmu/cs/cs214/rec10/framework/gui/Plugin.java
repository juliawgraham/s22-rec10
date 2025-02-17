package edu.cmu.cs.cs214.rec10.framework.gui;

public class Plugin {
    private final String name;

    public Plugin(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{ \"name\": \"" + this.name + "\" }";
    }
}
