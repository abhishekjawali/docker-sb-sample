./mvnw install dockerfile:build

docker run -p 8080:8080 <<IMAGE-ID>>