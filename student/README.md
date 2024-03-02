Create JAR:
mvn clean package -DskipTests

Docker Image:
docker build -t sachins32/student-api:v1 .

Run Mysql:
docker run --name mysql -e MYSQL_ROOT_PASSWORD=my-pass -e MYSQL_DATABASE=university -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql

Run App:
docker run -e MYSQL_SQL=172.17.0.2 -p 8080:8080 sachins32/student-api:v1

Mysql IP
docker inspect mysql_container_name/id

Run Using Docker compose
docker-compose up -d

Run Uisng Kubernetes
kubectl apply -f mysql-deployment.yaml
kubectl apply -f deployment.yaml

Access using NodePort:
minikube service student-api-service --url
 