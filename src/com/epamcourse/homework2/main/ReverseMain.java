package com.epamcourse.homework2.main;

import com.epamcourse.homework2.console.ReverseEcho;
import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.validator.ArgsNotEmptyValidator;

class ReverseMain {
    public static void main(String[] args) throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (validator.empty(args)) {
            throw new ProgramException("argument requested");
        }
        ReverseEcho console = new ReverseEcho();
        console.reverseEcho(args);
    }
}