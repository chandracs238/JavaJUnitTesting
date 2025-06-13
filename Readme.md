### Junit Test Cases Documentation

#### Claculator Project
This project demonstrates how to write and organize unit tests using JUnit 5 for a basic Calculator class in a Java application. Each arithmetic operation (add, sub, multiply, division) is individually tested using isolated test cases.

```java 
public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int division(int a, int b){
        return a / b;
    }
}
```

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;
    int a, b;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        a = 5;
        b = 5;
    }

    @Test
    void testAdd() {
        int result = calculator.add(a, b);
        assertEquals(10, result);
    }

    @Test
    void testSub() {
        int result = calculator.sub(a, b);
        assertEquals(0, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(a, b);
        assertEquals(25, result);
    }

    @Test
    void testDivision() {
        int result = calculator.division(a, b);
        assertEquals(1, result);
    }
}
```
