How to Run the Project

1. Make sure MySQL is installed and running on your system.

2. Create a database named student in MySQL.

3. Open the project in an IDE that supports Spring Boot (such as Eclipse or IntelliJ).

4. Locate and run the main application file:
   src/main/java/com/quickman/studentmanagement/StudentManagementApplication.java

5. The application uses the following configuration in application.yaml for database connectivity:

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/student?useSSL=false
    username: root
    password: 

  jpa:
    hibernate:
      ddl_auto: create

6. Ensure the username and password match your MySQL credentials.

7. After running the application, you can test the API endpoints using Postman.

API Endpoints to Test

1. Create Student Details  
   Method: POST  
   URL: http://localhost:8080/student  
   Body (JSON):
   {
       "studentId": "2019ICTS137",
       "studentName": "Logeesan",
       "studentEmail": "r.logeesan21112@gmail.com",
       "studentCourse": "BICT[Hons]"
   }

2. Get Student Details by ID  
   Method: GET  
   URL: http://localhost:8080/student/2019ICTS137

3. Get All Student Details  
   Method: GET  
   URL: http://localhost:8080/student

4. Update Student Details  
   Method: PUT  
   URL: http://localhost:8080/student  
   Body (JSON):
   {
       "studentId": "2019ICTS137",
       "studentName": "Ravindrasekar Logeesan",
       "studentEmail": "r.logeesan21112@gmail.com",
       "studentCourse": "BICT[Hons]"
   }

5. Delete Student Details  
   Method: DELETE  
   URL: http://localhost:8080/student/2019ICTS137

Exception Handling

1. If a student is not found for a given ID, for example:
   URL: http://localhost:8080/student/2019ICTS128  
   Response:
   {
       "message": "Student not found with the given ID.",
       "httpStatus": "NOT_FOUND",
       "details": null
   }

2. Required field validation is also implemented.
   If required fields are missing, an appropriate error message will be returned.
