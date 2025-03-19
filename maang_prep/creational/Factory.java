package maang_prep.creational;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("drawing circle"); }
}

class Square implements Shape {
    public void draw() { System.out.println("drawing square"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("drawing rectangle"); }
}

// Factory - encapsulating the shipping process
class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
    }
}

public class Factory {
    // how to identify the use cases of factorty design pattern?
    //      1. Whenever we are creating objects that has similar behaviour or closely related, we can use factory pattern.
    //      2. For example: In swiggy and zomato, when we are creating orders - orders can be of type DINE IN, TAKEOUT OR DELIVERY. (Decision need to be taken during runtime)
    //      3. We can encapsulate the creation pattern using factory design pattern. It can be applied for creation of restaurant as well, as restaurant can be of type fast food chain, fine dining or cafes.
    //      4. we can use it on the creation of rides on the Uber or Ola as well, where rides can be of solo ride or share ride or luxury ride.
    //      5. In any application, by creating the shipping object, now this shipping object can be of the type standard shipping, express shipping, international shipping - and encapsulate the shipping process.
    

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
