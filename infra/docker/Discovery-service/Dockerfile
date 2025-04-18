FROM openjdk:17-jdk-slim

# Instala bash y curl
RUN apt-get update \
 && apt-get install -y bash curl \
 && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copia los scripts comunes
COPY infra/docker/Discovery-service/wait-for-it.sh wait-for-it.sh
COPY infra/docker/Discovery-service/entrypoint.sh entrypoint.sh

# Copia el JAR correcto generado sin versión ni sufijo
COPY build/libs/discovery-service.jar app.jar

RUN chmod +x wait-for-it.sh entrypoint.sh

EXPOSE 8761

ENTRYPOINT ["bash", "entrypoint.sh"]