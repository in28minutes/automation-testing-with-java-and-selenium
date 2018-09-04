# Learn Automation Testing with Java and Selenium

## Your First Steps towards Great Automation Tester

* [Course Overview](#course-overview)
  - [Course Steps](#step-list)
  - [Expectations](#expectations)
* [Installing Eclipse, Maven and Java](#installing-tools)
* [Running Examples](#running-examples)
* [About in28Minutes](#about-in28minutes)
  - [Our Beliefs](#our-beliefs)
  - [Our Approach](#our-approach)
  - [Find Us](#useful-links)
  - [Other Courses](#other-courses)

## Overview
- Tools : Maven, JUnit, TestNG (XML Test Suite, Groups, Listeners, Parallel, Multiple Browsers)
- Concepts : HTML, DOM, XPath, Selenium Architecture, Reporting (HTML), Parallel Execution (Data Driven Tests, Browsers, Test Ng, Grid), Debugging (Screenshots/logs), Page Object Model, Data Driven(Excel), Keyword Driven, Record and Replay, Selenium Grid, Cross Browser Testing, DRY
- Basics : Selenium IDE, Selenium Web Driver, Locating Web Elements(link text, name, id, xpath, css), Different Elements(select, radio, web tables, drag and drop, javascript alerts, windows, popups, iframes, switching windows, AJAX calls), Wait (Explicit(2types)/Implicit), JavaScript Executor Action Class, Mouse movement, Keyboard with Selenium, File Downloads)
- Tips : Selenium Web Driver is an Interface, Test Retry, Headless Testing(PhantomJS, Chrome)

## Course Checklist

## Getting Started
- Eclipse - https://courses.in28minutes.com/p/eclipse-tutorial-for-beginners
- Maven - https://courses.in28minutes.com/p/maven-tutorial-for-beginners-in-5-steps
- JUnit - https://courses.in28minutes.com/p/junit-tutorial-for-beginners
- Mockito - https://courses.in28minutes.com/p/mockito-for-beginner-in-5-steps

## Installing Tools
- Installation Video : https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3
- GIT Repository For Installation : https://github.com/in28minutes/getting-started-in-5-steps
- PDF : https://github.com/in28minutes/SpringIn28Minutes/blob/master/InstallationGuide-JavaEclipseAndMaven_v2.pdf

## Running Examples
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one).
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for file with @SpringBootApplication)
- Right Click on the file and Run as Java Application
- You are all Set
- For help : use our installation guide - https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3

### References

#### Code Snippets

##### Maven Dependencies

###### JUnit

```xml
  <dependencies>
  
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

  
    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  
  </dependencies>
```
###### Test NG

```xml
  <dependencies>

    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
      <scope>test</scope>
    </dependency>

  </dependencies>

```

###### Other Dependencies

```xml
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.10.0</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>3.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi-ooxml</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

```


##### Java Code

###### Chrome Driver

```java
  ChromeDriverManager.getInstance().setup();
  driver = new ChromeDriver();
```

###### Firefox Driver

```java
  FirefoxDriverManager.getInstance().setup();
  driver = new FirefoxDriver();
```

##### TestNG

```
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="First Suite" verbose="1">
</suite>
```

#### Resources

##### Selenium Standalone
- Manual Installation - https://github.com/lmc-eu/steward/wiki/Selenium-server-&-browser-drivers
- Automated Installation - http://webdriver.io/guide/getstarted/install.html
- NPM - https://www.npmjs.com/package/selenium-standalone
- URL - http://localhost:4444/wd/hub

```
sudo npm install selenium-standalone@latest -g
In Windows, Run as Administrator

sudo selenium-standalone install
selenium-standalone start

selenium-standalone install
```

##### Selenium Grid

- URL -http://localhost:4444/grid/console

```
selenium-standalone start -- -role hub
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -port 5556

maxSessions, maxInstances
```

##### Plugins
- Eclipse Plugin for TestNg - http://beust.com/eclipse

##### Selenium IDE
- Selenium IDE will no longer work from Firefox 55
   - https://seleniumhq.wordpress.com/2017/08/09/firefox-55-and-selenium-ide/
- A new version of Selenium IDE for Selenium 3 is being built
   - https://seleniumhq.wordpress.com/2018/08/06/selenium-ide-tng/

##### Troubleshooting
- Troubleshooting Guide - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ
- Troubleshooting Guide for Maven Issues - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#error---you-are-not-using-a-jdk

##### Browsers
- WebDriver Specification - https://www.w3.org/TR/webdriver/
- Firefox version 47.0+ Geckodriver is needed to interact with Firefox - Similar to Chrome.
- https://ftp.mozilla.org/pub/firefox/releases/61.0.1/
- https://ftp.mozilla.org/pub/firefox/releases/54.0.1/



## Overview

### Introduction

Writing your first automation test is a lot of fun.

Selenium can be used for screen scraping and automating repeated tasks on browser.

Introduction to XYZ Framework..

In this course, you will learn the basics developing a Basic Todo Management Application using XYZ Framework.

You will build the application step by step - in more than 25 steps. This course would be a perfect first step as an introduction to XYZ Framework.

You will be using Spring (Dependency Management), Spring MVC, Spring Boot, Spring Security (Authentication and Authorization), BootStrap (Styling Pages), Maven (dependencies management), Eclipse (IDE) and Tomcat Embedded Web Server. We will help you set up each one of these.

### What You will learn

- You will learn to Topic No 1
- You will understand about Topic No 1
- You will develop a great application

##### Examples

- You will learn to design and develop SOAP and RESTful web services with Spring Boot
- You will learn the magic of Spring Boot - Auto Configuration, Spring Initializr and Starter Projects
- You will learn to connect web services to JPA/Hibernate with Spring Boot
- You will understand how to implement Exception Handling, Validation, HATEOAS and filtering for RESTful Web Services.
- You will learn to use a wide variety of Spring Boot Starter Projects - Spring Boot Web, Spring Boot Web Services, Spring Boot Data JPA
- You will learn how to version, monitor (Spring Boot Actuator) and document (Swagger) your RESTful Web Services with Spring Boot
- You will understand the best practices in designing RESTful web services
- You will understand about WSDL, SOAP Header, SOAP Body, SOAP Fault, XSD, JAXB and EndPoint
- You will develop a Todo Management Application step by step with login and logout functionalities
- You will learn to use an Annotation based approach - @RequestParam, @ModelAttribute, @SessionAttributes
- You will understand the basics of developing a Web Application - POST, GET, HTTP, MVC Pattern
- You will learn the basics of JSP, JSTL, EL, Spring Tag Libraries
- You will learn some of the magic of Spring Boot
- You will understand Spring MVC in depth - DispatcherServlet , Model, Controllers and ViewResolver
- You will learn the magic of Spring Boot - Auto Configuration, Spring Initializr and Starter Projects
- You will learn to develop RESTful web services with Spring Boot
- You will learn to develop a Web Application connecting to JPA/Hibernate Step by Step with Spring MVC and Spring Boot
- You will learn to use a wide variety of Spring Boot Starter Projects - Spring Boot Web, Spring Boot Test, Spring Boot Data JPA, Spring Boot Data REST
- You will understand Spring MVC in depth - DispatcherServlet , Model, Controllers and ViewResolver
- You will understand how to make best use of Spring Boot Actuator and Spring Boot Developer Tools
- You will learn how to externalise application configuration using Spring Boot Profiles and Dynamic Configuration
- You will understand and use the embedded servlet container options provided by Spring Boot - Tomcat, Jetty and Undertow
- You will learn to write great Unit and Integration tests using Spring Boot Starter Test


### Requirements
- You should have working knowledge of Java and Annotations. 
- We will help you install Eclipse and get up and running with Maven and Tomcat.


### Step Wise Details
- Step 01: Learn to Dance
- Step 02: 
- Step 03: 
- Step 04: 
- Step 05: 
- Step 06: 
- Step 07: 
- Step 08: 
- Step 09: 
- Step 10: 
- Step 11: 
- Step 12: 
- Step 13: 
- Step 14: 
- Step 15: 
- Step 16: 
- Step 17: 
- Step 18: 
- Step 19: 
- Step 20: 
- Step 21: 
- Step 22: 
- Step 23: 
- Step 24: 
- Step 25: 

### Course Recording Notes

 #### Preview Video
- Welcome to course on *** in ** simple steps.
- I'm Ranga Karanam. I've so and so much experience with ... I've been using this framework for ...
- At in28minutes, we ask one question everyday - How to create more effective courses? All our success - *** students on Udemy and *** subscribers on Youtube - is a result of this pursuit of excellence.
- You will develop *** and *** using ***
- You will  learn the basics like *** and move on to the advanced concepts like ***.
- You will use 
  - ... todo ...
  - Maven for dependency management, building and running the application in tomcat.
  - Eclipse IDE
- All the code for this course and the step by step details are in our Github repository. 
- We have an awesome installation guide to help you install Maven and Eclipse. You are NOT expected to have any experience with Eclipse, Maven, or Tomcat.
- What are we waiting for? Lets have some fun with *** in *** steps. We had a lot of fun creating this course for you and We are confident that you will have a lot of fun. I hope you are as excited as we are to learn more. Go ahead and enroll for the course. Or take a test drive with a free preview. See you in the course.

#### Course Intro Video
- Welcome to this course on ***. We are excited to teach you how to build awesome ***. 
- In this video, we introduce you to the different sections of the course. By the end of the video you should have a clear idea of how to make the best use of the course.
- We have organized this course into 6 different sections. We have designed each section to be independent of each other. That means, you have the flexibility of customizing the course based on your skills and your needs. 
- If you have experience with Spring and Spring Boot, you can skip these sections.
- Lets get a quick overview of each of the sections now:
  - Section I is an one hour introduction to Spring 
  - Section II is an one hour introduction to Spring Boot..
- In summary this is your course. Feel free to create your own path and tailor it to your needs.
- I will see you in the next video where we introduce you to our github repository

#### Overview of the Github Repository
- Welcome Back. In this video, we give you an overview of how our github repository for this course is organized. 
- Github repository for this course is at ****.
- Home page of the github repository has an overview of the course and installation guide
- For each hands-on section of the course, we have a seperate folder in the repository. You can see these five folders for *** different sections
  - Folder 1 contains ...
  - Folder 2 contains ...
  - Folder 3 contains ...
- Each of these folders contain
  - Step by Step details of the sections
  - Complete code example at the end of the section
  - Intermediate backups at different stages of the section
  - Useful Links
- For example, let's look at the folder for ***. Home page of the folder contains
  - Step by step details : What are we going to do in each step
  - Useful Links : Different links that would be useful during the course
  - Complete Code, Snippets and Examples : Example code that your can use during the section. For example, If you are using a class and you do not know the package of the class, you can search here and quickly find what you would need.
  - Intermediate Backups : You can download any of these zips and import them into Eclipse as maven projects. File > Import > Existing Maven Projects.
  - Understanding our github repository is key part of making best use of this course. I recommend to spend some time with our github repository and I will see you in the next video.

#### Installation of Tools Video
- In this video, we will help you install all the basic tools to get you started with the course
- We use 
  - Maven for Dependency Management
  - Eclipse as IDE
  - ..
- Step by step details to install Java, Eclipse and Maven are in the installation guide present here. Also included are links to 5 videos that will help you to install and trouble shoot installations.
- If you have any problems during the course, we recommend you to look at the troubleshooting section of the installation playlist.
- Get your tools ready and I will see you in the course

#### Each Section Introduction
- Why is this section important to the course?
-  What is discussed in this section?
- What is the github folder for this section?
- Can a student skip this sections?
- Is there a trouble shooting guide?
- What are the backups available?
- Are examples in this section dependent on any other section?

#### Conclusion Video
- Congratulations! You have successfully completed the course on ... We covered a wide range of topics starting from Spring, Spring Boot to ..... I'm sure you had a lot of fun doing this course. If you loved this course, we would love to hear from you. Do not forget to leave us a review. Until we see you in another in28minutes course, here's bye from the team here at in28minutes.
- To find out more about *** use these References  

## Templates

### Welcome Message
```

## ADD A FEW SAMPLE REVIEWS AFter a couple of months
## ADD A FEW SAMPLE REVIEWS - in the description of the course 

Congratulations on joining this course from in28Minutes. 

We have 6800+ 5 Star reviews on our courses.  

I hope that by the time you are prompted to leave a review, that you think this course is an amazing course and can write a few sentences about what you like about the course for future students to see. If you do not think this course is a 5-star course, we want to make it a better course for you! Please message me with ways that I can make it the best course for you.

There are three things you need to understand before you start this course!

1...... Listen + See + Do Hands-on + Repeat = 90% Retention
For the first 2 hours, we repeat a few concepts to help you retain them. .

2...... Set Yourself a Goal
Set 1 hour aside every day for the next week for this course! No exceptions allowed :) 

3...... Udemy asks you for a review very early in the course! If you are not ready for giving a review, you can skip giving a review.

Thank you and enjoy the course,
Ranga
```

### Thank You for completing the course message

```
Congratulations on completing the course from in28Minutes.

We have 6800+ 5 Star reviews on our courses. We hope you think this course is an amazing course and can write a few sentences about what you like about the course for future students to see.

We are on a constant journey to improve our courses further. Do message me if you have any suggestions.

Good Luck for your future.

Ranga from in28Minutes
```

### Bonus Lectures

```
Our Best Selling Courses
Get unbelievable offers on all our best-selling courses!
http://eepurl.com/bOJulL

```

## Exercises
- TODO

## Future Things To Do
- TODO

## About in28Minutes
- At in28Minutes, we ask ourselves one question everyday. How do we help you learn effectively - that is more quickly and retain more of what you have learnt?
- We use Problem-Solution based Step-By-Step Hands-on Approach With Practical, Real World Application Examples. 
- Our success on Udemy and Youtube (2 Million Views & 12K Subscribers) speaks volumes about the success of our approach.
- While our primary expertise is on Development, Design & Architecture Java & Related Frameworks (Spring, Struts, Hibernate) we are expanding into the front-end world (Bootstrap, JQuery, Angular JS). 

### Our Beliefs
- Best Courses are interactive and fun.
- Foundations for building high quality applications are best laid down while learning.

### Our Approach
- Problem Solution based Step by Step Hands-on Learning
- Practical, Real World Application Examples.
- We use 80-20 Rule. We discuss 20% things used 80% of time in depth. We touch upon other things briefly equipping you with enough knowledge to find out more on your own. 
- We will be developing a demo application in the course, which could be reused in your projects, saving hours of your effort.
- We love open source and therefore, All our code is open source too and available on Github.

### Other Courses

- [Check out all our courses with 100,000 Students](https://courses.in28minutes.com/courses)
- [25 Videos and Articles for Beginners on Spring Boot](http://www.springboottutorial.com/spring-boot-tutorials-for-beginners)
- Our Best Courses with 66,000 Students and 4,000 5-Star Ratings
  * [Java Interview Guide : 200+ Interview Questions and Answers](https://www.udemy.com/java-interview-questions-and-answers/?couponCode=JAVA_INTER_GIT)
  * [First Web Application with Spring Boot](https://www.udemy.com/spring-boot-first-web-application/?couponCode=SPRING-BOOT-1-GIT)
  * [Spring Boot Tutorial For Beginners](https://www.udemy.com/spring-boot-tutorial-for-beginners/?couponCode=SPRING-BOOT-GIT)
  * [Mockito Tutorial : Learn mocking with 25 Junit Examples](https://www.udemy.com/mockito-tutorial-with-junit-examples/?couponCode=MOCKITO_GIT)
  * [Java EE Made Easy - Patterns, Architecture and Frameworks](https://www.udemy.com/java-ee-design-patterns-architecture-and-frameworks/?couponCode=EEPATTERNS-GIT)
  * [Spring MVC For Beginners : Build Java Web App in 25 Steps](https://www.udemy.com/spring-mvc-tutorial-for-beginners-step-by-step/?couponCode=SPRINGMVC-GIT)
  * [JSP Servlets For Beginners : Build Java Web App in 25 Steps](https://www.udemy.com/learn-java-servlets-and-jsp-web-application-in-25-steps/?couponCode=JSPSRVLT-GIT)
  * [Maven Tutorial - Manage Java Dependencies in 25 Steps](https://www.udemy.com/learn-maven-java-dependency-management-in-20-steps/?couponCode=MAVEN_GIT)
  * [Java OOPS in 1 Hours](https://www.udemy.com/learn-object-oriented-programming-in-java/?couponCode=OOPS-GIT)
  * [C Puzzle for Interview](https://www.udemy.com/c-puzzles-for-beginners/?couponCode=CPUZZLES-GIT)
  
### Useful Links
- [Our Website](http://www.in28minutes.com)
- [Facebook](http://facebook.com/in28minutes)
- [Twitter](http://twitter.com/in28minutes)
- [Google Plus](https://plus.google.com/u/3/110861829188024231119)

 ### Graphviz
 
 ```
 digraph G {
  color="#1BA84A";//green
  color="#D14D28";//orange
  color="#59C8DE";//blue

  node[style=filled,color="#59C8DE"]
  
  subgraph cluster_0 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    Code[label=<Automation Code + Libraries<BR />
    <FONT POINT-SIZE="10">Java, Python etc</FONT>>];
    WebDriver[label=<Web Driver<BR />
    <FONT POINT-SIZE="10">Chrome Driver, Firefox Driver,<BR /> Safari Driver, IE Driver etc</FONT>>];
    Browser[label=<Browser<BR />
        <FONT POINT-SIZE="10">Chrome, Firefox, Safari, IE etc</FONT>>];
    Code -> WebDriver -> Browser;
    label = "Single    System";
  }
    
  RunTests[label=<Run Automation Tests<BR />
        <FONT POINT-SIZE="10">Manually, Continuous Integration etc</FONT>>];
  Application[label=<Web Application<BR />
        <FONT POINT-SIZE="10">Todo Management, Google, Facebook etc</FONT>>];

  RunTests -> Code;
  Browser -> Application;

  RunTests [shape=Mdiamond];
  Application [shape=rectangle];

}

digraph SeleniumStandAlone {
  color="#1BA84A";//green
  color="#D14D28";//orange
  color="#59C8DE";//blue

  node[style=filled,color="#59C8DE"]
  
      subgraph cluster_2 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    WebDriver[label=<Web Driver<BR />
    <FONT POINT-SIZE="10">Chrome Driver, Firefox Driver,<BR /> Safari Driver, IE Driver etc</FONT>>];
    Browser[label=<Browser<BR />
        <FONT POINT-SIZE="10">Chrome, Firefox, Safari, IE etc</FONT>>];
    StandaloneServer[];
    StandaloneServer -> WebDriver -> Browser;
    label = "Stand Alone Server";
  }

  subgraph cluster_0 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    Code[label=<Automation Code + Libraries<BR />
    <FONT POINT-SIZE="10">Java, Python etc</FONT>>];
    Code -> StandaloneServer
    label = "System 1";
  }
    
  subgraph cluster_1 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    Code1[label=<Automation Code + Libraries<BR />
    <FONT POINT-SIZE="10">Java, Python etc</FONT>>];
    Code1 -> StandaloneServer
    label = "System 2";
  }

 
  Application[label=<Web Application<BR />
        <FONT POINT-SIZE="10">Todo Management, Google, Facebook etc</FONT>>];

  
  Browser -> Application;

  Application [shape=rectangle];

}

digraph SeleniumGrid {
  color="#1BA84A";//green
  color="#D14D28";//orange
  color="#59C8DE";//blue


  node[style=filled,color="#59C8DE"]
  
        subgraph cluster_3 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    WebDriver[label=<Web Driver<BR />
    <FONT POINT-SIZE="10">Chrome Driver, Firefox Driver,<BR /> Safari Driver, IE Driver etc</FONT>>];
    Browser[label=<Browser<BR />
        <FONT POINT-SIZE="10">Chrome, Firefox, Safari, IE etc</FONT>>];
    SeleniumNode1[label="Selenium Node"];
    SeleniumNode1 -> WebDriver -> Browser;
    label = "Selenium Node 1";
  }

      subgraph cluster_4 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    WebDriver2[label=<Web Driver<BR />
    <FONT POINT-SIZE="10">Chrome Driver, Firefox Driver,<BR /> Safari Driver, IE Driver etc</FONT>>];
    Browser2[label=<Browser<BR />
        <FONT POINT-SIZE="10">Chrome, Firefox, Safari, IE etc</FONT>>];
    SeleniumNode2[label="Selenium Node"];
    SeleniumNode2 -> WebDriver2 -> Browser2;
    label = "Selenium Node 2";
  }
  

      subgraph cluster_2 {
    style=filled;
    color="#59C8DE";
    
    node [style=filled,color="#D14D28", fontcolor=white];
    WebDriver[label=<Web Driver<BR />
    <FONT POINT-SIZE="10">Chrome Driver, Firefox Driver,<BR /> Safari Driver, IE Driver etc</FONT>>];
    Browser[label=<Browser<BR />
        <FONT POINT-SIZE="10">Chrome, Firefox, Safari, IE etc</FONT>>];
        
    SeleniumGrid -> SeleniumNode1;
    SeleniumGrid -> SeleniumNode2;
    label = "Selenium Grid";
  }


    
  Application[label=<Web Application<BR />
        <FONT POINT-SIZE="10">Todo Management, Google, Facebook etc</FONT>>];

  AutomationCode[label=<Automation Code + Libraries<BR />
        <FONT POINT-SIZE="10">Java, Python etc, Application 1..n etc, System 1..n etc </FONT>>];
  
  AutomationCode -> SeleniumGrid;
  Browser -> Application;
  Browser2 -> Application;

  Application [shape=rectangle];
  AutomationCode [shape=Mdiamond];
}


```

### Backup

#### JUnit + Selenium - Google Export from Katalon

```
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearchForIn28minutes {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogleSearchForIn28minutes() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).click();
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("in28minutes");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```

#### JUnit + Selenium - Facebook Export from Katalon

```
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFacebookLogin() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("in28minutes");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("dummy");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

```

#### TestNg + Selenium - Google Export from Katalon

```
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearchForIn28minutes {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogleSearchForIn28minutes() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("lst-ib")).click();
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("in28minutes");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
```

#### TestNg + Selenium - Facebook Export from Katalon

```
package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFacebookLogin() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("in28minutes");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("dummy");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

```
