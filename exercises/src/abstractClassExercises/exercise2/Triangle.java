package abstractClassExercises.exercise2;

public class Triangle extends Shape {

    private double bs;
    private double ltS;
    private double rtS;

    public Triangle(double bs, double ltS, double rtS) {

        // Base
        this.bs = bs;
        
        // Left side 
        this.ltS = ltS;
        
        // Right side
        this.rtS = rtS;
    }

    // Get and set of every instance
    public double getBs() {
        return bs;
    }

    public void setBs(double bs) {
        this.bs = bs;
    }

    public double getLtS() {
        return ltS;
    }

    public void setLtS(double ltS) {
        this.ltS = ltS;
    }

    public double getRtS() {
        return rtS;
    }

    public void setRtS(double rtS) {
        this.rtS = rtS;
    }

    // Method for calculate triangle's height 
    private double getHeight() {
        return (rtS + ltS) / bs;
    }

    // Method for calculate triangle's area
    @Override
    public double calculateArea() {
        return (bs * getHeight()) / 2;
    }

    // Method for calculate triangle's perimeter
    @Override
    public double calculatePerimeter() {
        return rtS * ltS * bs;
    }

}
