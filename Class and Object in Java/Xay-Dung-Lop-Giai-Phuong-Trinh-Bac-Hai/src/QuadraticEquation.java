public class QuadraticEquation {
    private double heSoA;
    private double heSoB;
    private double heSoC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double heSoA, double heSoB, double heSoC) {
        this.heSoA = heSoA;
        this.heSoB = heSoB;
        this.heSoC = heSoC;
    }

    public double getHeSoA() {
        return heSoA;
    }

    public double getHeSoB() {
        return heSoB;
    }

    public double getHeSoC() {
        return heSoC;
    }

    public void setHeSoA(double heSoA) {
        this.heSoA = heSoA;
    }

    public void setHeSoB(double heSoB) {
        this.heSoB = heSoB;
    }

    public void setHeSoC(double heSoC) {
        this.heSoC = heSoC;
    }

    public double getDiscriminant() {
        return Math.pow(heSoB, 2) - 4 * heSoA * heSoC;
    }

    public double getRoot1() {
        return (-heSoB + Math.sqrt(getDiscriminant())) / (2 * heSoA);
    }

    public double getRoot2() {
        return (-heSoB - Math.sqrt(getDiscriminant())) / (2 * heSoA);
    }
}
