# RBPO-BAS2402 — Лабораторная работа 1

Разработка безопасного программного обеспечения. Задание 1 — подготовка репозитория.

## Стек

- Java 21
- Spring Boot 3.5.16
- Maven (вместе с Maven Wrapper — установленный `mvn` не требуется)

## Запуск

```bash
./mvnw spring-boot:run
```

Приложение поднимается на `http://localhost:8080`.

Сборка исполняемого jar и запуск тестов:

```bash
./mvnw clean verify
java -jar target/rbpo-lab1-0.0.1-SNAPSHOT.jar
```

## Эндпоинты

### `GET /api/student`

Информация о студенте.

```bash
curl http://localhost:8080/api/student
```

```json
{
  "name": "Георгий",
  "age": 20,
  "university": "МТУСИ",
  "studentId": "1БАС24015"
}
```

### `GET /api/lab`

Информация о лабораторной работе.

```bash
curl http://localhost:8080/api/lab
```

```json
{
  "number": 1,
  "title": "Подготовка репозитория",
  "subject": "РБПО",
  "applicationName": "1БАС24015"
}
```

## Конфигурация

`src/main/resources/application.yml`:

```yaml
spring:
  application:
    name: 1БАС24015
```

В `spring.application.name` указан номер студенческого билета.
