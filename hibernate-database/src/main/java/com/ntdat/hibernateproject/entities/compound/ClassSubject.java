package com.ntdat.hibernateproject.entities.compound;

import java.io.Serializable;

public class ClassSubject implements Serializable {
    private String id;
    private String name;
    private String room;
    private String classID;

    public ClassSubject() {}

    public ClassSubject(String id, String name, String room, String classID) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.classID = classID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}