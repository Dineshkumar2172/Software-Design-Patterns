class Singleton:
    # class variable to store single class instance
    _instance = None

    # override the init method to control initialisation
    def __init__(self):
        # raise an error to prevent controller initialization
        raise RuntimeError("Call instance() instead")

    @classmethod # staticmethod makes a method attached to class instead of instance
    def get_instance(cls): # for class methods, we pass the reference to class itself instead of instance reference self. we could use different terms as well, it's just for readability
        if cls._instance == None: # NOTE: lazy initialisation
            # create new instance of the class
            cls._instance = cls.__new__(cls)
        
        return cls._instance
    
singleton = Singleton.get_instance()
