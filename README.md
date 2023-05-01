# 👤University Event Management🎉

This project is a University Event Management that allows users to manage events in university.

## Framework And Language used in Project
- Spring Boot 
- Java 

## Dependencies
- SpringWeb
- Spring Boot Dev Tools
- LomBok
- H2 Database
- Validation
- JPA

## Data Flow 
- In this project, We create four layers.
- **Controller** :- In controller layer we handle CRUD operatiom by http request.
- **Reposatory** :- In this layer data is stored. for storing data I have used H2 Database.
- **Service** :- The Service layer handles all business logics.
- **Models** :- This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored..
 
## Project Summery
The above project implements a UniversityEvent Management project in which the endpoints provided are:-
- Add student
- update student
- department
- delete student
- Get all students
- Get student by Id
- Add event
- Update event
- Delete event
- Get All events by date

Also we have added validation on below ->
- Validation on age(between 18 -25)
- First name(first letter should be capital)
- Department(datatype of variable department should be Enum and not string Enum should support department names line ME , ECE , civil , CSE).

