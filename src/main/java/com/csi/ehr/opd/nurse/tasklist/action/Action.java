package com.csi.ehr.opd.nurse.tasklist.action;

/**
 * @Project task-list
 * @Author DILAN on 6/3/2018
 */
public enum Action {

    INSERTED("INSERTED"),
    UPDATED("UPDATED"),
    DELETED("DELETED");

    private final String name;

    private Action(String value) {
        this.name = value;
    }

    public String value() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
