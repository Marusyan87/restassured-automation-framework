# 🚀 Rest Assured API Automation Framework

## 📌 Overview

This project is a reusable API Automation Framework developed using Java and Rest Assured.

The framework follows a clean and scalable architecture by separating API clients, models, utilities and test classes. It demonstrates CRUD API automation, reusable request/response specifications, serialization, deserialization, dynamic test data generation and reporting.

---

# 🛠️ Tech Stack

- Java 21
- Rest Assured
- JUnit 5
- Gradle
- Lombok
- Jackson
- Hamcrest
- DataFaker
- Allure Report
- Git

---

# 📂 Project Structure

```
src
├── api
│   ├── BaseApi.java
│   └── UserApi.java
│
├── models
│   ├── User.java
│   └── GetUserResponse.java
│
├── tests
│   ├── GetUserTest.java
│   ├── CreateUserTest.java
│   ├── UpdateUserTest.java
│   └── DeleteUserTest.java
│
└── utils
    ├── ConfigReader.java
    ├── FakerUtils.java
    ├── ResponseSpecs.java
    └── ResponseValidator.java
```

---

# ✅ Framework Features

- ✔ CRUD API Testing
- ✔ GET Requests
- ✔ POST Requests
- ✔ PUT Requests
- ✔ DELETE Requests
- ✔ POJO Serialization
- ✔ POJO Deserialization
- ✔ Reusable API Client
- ✔ Response Specifications
- ✔ Response Validation
- ✔ Dynamic Test Data using DataFaker
- ✔ Lombok Models
- ✔ Config File Support
- ✔ Clean Architecture

---

# 🏗 Framework Architecture

```
Tests
   │
   ▼
UserApi
   │
   ▼
BaseApi
   │
   ▼
Rest Assured
   │
   ▼
API
```

---

# ▶️ Run Tests

Run all tests:

```bash
.\gradlew test
```

Run a single test:

```bash
.\gradlew test --tests "tests.GetUserTest"
```

---

# 📊 Reporting

The framework supports Allure Reports.

Generate report:

```bash
.\gradlew allureReport
```

Open report:

```bash
.\gradlew allureServe
```

---

# 👨‍💻 Author

**Marius Aioanei**

Junior QA Automation Portfolio Project