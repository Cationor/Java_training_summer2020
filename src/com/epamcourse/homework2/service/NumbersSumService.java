package com.epamcourse.homework2.service;

import com.epamcourse.homework2.parser.StringsToNumbersParser;

public class NumbersSumService {
    public int sumNumbers(String[] array) {
        StringsToNumbersParser parser = new StringsToNumbersParser();
        int result = 0;
        for (String elem : array) {
            result += parser.parse(elem);
        }

        return result;
    }
}