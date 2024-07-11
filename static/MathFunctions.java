public class MathFunctions {
    private static double pi = 3.14;
    private static double e = 2.71;

    private double radius;

    public MathFunctions() {
    }
    public MathFunctions(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double square(int radius){
        System.out.println(pi*radius*radius);
        return 0;
    }
    public double square(double radius){
        System.out.println(pi*radius*radius);
        return 0;
    }





}
