package com.example.task03;

public class ComplexNumber {
    public double ImagUnit;
    public double RealNumber;

    public ComplexNumber(double imagUnit, double realNumber) {
        this.ImagUnit = imagUnit;
        this.RealNumber = realNumber;
    }

    public ComplexNumber Sum(ComplexNumber number) {
        double imag = this.ImagUnit + number.ImagUnit;
        double real = this.RealNumber + number.RealNumber;
        return new ComplexNumber(imag, real);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double real = this.RealNumber * number.RealNumber + this.ImagUnit + number.ImagUnit;
        double imag = this.RealNumber * number.ImagUnit + this.ImagUnit * number.RealNumber;
        return new ComplexNumber(imag, real);
    }

    @Override
    public String toString() {
        return String.format("%f %f", ImagUnit, RealNumber);
    }
}