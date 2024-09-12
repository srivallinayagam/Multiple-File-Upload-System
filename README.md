# Multi-File Upload System

## Overview

This project is a simple multi-file upload system built with Spring Boot. It allows users to upload multiple files through a web interface. The files will be stored in a designated directory and can be customized based on your needs.

## Requirements

- **JDK**: 17 or above
- **Maven**: Apache 3.9.9
- **HTML, CSS & JavaScript**

## Setup Instructions

1. **Add JDK and Maven to System Environment Variables**

   Make sure that JDK and Maven are added to your system environment variables to ensure they are recognized globally.

2. **Verify Maven Installation**

   Open your command line interface and run the following command to check your Maven version:
   
   ```
   mvn -v


## Build and Run the Application

**To install the dependencies, navigate to the project directory and run:**
```
mvn clean install

**To run the Spring Boot application, use:**
```
mvn spring-boot:run

## Access the Web Interface

**Open your web browser and go to:**
```
http://localhost:8080/index.html

This will display the web page where you can upload files.

## File Storage
Uploaded files will be stored in the Uploads directory within the project. Ensure that this directory exists and is writable.

## Configuration
You can modify the size of the files that can be uploaded by adjusting the settings in the application.properties file located in src/main/resources/.

## Customization
Feel free to modify the code and configuration to better suit your preferences. Enjoy coding!
