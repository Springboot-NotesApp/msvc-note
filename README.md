## Maven:
***
### Compilación del Proyecto:
1. Para compilar el proyecto y generar el archivo <b>JAR</b> ejecutable, sigue estos pasos:

   1. Generar el <b>JAR</b> y agregarlo al repositorio local de Maven: ```./mvnw install```
   2. Limpiar el directorio target y empaquetar el proyecto:```./mvnw clean package```
   3. Para ejecutar el <b>JAR</b> generado navega al directorio target:```cd target```
   4. Ejecuta el <b>JAR</b> utilizando el siguiente comando:```java -jar [nombre-jar].jar``` Ejemplo:  ```java -jar [msvc-notes-0.0.1-SNAPSHOT.jar]```

Ya con eso está para probar en local 👌

### Despliegue:
El proyecto se puede desplegar en un VPS, una instancia EC2 de AWS, entre otros

### Preparación del entorno de despliegue:
1. Instala JDK en el servidor.
2. Sube el archivo <b>JAR</b> al servidor usando una conexión SSH.

## Docker:
***
Para levantar el proyecto con <b>Docker </b> se debe tener el ```.jar``` del aplicativo, para eso hacemos lo siguiente:

1) Limpiar el directorio <b>target</b> y empaquetar el proyecto: ```./mvnw clean package```
2) Ejecutar en terminal: ```docker-compose up -d (detached mode)```
3) Para bajar el servicio: ```docker-compose down```

Cuando hagamos algun cambio en el <b>docker-compose</b> se reconstruye y levanta con: 
```docker-compose up --build```

## Extras:
***
- Ver logs del contenedor:
    1) Buscar el ID o nombre del contenedor:
       ```docker ps (para listar contenedores en ejecucion)```
    2) Obtener logs de un contenedor especifico: ```docker logs <Container ID>```