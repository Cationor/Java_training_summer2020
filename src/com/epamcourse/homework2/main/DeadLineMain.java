package com.epamcourse.homework2.main;

import com.epamcourse.homework2.entity.DeadLineInfo;
import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.parser.StringsToNumbersParser;
import com.epamcourse.homework2.service.DeadLineService;
import com.epamcourse.homework2.validator.ArgsNotEmptyValidator;

class DeadLineMain {
    public static void main(String[] args) throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 2)) {
            throw new ProgramException("requested 2 arguments");
        }
        DeadLineService service = new DeadLineService();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        try {
            DeadLineInfo result = service.findDeadLine(args[0], parser.parse(args[1]));
            System.out.println(result);
        } catch(NumberFormatException ex) {
            System.out.println("days not numeric");
        }
    }
}