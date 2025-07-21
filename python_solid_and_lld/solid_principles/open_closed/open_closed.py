############################# VIOLATION DESIGN #############################
import math

class Circle:
    def __init__(self, radius):
        self.radius = radius

class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

class AreaCalculator:
    def area(self, shape):
        if isinstance(shape, Circle):
            return math.pi * shape.radius**2
        elif isinstance(shape, Rectangle):
            return shape.width * shape.height


############################# SOLUTION #############################

from abc import ABC, abstractmethod

class Shape:
    @abstractmethod
    def area(self): pass


class Circle2(Shape):
    def __init__(self, radius):
        self.radius = radius
    
    def area(self):
        return math.pi * self.radius**2

class Rectangle2(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height
    
    def area(self):
        return self.width * self.height

class AreaCalculator2:
    def area(self, shape: Shape):
        return shape.area()
