# Selenium Automation QA Project

## 📌 Project Overview
This repository documents my hands-on journey building Selenium WebDriver and TestNG automation testing skills as part of my QA Engineer learning path. It progresses from foundational Selenium scripting (Week 7) to a structured, maintainable **Page Object Model (POM) automation framework** (Week 8), using the SauceDemo e-commerce web application as the target for all automated tests.

## 🛠️ Tools & Technologies

* Java 17
* Selenium WebDriver 4.47.0
* TestNG 7.9.0
* Apache Maven
* IntelliJ IDEA
* Google Chrome
* Git & GitHub

## 📂 Full Project Structure
Week7-Selenium-Automation
│
├── pom.xml
├── testng.xml
├── .gitignore
│
├── src
│ ├── main
│ │ └── java
│ │ └── org
│ │ └── example
│ │ └── Main.java
│ │
│ └── test
│ └── java
│ └── org
│ └── example
│ ├── Day2_Selenium_WebDriver.java
│ ├── Day3_Selenium_Locators.java
│ ├── Day4_Selenium_WebElements.java
│ ├── Day5_TestNG_Basic.java
│ ├── Day5_Selenium_TestNG.java
│ ├── Day6_TestNG_Assertions.java
│ ├── Day6_Selenium_Assertions.java
│ ├── Day7_SauceDemo_Automation.java
│ │
│ ├── pages/
│ │ ├── BasePage.java
│ │ ├── LoginPage.java
│ │ ├── ProductsPage.java
│ │ └── CartPage.java
│ │
│ └── tests/
│ ├── Day2_POM_LoginTest.java
│ ├── Day3_LoginPage_ReusableMethods.java
│ ├── Day4_LoginProducts_Test.java
│ ├── Day5_WebDriverWait_Test.java
│ ├── Day6_TestNG_POM_Assertions.java
│ └── Day7_FullFramework_Test.java


---

## 🚀 Week 7 — Selenium & TestNG Fundamentals

### 🎯 Objectives

* Understand the basics of test automation
* Learn Selenium WebDriver
* Automate browser actions using Java
* Identify web elements using different locators
* Interact with web elements
* Perform automated login testing
* Use TestNG for test execution
* Use assertions to validate expected results
* Perform positive and negative testing
* Use explicit waits for reliable test execution

---

## 🚀 Week 8 — Page Object Model (POM) Automation Framework

### 📌 Overview
Building on Week 7's fundamentals, Week 8 evolves the project into a structured **Page Object Model (POM) framework**. Instead of writing Selenium commands directly inside test classes, each application page (Login, Products, Cart) is modeled as its own reusable class — the same pattern used in real-world QA automation frameworks.

### 🎯 Objectives

* Structure automation code using the Page Object Model (POM) design pattern
* Build reusable methods for login, product verification, and cart actions
* Implement explicit waits (`WebDriverWait`) to eliminate flaky, timing-related failures
* Use both TestNG hard assertions (`Assert`) and soft assertions (`SoftAssert`)
* Chain multiple Page Objects together in a single end-to-end test
* Run the full test suite as one execution using `testng.xml`
* Maintain a structured test case tracker with pass/fail results

### 🛠️ Additional Concepts

* Page Object Model (POM) design pattern
* WebDriverWait / ExpectedConditions
* TestNG SoftAssert
* TestNG Suite XML (`testng.xml`)

### ✅ Key Features

* **POM Architecture** — Login, Products, and Cart pages separated into maintainable, reusable classes, with a shared `BasePage` handling waits
* **Explicit Waits** — `WebDriverWait` used across all page interactions to prevent flaky, timing-dependent test failures
* **Hard & Soft Assertions** — `Assert` for fail-fast checks, `SoftAssert` to collect multiple validation results in a single test run
* **End-to-End Flow** — Login → Product verification → Add to cart → Cart validation
* **Suite Execution** — All test classes run together via `testng.xml`
* **Screenshot Capture** — Automatic screenshots taken at key assertion points

### 🧪 Test Cases Covered

| Test Case | Description |
|---|---|
| TC_AUTO_001 | Successful login using reusable POM methods |
| TC_AUTO_002 | Error message shown on invalid login |
| TC_AUTO_003 | Login navigates correctly to Products page |
| TC_AUTO_004 | WebDriverWait correctly waits for cart badge to update |
| TC_AUTO_005 | Multiple assertions validated in one test using SoftAssert |
| TC_AUTO_006 | Full end-to-end purchase flow across Login → Products → Cart |

**Result:** 6/6 test cases passing — 100% pass rate.

### ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ IDEA (or any Maven-supported IDE)
3. Let Maven download dependencies (`selenium-java`, `testng`)
4. Right-click `testng.xml` → **Run** to execute the full Week 8 suite

### 📊 Sample Output

Week8 Framework Suite
Total tests run: 6, Passes: 6, Failures: 0, Skips: 0


---

## 📌 Note

This repository reflects a progressive learning path — starting with foundational Selenium WebDriver scripts (Week 7) and evolving into a structured, maintainable Page Object Model automation framework (Week 8).
