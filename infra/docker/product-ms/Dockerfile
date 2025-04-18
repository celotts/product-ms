FROM openjdk:17-jdk-slim

# Instala bash y curl en una sola capa limpia
RUN apt-get update \
 && apt-get install -y bash curl \
 && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# 🔁 Copia los scripts primero
COPY infra/docker/product-ms/wait-for-it.sh wait-for-it.sh
COPY infra/docker/product-ms/entrypoint.sh entrypoint.sh
RUN chmod +x wait-for-it.sh entrypoint.sh



# 📦 Copia el .jar generado por Maven
COPY build/libs/product-ms.jar app.jar

EXPOSE 8085
ENTRYPOINT ["bash", "entrypoint.sh"]
# 🔕 No pongas ENTRYPOINT aquí si lo defines en docker-compose