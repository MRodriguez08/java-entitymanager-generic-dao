# java-entitymanager-generic-dao
This is a small project that uses generic daos to acces data. In this implementation we use the Spring Framework ORM EntityManager using a preconfigured dataSource to implement basic operations such as insert, update, delete and retreive entities from database.
The main advantage of this implementations is that, since this dao is implemented using Java Generics, we only must provide the entity type managed, and the primary key type. By doing this we have acces to parametrized data operations without having to write single line of code.
Note that the main goal of this is code reusage, a nice practice in every language :). 

## Technologies stack
This example uses:
* Spring Boot Framework (a main class implementing CommandLineRunner)
* Spring Transaction management + Spring JDBC
* Postgresql Database 9.2
* Apache Log4J
