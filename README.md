# Spring Boot JWT Authentication and User Signup Example

This Spring Boot project demonstrates user authentication using JWT tokens. Users can obtain a JWT token by authenticating with their credentials and then use the token to access protected endpoints. Additionally, users can sign up to create a new account.

## Getting Started

### Prerequisites

Make sure you have the following installed:

- [Java JDK 11](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

### Clone the Project

1. Open your terminal.

2. Clone the repository:

    ```bash
    git clone https://github.com/thisisme-shivam/rest-api-demo.git
    ```

3. Navigate to the project folder:

    ```bash
    cd rest-api-demo
    ```

4. Build and run the application:

    ```bash
    mvn clean install
    java -jar target/spring-boot-jwt-auth.jar
    ```

## Usage

### Authenticate and Get JWT Token (Login)

To obtain a JWT token, use the following command:

```bash
curl -X POST \
  http://localhost:8081/api/auth/authenticate \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "your-username",
    "password": "your-password"
  }'
  ```

### Signup and Create a New User (Signup)

To obtain a JWT token, use the following command:

```bash
curl -X POST \
  http://localhost:8081/api/auth/signup \
  -H 'Content-Type: application/json' \
  -d '{
    "username": "new-username",
    "password": "new-password",
    "email": "new-email@example.com",
    "phone": "1234567890"
  }'
```

### Hello 

To obtain a JWT token, use the following command:

```bash
curl -X GET \
  http://localhost:8081/api/hello \
  -H 'Authorization: Bearer YOUR_JWT_TOKEN'


```
