package com.epamcourse.homework2.entity;

import java.util.Calendar;

public class DeadLineInfo {
    private Calendar deadLine;
    private String developer;

    public DeadLineInfo(Calendar deadLine, String developer) {
        this.deadLine = deadLine;
        this.developer = developer;
    }

    public String toString() {
        return String.format("developer name: %s, deadline: %s", developer
                , deadLine.getTime());
    }
}