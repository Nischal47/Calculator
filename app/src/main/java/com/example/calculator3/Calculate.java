package com.example.calculator3;

public class Calculate {
    private double a, b, result;

    // Getter
    public double getA() {
        return this.a;
    }


    // Setter
    public double setA(String newNumber,boolean isdecimal) {
        String a;
        if (this.a == 0) {
            this.a = Double.parseDouble(newNumber);
            return this.a;
        } else {
            if (this.a == Math.floor(this.a) && isdecimal==true) {
                a = String.format("%.0f", this.a);


            } else if(this.a == Math.round(this.a * 10) / 10.0){
                a =  String.format("%.1f", this.a);

            }else {
                a = Double.toString(this.a);
            }
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
    public double setB(String newNumber,boolean isdecimal) {
        String b;
        if (this.b == 0) {
            this.b = Double.parseDouble(newNumber);
            return this.b;
        } else {
            if (this.b == Math.round(this.b) && isdecimal==true) {
                b =  String.format("%.0f", this.b);

            } else if(this.b == Math.round(this.b * 10) / 10.0){
                b = String.format("%.1f", this.a);

            }else {
                b = Double.toString(this.b);
            }
            b=b.concat(newNumber);
            this.b=Double.parseDouble(b);
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


    public void readData(String newNumber, boolean operator,boolean isdecimal) {
        if (operator == true) {

            setB(newNumber,isdecimal);


        } else {
            setA(newNumber,isdecimal);


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