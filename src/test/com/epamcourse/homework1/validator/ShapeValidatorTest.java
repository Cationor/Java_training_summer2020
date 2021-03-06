package test.com.epamcourse.homework1.validator;

import com.epamcourse.homework1.entity.Point;
import com.epamcourse.homework1.validator.ShapeValidator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeValidatorTest {
    ShapeValidator shapeValidator;

    @BeforeTest
    public void setUp() {
        shapeValidator = new ShapeValidator();
    }

    @DataProvider(name = "pointPositiveData")
    public Object[][] createPositivePointData() {
        return new Object[][]{
                {new Point("A", 2, 5), true},
                {new Point("A", -5, 5), false},
                {null, false},
        };
    }

    @Test(dataProvider = "pointPositiveData")
    public void validatePointTestPositive(Point point, boolean expected) {
        boolean actual = shapeValidator.validatePoint(point);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "pointNegativeData")
    public Object[][] createNegativePointData() {
        return new Object[][]{
                {new Point("A", 2, 5), false},
                {new Point("A", -5, 5), true},
                {null, true},
        };
    }

    @Test(dataProvider = "pointNegativeData")
    public void validatePointTestNegative(Point point, boolean expected) {
        boolean actual = shapeValidator.validatePoint(point);
        assertNotEquals(actual, expected);
    }
}