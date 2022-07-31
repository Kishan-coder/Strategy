public class Calculator {
    OperationBehavior operator;

    public void setOperator(OperationBehavior operator) {
        this.operator = operator;
    }

    public int calculate(int a, int b){
        return operator.operate(a, b);
    }
}
