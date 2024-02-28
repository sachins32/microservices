Create JAR:
mvn clean package -DskipTests

Docker Image:
docker build -t sachins32/student-api:v1 .

Dependency, Run Mysql:
docker run --name mysql -e MYSQL_ROOT_PASSWORD=my-pass -e MYSQL_DATABASE=university -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql

Run App:
docker run -e MYSQL_SQL=172.17.0.2 -p 8080:8080 sachins32/student-api:v1

Mysql IP
docker inspect mysql_container_name/id
 