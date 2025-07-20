class Author:
    def __init__(self, name: str, birth_year: int):
        self.name = name
        self.birth_year = birth_year
    
    def get_author_info(self) -> str:
        return f"{self.name} (born {self.birth_year})"
    

class Book:
    def __init__(self, book_title: str, publication_year: int, author: Author):
        self.book_title = book_title
        self.publication_year = publication_year
        self.author = author

    def get_book_info(self) -> str:
        return f"{self.book_title} by {self.author.get_author_info()}, published in {self.publication_year}"
    

author = Author("Shakespeare", 1850)
book = Book("romeo juliet", 1900, author)
print(book.get_book_info())
