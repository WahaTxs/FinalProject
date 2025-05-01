package org.example;

public abstract class User {
    protected String id;
    protected String name;


    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    /**
     * Interact with the system. Overridden in subclasses.
     */
    public abstract void interact();
}

