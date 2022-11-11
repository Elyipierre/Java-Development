public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea();
        System.out.println("The area of Triangle A is: " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("The area of Triangle B is: " + triangleBArea);

        //print out side length 3
        System.out.println(triangleA.sideLenThree);
        //print out triangle B's base
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);

        //the rule is that it is a function if it has parentheses and an attribute if it does not have parentheses


        //Triangle.findArea()? --> Math.pow(2,3)?
    }
}
/*
Review: Classes
- Classes help organize our code, they contain
attributes(also referred to as properties) and
behavior (also referred to as methods
- Every clas contains a constructor that can create instances of the class
- Ultimately, a class is just a blueprint and we have to use the constructor
in order to create triangles in our code

Instance variable and Methods:
- Some attributes are associated with each individual instance and we call these instance variables
- These were the height, base and side length attributes in our example
- These attributes are accessed with the instance itself, and we use the dot operator
to access the instance variables.
- Along with instance variables, each instance has functions or non-static methods
- Non-static instance methods access the instance variables in their implementation

Class Variables and Methods:
- Some attributes are associated with the whole class, and we call these class variables
- static class methods do not need an instance in order to be used, we just use the class name
 */