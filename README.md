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

<img width="385" height="563" alt="Screenshot 2025-10-21 at 11 48 28 AM" src="https://github.com/user-attachments/assets/0d5d38d3-3ce4-4242-8af7-abf298f2954f" />

- **resources** → Contains all *XPaths* and *action methods* for each test case.  
- **testcases** → Contains all *@Test* annotated methods that invoke resources and include the *basepath* to launch Chrome.  
- **utils** → Contains *shared methods* , *Screenshot class* for reusablity and maintenance.  
- **screenshots** → Project-level folder to store captured screenshots.  
- **testng.xml** → Used to execute all test cases together.
- **test-outpu** → capture the logs and reports.
- **.gitignore** → Excludes unwanted remote files being committed to git

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

    <dependencies>
      <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <scope>test</scope>
      </dependency>
    
    <!-- Match the version used by TestNG or your SLF4J APIs -->
      <dependency>
  	    <groupId>org.slf4j</groupId>
  	    <artifactId>slf4j-simple</artifactId>
  	    <version>2.0.13</version> 
  	  </dependency>

    
    <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
    	<dependency>
    	    <groupId>com.aventstack</groupId>
    	    <artifactId>extentreports</artifactId>
    	    <version>5.1.2</version>
    	</dependency>
        
    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
    	<dependency>
    	    <groupId>org.apache.logging.log4j</groupId>
    	    <artifactId>log4j-core</artifactId>
    	    <version>3.0.0-beta3</version>
    	</dependency>
	
	<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
    	<dependency>
    	    <groupId>org.apache.logging.log4j</groupId>
    	    <artifactId>log4j-api</artifactId>
    	    <version>3.0.0-beta2</version>
    	</dependency>
    
    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j-impl -->
    	<dependency>
    	    <groupId>org.apache.logging.log4j</groupId>
    	    <artifactId>log4j-slf4j-impl</artifactId>
    	    <version>3.0.0-beta2</version>
    	    <scope>compile</scope>
    	</dependency>
    
    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
	    <groupId>org.testng</groupId>
	    <artifactId>testng</artifactId>
	    <version>7.11.0</version>
	    <scope>test</scope>
	</dependency>
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

### **5. Execution**
> 1. Run all test cases through testng.xml file.
> 2. Ensure ChromeDriver path and configurations are correctly set in the base class.
> 3. Captured screenshots will be stored inside the /screenshots folder at the project level.
> 4. View TestNG results and logs within Eclipse under the TestNG Results tab.
