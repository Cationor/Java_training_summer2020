package com.epamcourse.homework2.service;

import com.epamcourse.homework2.entity.DeadLineInfo;
import com.epamcourse.homework2.excention.ProgramException;
import com.epamcourse.homework2.validator.DateRangeValidator;

import java.util.Calendar;

public class DeadLineService {
    public DeadLineInfo findDeadLine(String developer, int days) throws ProgramException {
        DateRangeValidator validator = new DateRangeValidator();
        if (!validator.isDayCorrect(days)) {
            throw new ProgramException("days not in range");
        }
        Calendar deadline = Calendar.getInstance();
        deadline.roll(Calendar.DAY_OF_YEAR, days);
        DeadLineInfo result = new DeadLineInfo(deadline, developer);
        return result;
    }
}