package com.example.calculator3;

public class Calculate {
    private double a = 0, b = 0;

    // Getter
    public double getA() {
        return this.a;
    }


    // Setter
    public void setA(String newNumber) {
        this.a = Double.parseDouble(newNumber);
    }

    // Getter
    public double getB() {
        return this.b;
    }

    // Setter
    public void setB(String newNumber) {
        this.b = Double.parseDouble(newNumber);
    }


    public void setResult(char operator) {
        switch (operator) {
            case '+':
                this.a = getA() + getB();
                break;
            case '-':
                this.a = getA() - getB();
                break;
            case '*':
                this.a = getA() * getB();
                break;
            case '/':
                this.a = getA() / getB();
                break;
            default:
                break;
        }
    }


    public void readData(String newNumber, Boolean isOperator) {
        if (isOperator == false) {
            setA(newNumber);
        } else {
            setB(newNumber);
        }
    }

    public String showData() {

        if (getA() == Math.floor(getA())) {

            return Integer.toString((int) Math.round(a));
        } else {
            return Double.toString(a);
        }
    }

    public void clear() {
        this.a = 0;
        this.b = 0;
    }

    public String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}