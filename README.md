Employee Management System (Spring Boot)
📌 Project Overview

The Employee Management System (EMS) is a RESTful web application developed using Spring Boot following a Layered MVC Architecture.
It provides APIs to manage employee data with proper validation, exception handling, and standardized responses.

This project is designed as a Minor Project and demonstrates industry-standard backend development practices.

🎯 Objectives

Implement CRUD operations for employee management

Follow clean layered architecture (Controller → Service → Repository)

Use DTOs to avoid direct entity exposure

Handle exceptions globally

Provide consistent API responses

🛠️ Technologies Used

Java

Spring Boot

Spring Data JPA

Hibernate

H2 Database (can be switched to MySQL)

Maven

REST APIs


🧱 Project Architecture

The project follows Layered MVC Architecture:

Controller → Service → Repository → Database
com.module2.layersMVC
│
├── advices
│   ├── ApiError
│   ├── ApiResponse
│   ├── GlobalExceptionHandler
│   └── GlobalResponseHandler
│
├── annotation
│   ├── EmployeeRoleValidation
│   └── EmployeeRollValidator
│
├── config
│   └── MapperConfig
│
├── controller
│   └── EmployeeController
│
├── dto
│   └── EmployeeDto
│
├── entity
│   └── EmployeeEntity
│
├── exceptions
│   └── ResourceNotFoundException
│
├── repository
│   └── EmployeeRepo
│
├── service
│   └── EmployeeService
│
└── LayersMvcApplication
⚙️ Features

Create new employee

Fetch employee by ID

Fetch all employees

Update employee details

Delete employee

Role validation using custom annotation

Global exception handling

Standardized API responses

DTO-based data transfer

📡 API Endpoints (Sample)
Method	Endpoint	Description
POST	/employees	Create employee
GET	/employees/{id}	Get employee by ID
GET	/employees	Get all employees
PUT	/employees/{id}	Update employee
DELETE	/employees/{id}	Delete employee
