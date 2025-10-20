# **OrangeHRM Web Automation**

## _Project Setup_

This document guides you through setting up a **Java Selenium automation framework** using **TestNG** and the **Page Object Model (POM)** in **Eclipse IDE**, along with **Git integration** for version control.

---

### **1. Prerequisites**

Ensure the following software is installed on your system:

- **Java JDK 8 or higher** → [Download Here](https://www.oracle.com/java/technologies/downloads/)
- **Eclipse IDE for Java Developers** → [Download Here](https://www.eclipse.org/downloads/)
- **Apache Maven** → [Download Here](https://maven.apache.org/download.cgi)
- **Google Chrome Browser**
- **ChromeDriver** → [Download Here](https://chromedriver.chromium.org/downloads)
- **Git** → [Download Here](https://git-scm.com/downloads)

---

### **2. Project Structure**

After project setup, the folder structure should look like this:

OrangeHRM-Web-Automation/
│
├── pom.xml
├── testng.xml
├── /src
│ └── /test
│ └── /java
│ ├── resources/
│ │ ├── locators.java
│ │ ├── actionMethods.java
│ │ └── pageObjects.java
│ │
│ ├── testcases/
│ │ ├── loginTest.java
│ │ ├── leaveApplyTest.java
│ │ └── baseClass.java
│ │
│ └── utils/
│ ├── screenshotUtil.java
  └── sharedData.java

  
- **resources** → Contains all *XPaths* and *action methods* for each test case.  
- **testcases** → Contains all *@Test* annotated methods that invoke resources and include the *basepath* to launch Chrome.  
- **utils** → Contains *shared methods* like screenshot capture and reusable data handling.  
- **screenshots** → Project-level folder to store captured screenshots.  
- **testng.xml** → Used to execute all test cases together.

---

### **3. pom.xml Dependencies**

Add the following dependencies to your `pom.xml` file:

>xml
>
>> <dependencies>
    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>

    <!-- WebDriver Manager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.8.0</version>
    </dependency>

    <!-- Apache Commons IO (for screenshots) -->
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.16.1</version>
    </dependency>
>> </dependencies>

### **4. Git Integration**

Follow these steps to connect your Eclipse project with a **GitHub remote repository**:

#### **Steps** 
1. Verify Remote Connection
2. Remove Existing Remote (if any)
3. Add New Remote Repository
4. Stage and Commit Changes
5. Push Code to Remote Repository

>**git cli commands**
>
>> 1. git remote -v
>> 2. git remote rm origin
>> 3. git remote add origin [https/ssh URL]
>> 4. git add .
      git commit -m "commit message"
>> 5. git push origin main -f   

### **Execution**
> 1. Run all test cases through testng.xml file.
> 2. Ensure ChromeDriver path and configurations are correctly set in the base class.
> 3. Captured screenshots will be stored inside the /screenshots folder at the project level.
> 4. View TestNG results and logs within Eclipse under the TestNG Results tab.
