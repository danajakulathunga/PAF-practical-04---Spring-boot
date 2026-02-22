# IT23288430 - PAF Practical 04: Spring Boot REST API

## Project Overview

This is a Spring Boot REST API application developed for the **IT3030 – PAF (Platform and Application Framework) Practical 04** assignment. The application demonstrates basic REST endpoint creation and handling HTTP requests using Spring Boot.

**Student ID:** IT23288430

## Technologies Used

- **Framework:** Spring Boot 4.0.3
- **Java Version:** Java 17
- **Build Tool:** Maven
- **Language:** Java

## Prerequisites

Before running this application, ensure you have the following installed on your system:

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.6.0 or higher
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code (optional but recommended)

## Installation & Setup

1. **Clone or download the project** to your local machine.
2. **Navigate to the project directory:**

   ```bash
   cd IT23288430
   ```
3. **Build the project** using Maven:

   ```bash
   mvn clean install
   ```

## Running the Application

### Using Maven

Run the following command to start the Spring Boot application:

```bash
mvn spring-boot:run
```

### Using Java Command

Alternatively, you can build and run using:

```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

The application will start on **http://localhost:8080** by default.

## API Endpoints

The application provides the following REST endpoints:

### 1. Basic Greeting Endpoint

- **URL:** `http://localhost:8080/greet`
- **Method:** GET
- **Description:** Returns a generic welcome message
- **Response:**
  ```
  Have a Nice Day. Welcome to Spring Boot Project!
  ```

### 2. Greeting with Name (Path Variable)

- **URL:** `http://localhost:8080/greet/{name}`
- **Method:** GET
- **Description:** Returns a personalized greeting with the provided name
- **Path Parameter:** `name` - The name to include in the greeting
- **Response Example:**
  ```
  Hello Dhanaja! Welcome to Spring Boot Project!
  ```

### 3. Greeting with Name and Message (Path Variable + Query Parameter)

- **URL:** `http://localhost:8080/greet/{name}?message={message}`
- **Method:** GET
- **Description:** Returns a personalized greeting with the provided name and custom message
- **Path Parameter:** `name` - The name to include in the greeting
- **Query Parameter:** `message` - Custom message to append (optional)
- **Response Example:**
  ```
  Hello Dhanaja! Hiiii!
  ```

## Usage Examples

Using **curl** command:

```bash
# Endpoint 1: Basic greeting
curl http://localhost:8080/greet

# Endpoint 2: Greeting with name
curl http://localhost:8080/greet/Dhanaja

# Endpoint 3: Greeting with name and message
curl http://localhost:8080/greet/Dhanaja?message=Hiiii!
```

Or simply visit these URLs in your web browser:

- http://localhost:8080/greet
- http://localhost:8080/greet/Dhanaja
- http://localhost:8080/greet/Dhanaja?message=Hiiii!

## Project Structure

```
IT23288430/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── IT23288430_Practical_04.java    # Main REST controller
│   │   │       └── demo/
│   │   │
│   │   └── resources/
│   │
│   └── test/
│
├── pom.xml                                          # Maven configuration
├── mvnw                                             # Maven wrapper (Linux/Mac)
├── mvnw.cmd                                         # Maven wrapper (Windows)
└── README.md                                        # This file
```

## Key Features

- **Simple REST API:** Demonstrates basic REST endpoint creation
- **Path Variables:** Shows how to extract parameters from URL path
- **Query Parameters:** Demonstrates optional query parameter handling
- **Spring Boot:** Uses Spring Boot for rapid development and minimal configuration

## Configuration

The application uses default Spring Boot settings. To customize the port or other settings, edit `src/main/resources/application.properties`:

```properties
# Change server port if needed
server.port=8080
```

## Dependencies

The project uses the following main dependencies:

- `spring-boot-starter-web` - Spring Web MVC starter for building web applications
- `spring-boot-starter-test` - Testing support for Spring Boot applications

## Troubleshooting

### Port Already in Use

If port 8080 is already in use, you can change it by modifying `application.properties`:

```properties
server.port=9090
```

### Maven Build Issues

If you encounter build issues, try:

```bash
mvn clean install
```

### Java Version Mismatch

Ensure you have Java 17 installed. Check your Java version:

```bash
java -version
```

## Author

**Student ID:** IT23288430
**Course:** IT3030 – Platform and Application Framework
**Academic Institution:** SLIIT (Sri Lanka Institute of Information Technology)

## License

This project is created for educational purposes as part of the PAF practical assignment.

---

**Last Updated:** February 2026
