package ua.edu.viti.calculator;

/**
 * Class for calculator logic
 * Created by Ihor Dovhoshliubnyi on 3/16/18.
 */

public class CalculatorLogic {

    private double firstNum;
    private double secondNum;
    private char operator;
    private double result;

    public CalculatorLogic() {

        firstNum = 0.0;
        secondNum = 0.0;
        operator = ' ';
        result = 0.0;
    }

    public double operation(double first, double second, char operat) {

        firstNum = first;
        secondNum = second;
        operator = operat;

        switch (operator) {

            case '+': {
                try {
                    result = firstNum + secondNum;
                } catch (Exception e) {
                    result = Double.NaN;
                }
            }
            break;

            case '-': {
                try {
                    result = firstNum - secondNum;
                } catch (Exception e) {
                    result = Double.NaN;
                }
            }
            break;

            case '*': {
                try {
                    result = firstNum * secondNum;
                } catch (Exception e) {
                    result = Double.NaN;
                }
            }
            break;

            case '/': {
                try {
                    result = firstNum / secondNum;
                    if (secondNum == 0) {
                        result = Double.NEGATIVE_INFINITY;
                    }
                } catch (Exception e) {
                    result = Double.NaN;
                }
            }
            break;

            default:
                result = Double.NaN;
                break;
        }

        return result;
    }
}
