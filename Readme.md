### Junit Test Cases Documentation

#### What is a test?
A test in Java is a small piece of code written to check if another piece of code (usually a method) works correctly.

#### Why do we need to test java methods?
- Catches Bugs Early	Fixing a bug in development is 10x cheaper than in production
- Prevents Regression	Old features won’t accidentally break when you change something
- Clarifies Intent	Tests show what the code is supposed to do
- Facilitates Refactoring	Refactor confidently when tests have your back
- Acts Like a Safety Net	Like airbags in a car. You don’t want to crash, but if you do…
- Enables Team Collaboration	Makes onboarding new devs easier — “just run the tests!”
- Improves Design	Code that's testable is usually better structured

#### What is test case?
A test case is a single scenario you want to verify about a method’s behavior.
A Good Test Case Has:
- Input(s): What data you're passing to the method
- Expected output: What you want the result to be
- Assertion: A line that checks if actual result == expected result

#### What is unit testing?
Testing individual methods or units of code in isolation.

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

    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.division(5, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
    
}
```


