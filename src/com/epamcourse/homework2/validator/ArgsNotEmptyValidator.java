package com.epamcourse.homework2.validator;

public class ArgsNotEmptyValidator {
    public boolean countOfArgs(String[] args, int count) {
        return (args.length == count);
    }

    public boolean empty(String[] args) {
        return (args.length == 0);
    }
}