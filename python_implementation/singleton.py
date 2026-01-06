import threading

class SingletonClass:
    _instance = None
    _lock = threading.Lock()
    _initialized = False

    def __new__(cls, *args, **kwargs):
        if cls._lock:
            with cls._lock:
                if not cls._instance:
                    """
                    super().__new__(cls) calls the parent class's __new__ method, usually object.__new__, 
                    which allocates memory and returns a new instance of the class while respecting Python's MRO.
                    
                    what do you mean by parent class, I'm not inheriting anything here....
                    ans: Even if you don’t explicitly inherit from anything, every Python class automatically inherits from object
                    """
                    cls._instance = super().__new__(cls)

        return cls._instance

    def __init__(self, start):
        # what if we wanna prevent initialization
        # once first object is created. No further
        # initialization should go through
        if not self._initialized:
            self.value = start
            self._initialized = True

    def __str__(self):
        return str(self.value)

    def increment(self):
        self.value += 1

a = SingletonClass(1)
b = SingletonClass(10)

b.increment()
b.increment()
b.increment()

print(f"a is {a}")
print(f"b is {b}")
