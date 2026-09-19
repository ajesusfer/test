---
name: run-tests
description: Ejecuta los tests de este proyecto Spring Boot con Maven. Usar cuando el usuario pida correr/ejecutar/pasar los tests o verificar que el proyecto compila. Palabras clave: "tests", "test", "ejecutar tests", "correr tests".
---

# Run Tests

Proyecto Spring Boot (Maven, Java 17). No hay Maven wrapper: se usa el Maven del sistema (`mvn`).

## Comandos

- Todos los tests: `mvn test`
- Una clase de test concreta:
  ```
  mvn test -Dtest=HelloWorldControllerTest
  mvn test -Dtest=HelloWorldApplicationTest
  ```
- Un método concreto: `mvn test -Dtest=HelloWorldControllerTest#testHelloWorldEndpoint`

## Requisitos y gotchas

- `JAVA_HOME` debe estar definido (apuntando a un JDK 17) para que `mvn` funcione.
- Los tests comparan el **body exacto** del endpoint `GET /api/hello-world`. Si se cambia el mensaje en `HelloWorldController`, hay que actualizar la cadena en `HelloWorldApplicationTest` y `HelloWorldControllerTest`, o fallarán.
- Empaquetado (genera `target/hello-world-api-1.0.0.jar`): `mvn clean package`