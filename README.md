# Spring Boot Quickstart

Just a practice app.

## Development

Start up a Docker image with Java to start working:

```
docker run -ti -v "$PWD":/usr/src/app -w /usr/src/app -p 8080:8080 openjdk:11 bash
```

To start the app:

```
./mvnw spring-boot:run
```
