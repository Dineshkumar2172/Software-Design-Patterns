from abc import ABC, abstractmethod

####################### Observer and Publisher Template #######################

class Observer(ABC):
    @abstractmethod
    def update(self, subject):
        pass

class Subject:
    def __init__(self):
        self._observers = []
        
    def subscribe(self, observer: Observer):
        self._observers.append(observer)
        
    def withdraw(self, observer: Observer):
        self._observers.remove(observer)
    
    def notify(self):
        for observer in self._observers:
            observer.update(self)


####################### Implementation #######################

class TemperatureSensor(Subject):
    def __init_(self):
        super().__init__()
        self._temperature = None
        
    def set_temperature(self, value):
        self._temperature = value
        self.notify()
        
    def get_temperature(self):
        return self._temperature

class Display(Observer):
    def update(self, subject):
        print(f"Display updated: {subject.get_temperature()} degrees")

class Logger(Observer):
    def update(self, subject):
        print(f"Logger updated: {subject.get_temperature()} degrees")

sensor = TemperatureSensor()

display = Display()
logger = Logger()

sensor.subscribe(display)
sensor.subscribe(logger)

sensor.set_temperature(10)
sensor.set_temperature(20)




