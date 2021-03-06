package com.epamcourse.homework1.parser;

import com.epamcourse.homework1.entity.Point;

public class EntityParser {
    private VariableParser variableParser = new VariableParser();

    public Point parsePoint(String pointData){
        String name = pointData.split("\\(")[0];
        int xCoordinate = variableParser.parseInt(
                pointData.substring(pointData.indexOf('(')+1,pointData.lastIndexOf(',')));
        int yCoordinate = variableParser.parseInt(
                pointData.substring(pointData.indexOf(',')+1,pointData.lastIndexOf(')')));

        return new Point(name, xCoordinate, yCoordinate);
    }

}