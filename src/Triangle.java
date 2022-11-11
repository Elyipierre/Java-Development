public class Triangle {
    //We will add a static variable to our triangle class
    static int numOfSides = 3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //create a constructor and then our inputs
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
    //use inputs to assign values to our attributes
        this.base = base;
        this.height =  height;
        this.sideLenOne = sideLenOne;
         this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
