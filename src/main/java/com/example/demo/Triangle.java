package com.example.demo;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    /*public void createTriangle(){
        if (a<=0 || b<=0 || c<=0)
        System.out.println("Введите положительное значение");
        if (a + b > c|| b + c > a|| a + c > b){
            System.out.println("Введите положительное значение");
        }
        else {
            this.getA();
            this.getB();
            this.getC();
        }
    }*/
    public boolean examinationTriangle(){
        return a + b > c && b + c > a && a + c > b;
    }


}
