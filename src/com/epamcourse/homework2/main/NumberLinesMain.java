package com.epamcourse.homework2.main;

import com.epamcourse.homework2.console.NumberLinesEcho;
import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.parser.StringsToNumbersParser;
import com.epamcourse.homework2.service.GenerateNumbers;
import com.epamcourse.homework2.validator.ArgsNotEmptyValidator;

import java.util.ArrayList;

class NumberLinesMain {
    public static void main(String[] args) throws ProgramException {
        GenerateNumbers service = new GenerateNumbers();
        NumberLinesEcho console = new NumberLinesEcho();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 2)) {
            throw new ProgramException("not enought args");
        }
        ArrayList<Integer> oneLineNumbers = service.generate(parser.parse(args[0]));
        ArrayList<Integer> newLineNumbers = service.generate(parser.parse(args[1]));
        console.echoInLine(oneLineNumbers);
        console.echoWithNewLine(newLineNumbers);
    }
}