# 🌱 springboot-service-starter

A clean and extensible Spring Boot template for building RESTful microservices with production-ready defaults. This
starter project is designed to kickstart development with best practices, reduced boilerplate, and maintainable
architecture.

## ✨ Features

- 📈 Spring Boot Actuator – Built-in health, metrics, and environment endpoints
- 📚 OpenAPI 3 (Swagger UI) – Interactive API documentation at /swagger-ui.html
- ✅ Spring Validation – Clean input validation with global error handling
- 🔁 MapStruct – Type-safe, compile-time DTO ↔ Entity mapping
- 🧹 Lombok – Reduces boilerplate, enables clean logging with @Slf4j
- 🚨 Global Exception Handling – Standardized error response structure
- 🧪 Testing Skeleton – With basic structure for unit and integration tests
- ⚙️ Profile-based Configuration – Local development with H2 database
- 🔄 Layered Architecture – DTO → Mapper → Service → Entity → Repository

## 🚀 Getting Started

### 🔧 Prerequisites

- Java 17+
- Gradle 7+
- IDE of your choice (IntelliJ IDEA recommended)

### ▶️ Run Locally

```bash
./gradlew bootRun
```

Access Swagger UI at: http://localhost:8080/swagger-ui.html
Access H2 Console at: http://localhost:8080/h2-console

### 🧪 Running Tests

```bash
./gradlew test
```

### 📦 API Response Wrapper

All responses follow a standard structure:

```json
{
  "status": "success",
  "data": {},
  "message": null
}
```

## 🧱 Built With

- Spring Boot 3
- Spring Web, Spring Validation
- Spring Data JPA + H2
- Lombok
- MapStruct
- OpenAPI / springdoc-openapi
- JUnit + MockMvc

## 📌 Future Enhancements (Optional)

- JWT-based Security Setup
- Docker + Compose Support
- Integration with MySQL or PostgreSQL
- Caching Layer
- Circuit Breaker Pattern using Resilience4j

_**Clone, customize, and go build awesome stuff 🚀**_

## Actuator Endpoints

- Health: http://localhost:8080/actuator/health
- Info: http://localhost:8080/actuator/info
- Metrics: http://localhost:8080/actuator/metrics
- Env: http://localhost:8080/actuator/metrics
- Loggers: http://localhost:8080/actuator/loggers

## OpenAPI Endpoints

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

## 🐳 Docker Usage

#### 🔨 Build Docker Image

```bash
./gradlew clean build

docker build -t springboot-service-starter .

docker build --platform linux/amd64 -t springboot-service-starter .
```

#### 🚀 Run the Docker Container

```bash
docker run -p 8080:8080 springboot-service-starter
```

#### 📦 Stop and Remove Container

```bash
docker ps        # to get container ID
docker stop <container-id>
docker rm <container-id>
```

#### 🧪 Verify it's running

Visit: [http://localhost:8080/actuator/health](http://localhost:8080/actuator/health)
Visit: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

