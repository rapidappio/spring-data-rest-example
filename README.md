##  Effortless REST API Development with Spring Data REST and PostgreSQL
This is the project demonstrating how to build a low-code REST API with Spring Data REST

### Requirements
- PostgreSQL database

### How to run
1. `export SPRING_DATASOURCE_URL=...` The format should be `url: jdbc:postgresql://host:port/db_name?sslmode=require&application_name=spring-data-rest-example`. You can easily create PostgreSQL database for free [here](https://rapidapp.io)
2. `export SPRING_DATASOURCE_USERNAME=...`
3. `export SPRING_DATASOURCE_PASSWORD=...`
3. `./mvnw spring-boot:run`
