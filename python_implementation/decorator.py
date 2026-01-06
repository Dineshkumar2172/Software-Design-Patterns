def timing_decorator(func):
    def wrapper(*args, **kwargs):
        print("started function call")
        result = func(*args, **kwargs)
        print("post function call")
        return result
    
    return wrapper

@timing_decorator
def samplefunction(name):
    print(f"My name is : {name}")


samplefunction("Dinesh")
