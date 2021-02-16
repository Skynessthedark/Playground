# Library

##  Java Maven, Spring Boot, JPA, PostgreSQL, Docker, Heroku.

#### ![DB DIAGRAM](https://dbdiagram.io/d/602becd380d742080a3abef0)

#### AUTHOR
| URL | HTTP | FUNCTIONALITY |
|--|--|--|
| **'/authors'** | GET | Retrieve All Authors |
| **'/authors'** | POST | Create A New Author |
| **'/authors/{authorId}'** | GET | Retrieve An Author by ID |
| **'/authors/{authorId}'** | PUT | Update An Author by ID |
| **'/authors/{authorId}'** | DELETE | Delete An Author by ID|
| **'/authors/books/{authorId}'** | GET | Retrieve the Books of An Author by ID|

#### PUBLISHER
| URL | HTTP | FUNCTIONALITY |
|--|--|--|
| **'/publishers'** | GET | Retrieve All Publishers |
| **'/publishers'** | POST | Create A New Publisher |
| **'/publishers/{publisherId}'** | GET | Retrieve An Publisher by ID |
| **'/publishers/{publisherId}'** | PUT | Update An Publisher by ID |
| **'/publishers/{publisherId}'** | DELETE | Delete An Publisher by ID|
| **'/publishers/books/{publisherId}'** | GET | Retrieve the Books of An Publisher by ID|

#### BOOK
| URL | HTTP | FUNCTIONALITY |
|--|--|--|
| **'/books'** | GET | Retrieve All Books |
| **'/books'** | POST | Create A New Book |
| **'/books/{bookId}'** | GET | Retrieve A Book by ID |
| **'/books/{bookId}'** | PUT | Update An Author by ID |
| **'/books/{bookId}'** | DELETE | Delete An Author by ID|
