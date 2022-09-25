package practice;

public class MathOps {

    double num;

    public MathOps(double num) {
        this.num = num;
    }

    public MathOps() {
        this(0);
    }

    public double result() {
        return this.num;
    }

    public MathOps set(double num) {
        this.num = num;
        return this;
    }

    public MathOps add(double num) {
        this.num += num;
        return this;
    }

    public MathOps subtract(double num) {
        this.num -= num;
        return this;
    }

    public MathOps mul(double num) {
        this.num *= num;
        return this;
    }


}
