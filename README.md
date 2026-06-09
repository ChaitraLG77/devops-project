# Automated CI/CD Pipeline for Spring Boot Application using GitHub Actions, Docker, Docker Hub, and Render

## Project Overview

This project demonstrates the implementation of a complete DevOps CI/CD pipeline for a Spring Boot REST API application. The project automates the software development lifecycle, including code integration, build automation, testing, containerization, image storage, and cloud deployment.

The application is developed using Spring Boot and integrated with GitHub Actions for Continuous Integration (CI), Docker for containerization, Docker Hub for image storage, and Render for cloud deployment.

---

## Project Objectives

* Automate the software build process.
* Implement Continuous Integration using GitHub Actions.
* Containerize the application using Docker.
* Store Docker images in Docker Hub.
* Deploy the application on the cloud using Render.
* Demonstrate a complete DevOps workflow.

---

## Technologies Used

| Technology     | Purpose                                    |
| -------------- | ------------------------------------------ |
| Java 17        | Programming Language                       |
| Spring Boot    | REST API Development                       |
| Maven          | Build Automation and Dependency Management |
| JUnit          | Automated Testing                          |
| Git            | Version Control                            |
| GitHub         | Source Code Repository                     |
| GitHub Actions | CI/CD Automation                           |
| Docker         | Containerization                           |
| Docker Hub     | Docker Image Registry                      |
| Render         | Cloud Deployment Platform                  |

---

## System Architecture

Developer
↓
GitHub Repository
↓
GitHub Actions
↓
Maven Build & Test
↓
Docker Image Build
↓
Docker Hub Push
↓
Render Deployment
↓
Live Spring Boot Application

---

## Project Structure

```text
devops-project
│
├── .github
│   └── workflows
│       └── main.yml
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── devops
│   │               └── Application.java
│   │
│   └── test
│
├── Dockerfile
├── pom.xml
├── README.md
└── .gitignore
```

## Application Features

* Spring Boot REST API
* Automated CI/CD Pipeline
* Docker Containerization
* Docker Hub Integration
* Cloud Deployment using Render
* Automated Build and Testing

---

## API Endpoints

### Home Endpoint

```http
GET /
```

Response:

```text
Welcome to DevOps Project 🚀
```

### Hello Endpoint

```http
GET /hello
```

Response:

```text
Hello DevOps 🚀
```

---

## Running the Application Locally

### Clone Repository

```bash
git clone <repository-url>
cd devops-project
```

### Run Application

```bash
mvn spring-boot:run
```

### Access Application

```text
http://localhost:8080/
```

```text
http://localhost:8080/hello
```

---

## Docker Commands

### Build Docker Image

```bash
docker build -t devops-app .
```

### Run Docker Container

```bash
docker run -p 8080:8080 devops-app
```

### Access Application

```text
http://localhost:8080/
```

```text
http://localhost:8080/hello
```

---

## Docker Hub Repository

Docker Image:

```text
chaitra77/devops-app
```

Pull Image:

```bash
docker pull chaitra77/devops-app
```

Run Image:

```bash
docker run -p 8080:8080 chaitra77/devops-app
```

---

## CI/CD Workflow

Whenever code is pushed to GitHub, the following steps are executed automatically:

1. Source code checkout
2. Java environment setup
3. Maven build
4. Automated testing
5. Docker image creation
6. Docker image push to Docker Hub
7. Deployment on Render

Workflow File:

```text
.github/workflows/main.yml
```

---

## Deployment

### Render Deployment URL

```text
https://devops-project-oezy.onrender.com/
```

### API URL

```text
https://devops-project-oezy.onrender.com/hello
```

---

## Advantages

* Automated build process
* Faster software delivery
* Reduced manual effort
* Consistent deployment environment
* Easy scalability
* Improved software quality
* Continuous Integration support
* Containerized application deployment

---

## Limitations

* Simple REST API functionality
* No database integration
* No authentication mechanism
* Limited monitoring features
* Render free tier may introduce startup delays
* No Kubernetes orchestration

---

## Future Enhancements

* Add Swagger API Documentation
* Integrate MySQL/PostgreSQL Database
* Add User Authentication and Authorization
* Implement CRUD Operations
* Add Spring Boot Actuator Monitoring
* Integrate SonarQube Code Analysis
* Implement Kubernetes Deployment
* Add Prometheus and Grafana Monitoring
* Configure Fully Automated Continuous Deployment

---

## Results

* Successfully developed a Spring Boot REST API.
* Successfully implemented a CI/CD pipeline using GitHub Actions.
* Successfully containerized the application using Docker.
* Successfully pushed Docker images to Docker Hub.
* Successfully deployed the application on Render.
* Successfully demonstrated an end-to-end DevOps workflow.

---

## Conclusion

This project successfully demonstrates the implementation of a complete DevOps CI/CD pipeline using modern development and deployment tools. The application is developed using Spring Boot and integrated with GitHub Actions to automate build and testing activities. Docker is used to containerize the application, ensuring consistency across different environments.

The project also utilizes Docker Hub as a centralized image repository, enabling efficient storage and distribution of Docker images. Through automated workflows, every code change can be built, tested, and packaged without manual intervention. This significantly improves software delivery efficiency and reliability.

The final application is deployed on Render, providing a publicly accessible cloud-hosted service. The project showcases industry-standard DevOps practices, including Continuous Integration, containerization, automated deployment, and cloud hosting. It serves as a strong foundation for implementing advanced DevOps features and enterprise-scale deployment strategies.

---

