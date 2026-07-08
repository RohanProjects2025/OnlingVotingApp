
# 🗳️ Online Voting System

A modern **Online Voting System** built using **Java Spring Boot, Thymeleaf, MySQL, HTML, CSS, and JavaScript**. The application provides a secure and user-friendly platform where users can register, log in, cast a vote once, and administrators can monitor election results through an interactive dashboard.

---

## 📸 Project Screenshots

### 🏠 Home Page

![Home](screenshots/home.PNG)

---

### 📝 User Registration

![Register](screenshots/register.PNG)

---

### 🔐 User Login

![Login](screenshots/login.PNG)

---

### 🗳️ User Voting Dashboard

![Voting Dashboard](screenshots/user-dashboard.PNG)

---

### ✅ Vote Successfully Submitted

![Vote Success](screenshots/vote-success.PNG)

---

### ☑️ Already Voted Page

![Already Voted](screenshots/already-voted.PNG)

---

### 👨‍💼 Admin Dashboard

![Admin Dashboard](screenshots/admin-dashboard.PNG)

---

# ✨ Features

## 👤 User Features

- User Registration
- User Login
- Session Based Authentication
- View Personal Details
- Cast Vote
- One Vote Per User
- Vote Success Confirmation
- Already Voted Protection
- Logout

---

## 👨‍💼 Admin Features

- Secure Admin Login
- View All Candidates
- Live Vote Count
- Dashboard with Total Votes
- Logout

---

# 🛠 Technologies Used

### Backend

- Java 17
- Spring Boot
- Spring MVC
- Thymeleaf

### Frontend

- HTML5
- CSS3
- JavaScript
- Font Awesome

### Database

- MySQL

### Build Tool

- Maven

### IDE

- Spring Tool Suite (STS)
- Eclipse

---

# 📂 Project Structure

```
OnlineVotingApp
│
├── src
│   ├── main
│   │   ├── java
│   │   │      ├── controller
│   │   │      ├── entity
│   │   │      ├── repository
│   │   │      ├── service
│   │   │      └── OnlineVotingApplication.java
│   │   │
│   │   ├── resources
│   │       ├── static
│   │       │      ├── css
│   │       │      ├── js
│   │       │      └── images
│   │       │
│   │       ├── templates
│   │       │      ├── home.html
│   │       │      ├── register.html
│   │       │      ├── login.html
│   │       │      ├── user.html
│   │       │      └── admin.html
│   │       │
│   │       └── application.properties
│
└── pom.xml
```

---

# ⚙️ Installation

## 1️⃣ Clone Repository

```bash
git clone https://github.com/RohanProjects2025/OnlingVotingApp.git
```

---

## 2️⃣ Open Project

Import as **Existing Maven Project** in

- Spring Tool Suite
- Eclipse
- IntelliJ IDEA

---

## 3️⃣ Create Database

```sql
CREATE DATABASE voting_app;
```

---

## 4️⃣ Configure Database

Edit

```
application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/voting_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

## 5️⃣ Run Application

Run

```
OnlineVotingApplication.java
```

or

```bash
mvn spring-boot:run
```

---

## 6️⃣ Open Browser

```
http://localhost:8080/
```

---

# 🔑 Default Admin Credentials

| Email | Password |
|--------|----------|
| admin@gmail.com | admin |

---

# 📊 Workflow

```
Home
   │
   ▼
Register
   │
   ▼
Login
   │
   ▼
User Dashboard
   │
   ├── Vote
   │      │
   │      ▼
   │  Vote Success
   │
   └── Already Voted
           │
           ▼
Logout
```

---

# 🎯 Future Improvements

- Email Verification
- Forgot Password
- Remember Me
- OTP Authentication
- Candidate Management
- Election Scheduling
- Result Charts
- PDF Report Generation
- Responsive Mobile UI
- Spring Security Authentication

---

# 📸 UI Highlights

- Modern Responsive Design
- Purple Gradient Theme
- Professional Dashboard
- Secure Voting Interface
- Interactive Cards
- Animated Buttons
- Clean Typography

---

# 👨‍💻 Author

**Rohan Madane**

Java Full Stack Developer

GitHub:
https://github.com/MadaneRohan

Portfolio:
https://madanerohan.github.io/MyPortfolio/

---

# ⭐ Support

If you like this project,

⭐ Star this repository

🍴 Fork it

🛠️ Contribute

---

# 📜 License

This project is created for educational and learning purposes.
