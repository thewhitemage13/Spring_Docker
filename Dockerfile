# Используем официальный образ с Java
FROM openjdk:17-jdk-slim

# Указываем рабочую директорию
WORKDIR /app

EXPOSE 8080

# Копируем собранный JAR-файл в контейнер
COPY target/app.jar app.jar

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]
