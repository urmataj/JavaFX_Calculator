package com.example.javafx_calculator;

/**
 * Represents a calculator.
 *
 * @author Urmatai Toktosunova
 * @version 1.0
 * @since 2023-10-30
 */
public class Calculator {
    private double op1;
    private double op2;
    private char operator;
    private double result;

    /**
     * Gets the first operand.
     *
     * @return A double representing the operand1.
     */
    public double getOp1() {
        return op1;
    }

    /**
     * Sets the first operand.
     */
    public void setOp1(double op1) {
        this.op1 = op1;
    }

    /**
     * Gets the second operand.
     *
     * @return A double representing the second operand.
     */
    public double getOp2() {
        return op2;
    }

    /**
     * Sets the second operand.
     */
    public void setOp2(double op2) {
        this.op2 = op2;
    }

    /**
     * Gets the arithmetic operator.
     *
     * @return A char representing the arithmetic operator.
     */
    public char getOperator() {
        return operator;
    }

    /**
     * Sets the arithmetic operator.
     */
    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * Gets the result.
     *
     * @return A double representing the result.
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the result.
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Performs the calculation.
     */
    public void calculate() {
        if(this.operator == '+') {
            this.result = this.op1 + this.op2;
        }
        if(this.operator == '-') {
            this.result = this.op1 - this.op2;
        }
        if(this.operator == '*') {
            this.result = this.op1 * this.op2;
        }
        if(this.operator == '/') {
            this.result = this.op1 / this.op2;
        }
    }
}
