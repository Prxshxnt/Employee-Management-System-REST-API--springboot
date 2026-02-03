# 👨‍💼 Employee Management System – Spring Boot 

## 🔧 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST API
- Maven

## ✨ Features
- Add New Employee
- Update Employee Details
- Delete Employee
- Get Employee by ID
- Get All Employees
- Search Employee by Department / Salary

## ▶️ Run Project
1. Clone the repository
2. Create MySQL database (example: `employee_db`)
3. Update database details in `application.properties`
4. Run `EmployeeApplication.java`
5. Access APIs using Postman or Browser

## 🔗 API Endpoints
POST   /api/employees  
GET    /api/employees  
GET    /api/employees/{id}  
PUT    /api/employees/{id}  
DELETE /api/employees/{id}  

## 🗄️ Database
- MySQL
- Table auto-created using JPA (`spring.jpa.hibernate.ddl-auto=update`)

## 📌 Project Type
- Backend REST API
- Mini Project for Java / Spring Boot Practice
