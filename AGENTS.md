# AGENTS.md

Proyecto de prueba/learning. API REST "Hello World" con Spring Boot.

## Comandos

- Requiere Java 17 y Maven del sistema (no hay Maven wrapper). `JAVA_HOME` debe estar definido.
- JDK Linux (Temurin 17) instalado en `~/jdk17/jdk-17.0.20.1+1`. `~/.bashrc` exporta `JAVA_HOME` y añade su `bin` al `PATH`. Si `JAVA_HOME` no está definido en la sesión: `export JAVA_HOME=$HOME/jdk17/jdk-17.0.20.1+1`.
- Compilar/testear: `mvn test`
- Empaquetar: `mvn clean package` -> genera `target/hello-world-api-1.0.0.jar`
- Arrancar la API: `mvn spring-boot:run` (escucha en `http://localhost:8080`)
- Único endpoint: `GET /api/hello-world`

## Gotchas

- Los tests (`HelloWorldApplicationTest` y `HelloWorldControllerTest`) comparan el **body exacto** del endpoint. Cualquier cambio en el mensaje del controlador también debe actualizarse en ambos tests, o fallarán.
- No hay CI workflows, ni configuración de OpenCode, ni instrucciones previas.
- El remote es HTTPS `https://github.com/...`: `git push` requiere credenciales/autenticación configuradas en el entorno (p. ej. `gh auth`). El repo local inicialmente no tenía identidad de git configurada.