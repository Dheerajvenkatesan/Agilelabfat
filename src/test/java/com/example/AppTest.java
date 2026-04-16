package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testEven() {
        assertEquals("Payslip for Employee", App.payslip(1000));
    }

    @Test
    void testOdd() {
        assertEquals("Daliy Wages", App.payslip(50000));
    }
}
