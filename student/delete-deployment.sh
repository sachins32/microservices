#!/bin/bash

cd kubernetes
kubectl delete -f mysql-secret.yaml
kubectl delete -f mysql-deployment.yaml
kubectl delete -f student-configmap.yaml
kubectl delete -f deployment.yaml