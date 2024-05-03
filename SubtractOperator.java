import java.util.ArrayList;

public class SubtractOperator<T extends Number> implements Operator<T>{
    public final Class<T> type;

    public SubtractOperator(Class<T> type){
        this.type = type;
    }
    @Override
    public T operate(T firstNum, T secondNum){
        double result = firstNum.doubleValue() - secondNum.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
