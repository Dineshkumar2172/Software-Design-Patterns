############################# VIOLATION DESIGN #############################
class Bird:
    def fly(self):
        print("I can fly")

class Penguin(Bird):
    def fly(self):
        print("I can't fly")


############################# SOLUTION #############################

class Bird2:
    def fly(self): pass

class FlyingBird(Bird2):
    def fly(self):
        print("I can fly")

class NonFlyingBird(Bird2):
    def fly(self):
        print("I can't fly")

class Penguin2(NonFlyingBird):
    pass
