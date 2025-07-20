# imports needed for abstract classes
from abc import ABC, abstractmethod

# interface contract: children will have to implement
# all abstract methods. In an interface methods have no
# implementation so we can use 'pass'

class MyInterface(ABC):
    @abstractmethod
    def my_method(self): pass

class MyClass(MyInterface):
    def my_method(self):
        print("my_method implementation in MyClass")

class AnotherClass(MyInterface):
    def my_method(self):
        print("my_method implementation in AnotherClass")


another_class = AnotherClass()
another_class.my_method()
