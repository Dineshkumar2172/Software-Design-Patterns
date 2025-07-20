from abc import ABC, abstractmethod

# abstract classes has both declaration and definition (implementation) of a methods

class Shape(ABC):
    
    def __init__(self, color: str):
        self.color = color

    @abstractmethod # declared but not implemented - done by child class
    def area(self): pass

    @abstractmethod # declared but not implemented - done by child class
    def perimeter(self): pass

    #  defined/implemented - @abstractmethod is not required
    def description(self):
        return f"{self.__class__.__name__} has the color {self.color}"


# class Circle(Shape):
#     def area(self):
#         print(f"implementation of circle specific area")
    
#     def perimeter(self):
#         print(f"implementation of circle specific perimeter")


class Rectangle(Shape):

    def __init__(self, width: float, height: float, color: str):
        super().__init__(color)
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height
    
    def perimeter(self):
        return 2 * (self.width + self.height)

# create instances of concrete class and use their methods
rectangle = Rectangle(23.4, 34.4, "red")
print(f"Reactangle area: {rectangle.area()}")
print(f"Reactangle perimeter: {rectangle.perimeter()}")
print(f"Reactangle description: {rectangle.description()}")
