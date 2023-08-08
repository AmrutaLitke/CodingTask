Speaking Clock
The Speaking Clock project is a simple application that converts the current time into words. It allows users to input the time in a 24-hour clock format and receive the corresponding time in words.

Technologies Used
Java 8
Spring Boot
Maven
Swagger
Prerequisites
Java 8 or higher installed on your machine
Maven included in the project
Getting Started
Follow the steps below to get started with the Speaking Clock project:

Clone the repository:

git clone https://github.com/
Navigate to the project directory:

cd speaking-clock
Build the project using the Gradle Wrapper:

./gradlew build
Run the application:

./gradlew bootRun
Access the application:

Open a web browser and go to http://localhost:8080

API Endpoints
The Speaking Clock project provides the following API endpoints:

GET /convert: Converts the given time in a 24-hour clock format to words.
Request Parameter:
time: The time to convert (e.g., "08:34").
Example: GET /convert?time=08:34
Documentation
The project uses Swagger for API documentation. You can access the Swagger documentation by opening the following URL in your web browser: http://localhost:8080/swagger-ui.html

Author
Amruta Litke

Acknowledgments
We would like to acknowledge the following resources and libraries that were used in the development of the Speaking Clock project:

Java8
Spring Boot
Swagger

