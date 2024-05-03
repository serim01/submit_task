public class DivideOperator<T extends Number> implements Operator<T>{
    public final Class<T> type;

    public DivideOperator(Class<T> type){
        this.type = type;
    }
    @Override
    public T operate(T firstNum, T secondNum) throws BadInputException {
        if(secondNum.doubleValue() == 0 ){
            throw new BadInputException("나눗셈에서 분모에 0이 들어올 수 없습니다.");
        }
        double result = firstNum.doubleValue()/secondNum.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
