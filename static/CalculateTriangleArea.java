public class CalculateTriangleArea {
    private double sideA;
    private double sideB;
    private double sideC;

    public CalculateTriangleArea() {
    }

    public CalculateTriangleArea(double sideA, double sideB, double sideC) {
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

    public double squareOfTriangle(double sideA, double sideB, double sideC){
        double p = (sideA+sideB+sideC)/2; //yarim perimetr formulasu bu
        System.out.println(Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)));
        return 0;
    }


    public String toString(){
        return "Uchburchak o'lchlari = {sideA = "+sideA+", sideB = "+sideB+", sideC = "+sideC+"}";
    }
}
