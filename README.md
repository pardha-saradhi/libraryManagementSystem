# 📚 Library Management System  

## 📖 Overview  
The **Library Management System** is a Spring Boot-based web application designed to manage library operations efficiently. It facilitates **book management, user registration, book issuance, reservations, and fine calculation** while ensuring smooth interactions between students and librarians.  

## 🚀 Features  
- **User Registration & Authentication**: Secure login for students, librarians, and admins.  
- **Book Management**: Add, update, search, and delete books.  
- **Book Issuance & Return**: Track book lending, return deadlines, and fine calculations.  
- **Reservation System**: Students can reserve books and receive availability notifications.  
- **Fine Management**: Automatically calculates overdue fines based on predefined rules.  
- **Admin Dashboard**: View reports, manage users, and monitor library transactions.  
- **Spring Security**: Implements role-based access control for different user types.  

## 🛠️ Technologies Used  
- **Java** (Spring Boot, Spring Security, Spring Data JPA)  
- **MySQL** (Database for storing library data)  
- **Hibernate** (ORM for database interactions)  
- **Maven** (Dependency management)  
- **Postman** (API Testing)  
- **Git & GitHub** (Version Control)  

## 📂 Project Structure  
Library-Management-System/ │── src/main/java/com/library/ │ ├── controllers/ # REST API Controllers
│ ├── models/ # Entity Models
│ ├── repositories/ # Database Repositories
│ ├── services/ # Business Logic Layer
│── src/main/resources/
│ ├── application.properties # Database & Server Configurations
│── pom.xml # Maven Dependencies
│── README.md # Project Documentation


## 🔧 Installation & Setup  
### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/pardha-saradhi/libraryManagementSystem.git
cd libraryManagementSystem
2️⃣ Configure the Database
Update application.properties with your MySQL database credentials.
3️⃣ Build & Run the Application
bash
mvn spring-boot:run
4️⃣ API Endpoints & Testing via Postman
User Management
Register a Student
POST http://localhost:8080/student/createStudent
Update Student Details
PUT http://localhost:8080/student/updateStudent?id={studentId}
Change Password
POST http://localhost:8080/student/changePassword?id={studentId}
Book Management
Add a Book
POST http://localhost:8080/book/add
Search Books
GET http://localhost:8080/book/search?title={bookTitle}
Delete a Book
DELETE http://localhost:8080/book/delete?id={bookId}
Transactions (Book Issuance & Return)
Issue a Book
POST http://localhost:8080/transaction/issueBook?bookId={id}&cardId={id}
Return a Book
POST http://localhost:8080/transaction/returnBook?bookId={id}&cardId={id}
Reservation System
Reserve a Book
POST http://localhost:8080/reservation/reserveBook?studentId={id}&bookId={id}
Cancel Reservation
DELETE http://localhost:8080/reservation/cancel?reservationId={id}
🏗️ Future Enhancements
📌 Email notifications for book availability and overdue returns.
📌 Advanced reporting for admins to monitor library statistics.
📌 Mobile-friendly front-end for better user experience.
