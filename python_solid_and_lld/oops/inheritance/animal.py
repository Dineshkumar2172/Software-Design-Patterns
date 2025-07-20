# parent class - base class
class Animal:
    def __init__(self, name: str):
        self.name = name
    
    def speak(self) -> None:
        print(f"{self.name} makes a sound")


# child class - sub class
class Dog(Animal): # inheriting animal class
    # overriding speak method from parent class
    def speak(self) -> None:
        print(f"{self.name} barks")

# child / sub class 2
class Cat(Animal):
    def speak(self) -> None:
        print(f"{self.name} meows")

dog = Dog("buddy")
cat = Cat("whisker")

dog.speak()
cat.speak()

