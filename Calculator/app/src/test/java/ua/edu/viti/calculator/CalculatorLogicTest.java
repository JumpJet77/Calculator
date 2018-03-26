package ua.edu.viti.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ihor Dovhoshliubnyi on 3/26/18.
 */
public class CalculatorLogicTest {
    @Test
    public void operation() throws Exception {
        CalculatorLogic calculatorLogic = new CalculatorLogic();
        assertEquals(4, calculatorLogic.operation(2, 2, '+'), 0);
        assertEquals(0, calculatorLogic.operation(2, 2, '-'), 0);
        assertEquals(4, calculatorLogic.operation(2, 2, '*'), 0);
        assertEquals(1, calculatorLogic.operation(2, 2, '/'), 0);

    }

}