import java.util.ArrayList;

public class AddOperator<T extends Number> implements Operator<T>{
    public final Class<T> type;

    public AddOperator(Class<T> type){
        this.type = type;
    }
    @Override
    public T operate(T firstNum, T secondNum){
        double result = firstNum.doubleValue() + secondNum.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
