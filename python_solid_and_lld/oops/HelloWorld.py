class Greetings:

    name = None # class variable - access by all instances

    def __init__(self, name):
        Greetings.name = name # initialising class variable
        self.instance_name = name # initialising instance variable

    def say_hello(self):
        print(f"Hello {Greetings.name}! -  from class variable")
        print(f"Hello {self.instance_name}! - from instance variable", end='\n\n')

    def update_abstract_name(self, name: str):
        self.__abstract_name = name


class Author:
    def __init__(self, name, birth_year):
        self.name = name
        self.birth_year = birth_year

    def get_author_info(self) -> str:
        return f"{self.name} (born {self.birth_year})"


class Book:
    def __init__(self, title, pub_year, author: Author):
        self.title = title
        self.pub_year = pub_year
        self.author = author
    
    def get_book_info(self) -> str:
        return f'{self.title} by {self.author.get_author_info()}, published in {self.pub_year}'


if __name__ == "__main__":
    greetDinesh = Greetings("Dinesh")
    print("before updating class variable")
    greetDinesh.say_hello()

    print("after updating class variable")
    Greetings("Random Person")
    greetDinesh.say_hello()
    
    print("after updating class variable - 2nd time directly using class")
    Greetings.name = "random person 2"
    greetDinesh.say_hello()

    greetDinesh.update_abstract_name("asldkfjl")
    # print(greetDinesh.__abstract_name) # this will raise an error
    print(greetDinesh._Greetings__abstract_name)


    author = Author("James", "23.3.1978")
    book = Book("all is well", 2000, author)
    print(book.get_book_info())
