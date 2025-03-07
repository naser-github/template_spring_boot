# Spring Boot Template 🚀

This is a template project that helps to quickly set up a **Spring Boot** application with **Docker** support. It simplifies the development process and ensures consistency across projects.

## 🏗 Built With
Java (21)
Spring Boot
Docker & Docker Compose
Maven

## 🛠 Features
- Pre-configured **Spring Boot** setup
- **Docker Compose** support
- Environment variable-based configuration
- Fast project initialization

## 📌 Setup & Run

1. **Copy the environment configuration file**  
   ```bash
   cp .env.example .env
   ```

2. Start the application using Docker Compose

    ```bash
    docker compose up -d
    ```


## 📂 Project Structure

    .
    ├── docker/                # Docker-related files
    │   ├── scripts/           # Helper scripts
    │   ├── Dockerfile.local   # Dockerfile for local development
    │   └── ...
    ├── src/                   # Application source code
    │   ├── main/
    │   ├── test/
    │   └── ...
    ├── .env.example           # Example environment variables
    ├── docker-compose.yml     # Docker Compose configuration
    ├── README.md              # Project documentation
    └── ...
