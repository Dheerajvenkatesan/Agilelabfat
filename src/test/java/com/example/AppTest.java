package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testpay() {
        assertEquals("Payslip for Employee", App.payslip(1000));
    }

    @Test
    void testwages() {
        assertEquals("Daliy Wages", App.payslip(50000));
    }
}
