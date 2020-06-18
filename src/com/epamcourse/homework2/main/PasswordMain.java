package com.epamcourse.homework2.main;

import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.service.PasswordCheck;
import com.epamcourse.homework2.validator.ArgsNotEmptyValidator;

class PasswordMain {
    public static void main(String[] args)  throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 1)) {
            throw new ProgramException("need one argument");
        }
        PasswordCheck service = new PasswordCheck();
        boolean correctPassword = service.passwordCheck(args[0]);
        System.out.println(correctPassword);
    }
}