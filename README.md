# API Health Monitor Project

## Overview
A Spring Boot application exposing health endpoints, integrated with Docker, Jenkins, and Kubernetes. Includes an interactive UI served on port 8090.

## Features
- Health endpoints: `/health`, `/health/details`
- CI/CD pipeline with Jenkins
- Docker containerization
- Kubernetes deployment with probes
- Interactive UI for health monitoring

## Quick Start
```bash
mvn clean package
docker build -t api-health-monitor-ui:latest .
docker run -p 8090:8090 api-health-monitor-ui:latest
```

Access UI: [http://localhost:8090](http://localhost:8090)
