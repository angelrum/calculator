package model;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by vladimir on 07.02.2018.
 *
 * ApplicationScoped - действует на
 */

@Stateless
public class MathOperation {

    public Double calculate(Double val1, Double val2, Operation operation) {
        Double result = 0d;
        switch (operation) {
            case PLUS :
                result = val1 + val2;
                break;
            case DIV:
                result = val1 / val2;
                break;
            case MINUS:
                result = val1 - val2;
                break;
            case TIMES:
                result = val1 * val2;
        }
        return result;
    }

}
