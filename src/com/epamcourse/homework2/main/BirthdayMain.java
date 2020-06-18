package com.epamcourse.homework2.main;

import com.epamcourse.homework2.console.BirthdayEcho;
import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.parser.StringsToNumbersParser;
import com.epamcourse.homework2.service.BirthdayService;
import com.epamcourse.homework2.validator.ArgsNotEmptyValidator;
import com.epamcourse.homework2.validator.DateRangeValidator;

import java.util.Calendar;
import java.util.GregorianCalendar;

class BirthdayMain {
    public static void main(String[] args) throws ProgramException {
        ArgsNotEmptyValidator validator = new ArgsNotEmptyValidator();
        if (!validator.countOfArgs(args, 3)) {
            throw new ProgramException("not enougth arguments");
        }
        BirthdayService service = new BirthdayService();
        StringsToNumbersParser parser = new StringsToNumbersParser();
        BirthdayEcho console = new BirthdayEcho();
        try {
            int year = parser.parse(args[2]);
            int month = parser.parse(args[1]);
            int day = parser.parse(args[0]);
            DateRangeValidator dateValidator = new DateRangeValidator();
            if (!dateValidator.isYearInRange(year)) {
                throw new ProgramException("year not in range");
            }
            if (!dateValidator.isMonthCorrect(month)) {
                throw new ProgramException("month not in range");
            }
            if (!dateValidator.isDayCorrect(day)) {
                throw new ProgramException("day not in range");
            }
            Calendar birthday = new GregorianCalendar(parser.parse(args[2]), parser.parse(args[1]), parser.parse(args[0]));
            boolean bornToday = service.isBirthday(birthday);
            console.congratulateIf(bornToday);
            int age = service.calculateFullYears(birthday);
            console.echoFullYears(age);
            int dayOfWeek = service.findDayOfWeek(birthday);
            console.echoDayOfWeek(dayOfWeek);
        } catch (ProgramException ex) {
            System.out.println("incorrect date");
        } catch (NumberFormatException ex) {
            System.out.println("input is not numberic");
        }
    }
}