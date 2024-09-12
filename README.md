"Multiple-File-Upload-System"
"Multiple-File-Upload-System"

"Requirements: jdk-17 or above, maven apache 3.9.9, html ,css & javascript."

"Add the jdk and maven to the system environment variables"


"Run the mvn -v command to check the maven apache version in the cmd line.
mvn clean install to install the dependencies and mvn spring-boot:run to run the spring boot"

"Open the web browser and search localhost:8080/index.html and your web page will open."

"The files uploaded in the html web page will be shown in the Uploads directory."

"The Size of the file can be modified in the application.properties as per the needs."


"Modify the code to the user preference and have fun coding."

multi-file-upload-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── multifileupload/
│   │   │               ├── FileEntity.java
│   │   │               ├── FileUploadController.java
│   │   │               ├── MultiFileUploadApplication.java
│   │   │               ├── FileRepository.java
│   │   │               └── FileService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── index.html
│   │           └── styles.css
│
├── Uploads/
│   └── (this is where uploaded files will be stored)
│
├── pom.xml
└── README.md
