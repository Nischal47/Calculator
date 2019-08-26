package com.example.calculator3;

public class Calculate {
    private double a, b, result;

    // Getter
    public double getA() {
        return this.a;
    }


    // Setter
    public double setA(String newNumber) {
        String a;
        if (this.a == 0) {
            this.a = Double.parseDouble(newNumber);
            return this.a;
        } else {
            a=Double.toString(this.a);
            a=a.concat(newNumber);
            this.a=Double.parseDouble(a);
            return this.a;
        }
    }

    // Getter
    public double getB() {
        return this.b;
    }

    // Setter
    public double setB(String newNumber) {
        String b;
        if (this.b == 0) {
            this.b = Double.parseDouble(newNumber);
            return this.b;
        } else {
            b=Double.toString(this.b);
            b=b.concat(newNumber);
            this.a=Double.parseDouble(b);
            return this.b;
        }
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(char operator) {
        double c;
        switch (operator) {

            case '+':

                c = getA() + getB();
                this.result = c;
                this.a = c;
                this.b=0;
                break;
            case '-':

                c = getA() - getB();
                this.result = c;
                this.a = c;
                this.b=0;
                break;
            case '*':

                c = getA() * getB();
                this.result = c;
                this.a = c;
                this.b=0;
                break;
            case '/':

                c = getA() / getB();
                this.result = c;
                this.a = c;
                this.b=0;
                break;
            default:
                break;
        }
    }


    public void readData(String newNumber, boolean operator) {
        if (operator == true) {

            setB(newNumber);


        } else {
            setA(newNumber);


        }

    }

    public String showData(boolean operator, boolean isEqual) {
        double a, b, result;
        if (isEqual == false) {
            if (operator == true) {
                b = getB();
                if (b==Math.floor(b)) {

                    return Integer.toString((int) Math.round(b));
                } else {
                    return Double.toString(b);
                }
            } else {
                a = getA();
                if (a==Math.floor(a)) {

                    return Integer.toString((int) Math.round(a));
                } else {
                    return Double.toString(a);
                }
            }
        } else {
            result = getResult();
            if (result == Math.floor(result)) {

                return Integer.toString((int) Math.round(result));
            } else {
                return Double.toString(result);
            }
        }
    }

    public void clear() {
        this.a = 0;
        this.b = 0;
        this.result = 0;
    }
}
