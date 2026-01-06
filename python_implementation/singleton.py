import threading

class SingletonClass:
    _instance = None
    _lock = threading.Lock()

    def __new__(cls, *args, **kwargs):
        if cls._lock:
            with cls._lock:
                if not cls._instance:
                    cls._instance = super().__new__(cls)

        return cls._instance


a = SingletonClass()
b = SingletonClass()

print(a is b)
