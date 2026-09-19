# Selenium Automation QA Project

## 📌 Project Overview

This project is a hands-on **Selenium WebDriver and TestNG automation testing project** created as part of my QA Engineer learning journey.

The project focuses on automating web application testing using **Java, Selenium WebDriver, Maven, and TestNG**.

The automation practice was performed using the **SauceDemo** web application.

---

## 🎯 Objectives

The main objectives of this project are:

- Understand the basics of test automation
- Learn Selenium WebDriver
- Automate browser actions using Java
- Identify web elements using different locators
- Interact with web elements
- Perform automated login testing
- Use TestNG for test execution
- Use assertions to validate expected results
- Perform positive and negative testing
- Use explicit waits for reliable test execution

---

## 🛠️ Tools & Technologies

- **Java 17**
- **Selenium WebDriver 4.47.0**
- **TestNG 7.9.0**
- **Apache Maven**
- **IntelliJ IDEA**
- **Google Chrome**
- **Git & GitHub**

---

## 📂 Project Structure

```text
Week7-Selenium-Automation
│
├── pom.xml
├── .gitignore
│
├── src
│   ├── main
│   │   └── java
│   │       └── org
│   │           └── example
│   │               └── Main.java
│   │
│   └── test
│       └── java
│           └── org
│               └── example
│                   ├── Day2_Selenium_WebDriver.java
│                   ├── Day3_Selenium_Locators.java
│                   ├── Day4_Selenium_WebElements.java
│                   ├── Day5_TestNG_Basic.java
│                   ├── Day5_Selenium_TestNG.java
│                   ├── Day6_TestNG_Assertions.java
│                   ├── Day6_Selenium_Assertions.java
│                   └── Day7_SauceDemo_Automation.java


# Selenium POM Automation Framework — SauceDemo

A test automation framework built with **Java, Selenium WebDriver, and TestNG**, 
following the **Page Object Model (POM)** design pattern, to test the login, 
product navigation, and cart functionality of the [SauceDemo](https://www.saucedemo.com/) 
e-commerce web application.

## 🎯 Project Overview

This framework demonstrates a structured approach to UI test automation:
- Each application page (Login, Products, Cart) is modeled as its own class
- Common wait logic is centralized in a shared `BasePage`
- Tests are kept short and readable by delegating all element interactions 
  to page objects
- The full suite runs as one execution via TestNG's `testng.xml`

## 🛠️ Tech Stack

| Tool | Purpose |
|---|---|
| Java | Core programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution & assertions |
| Maven | Dependency management & build |
| IntelliJ IDEA | Development environment |

## 📁 Project Structure
