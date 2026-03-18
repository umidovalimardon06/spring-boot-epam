# 🌱 Spring Boot

---

## 🐳 1. Docker Build Configuration

### 📦 Goal
Containerize your Spring Boot application for consistent deployment across environments.

---

## 🌐 2. Spring Boot Web App (`@Controller`)

### 📌 Purpose

Used for serving HTML views (typically with Thymeleaf, JSP, etc.).

### 🧠 Key Characteristics

* Returns **view names**, not raw data
* Works with templates
* Used in MVC architecture

---

## 🔌 3. Spring Boot Web Service (`@RestController`)

### 📌 Purpose

Used for building RESTful APIs that return JSON (or other data formats).

### 🧠 Key Characteristics

* Returns **data directly** (no view resolution)
* Automatically serialized to JSON
* Ideal for frontend/mobile/backend integrations

