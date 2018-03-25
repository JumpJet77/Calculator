package ua.edu.viti.calculator;

/**
 * Created by Ihor Dovhoshliubnyi on 3/22/18.
 */

public class ConverterLogic {

    public Double convert(double value, int flag) {
        Double returnValue;
        switch (flag) {
            case 0: {
                returnValue = value * 0.453592;
                break;
            }
            case 1: {
                returnValue = value * 2.20462;
                break;
            }
            case 2: {
                returnValue = value * 0.3048;
                break;
            }
            case 3: {
                returnValue = value * 3.28084;
                break;
            }
            case 4: {
                returnValue = value * -272.15;
                break;
            }
            case 5: {
                returnValue = value * 274.15;
                break;
            }
            default:
                return Double.POSITIVE_INFINITY;
        }
        return returnValue;
    }
}
