import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculator(){
        // here singleton will suit, since a single instance will suffice every addition.
        calculator.setOperator(new AdditionBehavior());
        Assertions.assertEquals(11, calculator.calculate(10, 1), "Need to check y addition went wrong!");
        calculator.setOperator(new ModuloBehavior());
        Assertions.assertEquals(0, calculator.calculate(10, 1), "Need to check y modulo went wrong!");
    }
    // strategy says at run time I want to change the behavior at RUNTIME
    // factory wants to get different instances with a base interface/ abstraction
}
