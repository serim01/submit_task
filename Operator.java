public interface Operator<T extends Number> {
    T operate(T num1, T num2) throws BadInputException;
}
