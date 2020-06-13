package com.epamcourse.homework1.validator;

import com.epamcourse.homework1.entity.Point;

public class ShapeValidator {

    public boolean validatePoint(Point point){
        boolean result = true;
        if (point == null){
            result = false;
        } else if (point.getXCoordinate() < 0 || point.getYCoordinate() < 0){
            result = false;
        }
        return result;
    }

}
