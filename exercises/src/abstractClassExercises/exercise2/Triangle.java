package abstractClassExercises.exercise2;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }



    public void setSideA(double sideA) {
        this.sideA = sideA;
    }



    public double getSideB() {
        return sideB;
    }



    public void setSideB(double sideB) {
        this.sideB = sideB;
    }



    public double getSideC() {
        return sideC;
    }



    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }

    @Override
    public double calculateArea() {
        double semiP = (sideA + sideB + sideC)/2;
        return Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
    }
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


}
