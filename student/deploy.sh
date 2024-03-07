#!/bin/bash

# Step 1: Create JAR for Spring Boot app using Maven (skip tests)
echo "Step 1: Creating JAR for Spring Boot app using Maven..."
mvn clean install -DskipTests

# Step 2: Build Docker image using existing Dockerfile
echo "Step 2: Building Docker image using existing Dockerfile..."
docker build -t  sachins32/student-api .

# Step 3: Push the Docker image
echo "Step 3: Pushing Docker image..."
docker push sachins32/student-api

# Step 4: Deploy to Kubernetes local cluster using kubectl apply
echo "Step 4: Deploying to Kubernetes local cluster using kubectl apply..."
cd kubernetes
kubectl apply -f mysql-secret.yaml
kubectl apply -f mysql-deployment.yaml

kubectl apply -f student-configmap.yaml
kubectl apply -f deployment.yaml

echo "Waiting to complete student api deployment"
sleep 30

echo "Access using NodePort"
minikube service student-api-service --url
