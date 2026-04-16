package com.example;

public class App {
    public static String payslip(int num) {
        if (num >20000) {
            return "Payslip for Employee";
        } else {
            return "Daliy Wages";
        }
    }

    public static void main(String[] args) {
        System.out.println( "Payslip For Employee" + payslip(number));
    }
}
