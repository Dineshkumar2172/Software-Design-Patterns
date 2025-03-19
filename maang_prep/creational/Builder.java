package maang_prep.creational;

class Car {
    private final String engine;  // Mandatory
    private final int wheels;     // Mandatory
    private String color;         // Optional
    private boolean sunroof;      // Optional

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
    }

    public static class CarBuilder {
        private final String engine;
        private final int wheels;
        private String color = "White";  // Default value
        private boolean sunroof = false; // Default value

        public CarBuilder(String engine, int wheels) { // Constructor with mandatory params
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this; // Method chaining
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", sunroof=" + sunroof + "]";
    }
}


public class Builder {
    // reference - https://www.youtube.com/shorts/MN6dRSW-VgQ?feature=share
    // reference - https://youtu.be/MaY_MDdWkQw
    // 
    // when to use builder design pattern?
    // 1. whenever you see there's a lot of fields in a particular class like there are 50 or more than that.
    //    but we need to make use of only certain fields in a logic - so we create multiple n number of constuctors within class with different set of parameters which will become hard to maintain or undertand which constructor to use.
    // 2. here we can make use of builder design pattern - this pattern allows step-by-step construction of complex objects by separating representation and object creation.

    // from course:
    // When an object requires many parameters, especially optional ones, the constructor can become hard to use or maintain. This issue can lead to:
    //      1. Long constructor parameter lists.
    //      2. Difficulty in understanding which values are optional or required.
    //      3. Lack of flexibility when it comes to setting only some values.
    // This pattern help us in separate the construction of an object from its representation, offering a fluent interface for creating complex objects.

    // chatgpt:
    // How It Works:
    //     The constructor of the Builder class requires only the mandatory parameters.
    //     The optional parameters are set using fluent setter methods.
    //     Finally, the build() method constructs the object.

    public static void main(String[] args) {
        // note:
        //      1. The constructor in CarBuilder accepts only mandatory parameters.
        //      2. Optional parameters are set using setter methods.
        //      3. The build() method constructs the final object.
        Car car = new Car.CarBuilder("v8", 4)
                        .setColor("red")
                        .setSunroof(true)
                        .build();

        System.out.println(car);
    }
}
