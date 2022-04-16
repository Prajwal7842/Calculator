import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final double epsilon = 1e-8;
    Calculator calObject = new Calculator();
    @org.junit.jupiter.api.Test
    void factorial() {
        long inputN = 5, expectedOutput = 120;
        assertEquals(expectedOutput, calObject.factorial(inputN), epsilon);
    }

    @org.junit.jupiter.api.Test
    void sqrt() {
        double inputN = 100.0, expectedOutput = 10.0;
        assertEquals(expectedOutput, calObject.sqrt(inputN), epsilon);

        inputN = 16.0; expectedOutput = 4.0;
        assertEquals(expectedOutput, calObject.sqrt(inputN), epsilon);
    }

    @org.junit.jupiter.api.Test
    void power() {
        long inputX = 5, inputY = 5, expectedOutput = 3125;
        assertEquals(expectedOutput, calObject.power(inputX, inputY), epsilon);
    }

    @org.junit.jupiter.api.Test
    void log() {
        double inputN = 100.0, expectedOutput = 4.60517018599;
        assertEquals(expectedOutput, calObject.log(inputN), epsilon);
    }
}
