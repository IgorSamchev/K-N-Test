package data;

public enum Calculators {
    run100(2, 3, 6),
    longJump(3, 4, 5),
    run1500(6, 7, 8);

    public double a;
    public double b;
    public double c;

    Calculators(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculate2() {
        return a * b * c;
    }

}

