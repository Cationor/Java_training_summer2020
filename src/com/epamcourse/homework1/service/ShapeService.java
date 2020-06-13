package com.epamcourse.homework1.service;

import com.epamcourse.homework1.entity.Point;
import com.epamcourse.homework1.exception.ProjectInvalidDataException;
import com.epamcourse.homework1.validator.ShapeValidator;

public class ShapeService {

    public double calculateSquaresProportion (double outerSquareArea) throws ProjectInvalidDataException {
        if (outerSquareArea < 0){
            throw new ProjectInvalidDataException();
        }

        double outerSquareSide = Math.sqrt(outerSquareArea);
        double innerSquareArea = Math.pow(outerSquareSide, 2) / 2;

        return outerSquareArea / innerSquareArea;
    }

    public Point searchPointNearestOrigin(Point firstPoint, Point secondPoint) throws ProjectInvalidDataException{
        ShapeValidator shapeValidator = new ShapeValidator();
        if (!shapeValidator.validatePoint(firstPoint) || !shapeValidator.validatePoint(secondPoint)){
            throw new ProjectInvalidDataException();
        }

        double firstPointHypotenuse = Math.hypot(firstPoint.getXCoordinate(), firstPoint.getYCoordinate());
        double secondPointHypotenuse = Math.hypot(secondPoint.getXCoordinate(), secondPoint.getYCoordinate());

        return firstPointHypotenuse < secondPointHypotenuse ? firstPoint : secondPoint;
    }

    public double calculateRoundCircumference(double radius) throws ProjectInvalidDataException{
        if (radius < 0){
            throw new ProjectInvalidDataException();
        }

        return 2 * Math.PI * radius;
    }

    public double calculateCircleArea(double radius) throws ProjectInvalidDataException{
        if (radius < 0){
            throw new ProjectInvalidDataException();
        }

        return Math.pow(radius, 2) * Math.PI;
    }
}