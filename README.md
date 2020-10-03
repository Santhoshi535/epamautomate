# epamautomate

# JAVA SELENIUM AUTOMATION FRAMEWORK

The objective of this project is to build a reusable,  robust automation framework which can be used for preparing/executing web UI related testcases.
DRY Principle - Don't Repeat Yourself. This principle states "the duplication is logic should be eliminated via Abstraction, duplicate process should be eliminted via Automation.
Adding additional, unnecessary code to a codebase increases the amount of work required to enhance and maintain the software in the future.  Duplicate code adds to technical debt.  Whether the duplication stems from Copy Paste Programming or poor understanding of how to apply abstraction, it decreases the quality of the code.  
Duplication in process is also waste if it can be automated.  Manual testing, manual build and integration processes, etc. should all be eliminated whenever possible through the use of automation

This is a reusable automation framework that blends together Selenium WebDriver, TestNG, Maven and CircleCI (CircleCI is a CI/CD tool)

# SCOPE 
In - Scope 
This framework supports automation of Web browsers like chrome, Firefox, IE, Edge and Safari.
This can also be integrated with Cloud browser offering tools like Browserstack and Saucelabs.
Integrated with CircleCI. (CircleCI is a docker based hosted environment )

Out - of - Scope
Mobile responsive check - Emulator/Simulator
Gherkin Styled BDD language

# Advantages

1. Supports Custom Page Object model which represents the screens of AUT as a series of objects and encapsulates the fields represented by a page which ultimately avoids duplication and improves code maintainability and readability.
2. Captures screenshots whenever it is required. 

# Tools and Libraries

1. Custom Page Object Pattern and utility functions
2. Selenium WebDriver: - Browser automation framework
3. JAVA: - Programming language
4. TestNg: - TestNg Java testing framework
5. Maven: - Build tool
6. CircleCI: - Continuous Integration
7. BrowserStack - Cloud Based testing of web/mobile apps
8. Git OR SVN: - Version Control
9. Github or Local Git Server: - Git repository hosted server
10. Intellij Or Eclipse: - Integrated Development Environment
11. SonarQube/SonarLint (optional): - Code Quality and Code Coverage
12. DbUtils Mysql (optional): - Java Database utility api
13. Rest-Assured (optional): - Restful Api framework
14. PhantomJsDriver, GhostDriver: - Full web stack No browser required supporting headless testing

# Test Automation Framework Team

## Venkatesh   - [Git Username](https://github.com/vsalagrama) - [Email](mailto:venkateshsalagrama@gmail.com) - [linkedin](https://www.linkedin.com/in/vsalagrama/)
## Santhoshi   - [Git Username](https://github.com/Santhoshi535) - [Email](mailto:Santhoshi.santhu69@gmail.com) - [linkedin](https://www.linkedin.com/in/santhoshi-gulivindala-6b1b7891)
## Raviteja    - [Git Username](https://github.com/) - [Email]() - [linkedin]()
## Sridhanya   - [Git Username](https://github.com/) - [Email]() - [linkedin]()
## Prasadababu - [Git Username](https://github.com/PrasadaBabuN) - [Email](mailto:prasadababunadimpalli@gmail.com) - [linkedin](https://www.linkedin.com/in/nadimpalli-prasada-babu-220093189)

@Santhoshi535 - Please update the email/linkedin urls


# How to run ?
## System Requirements
Operating System - Ubuntu / Windows / Mac
RAM - 4 GB or more
Java 8 or above
GIT / SVN
Maven

## Pull the latest code from git
	1. Open Terminal or command line cd to the desired folder where the test automation source code needs to be checkout
	2. Type git init
	3. Run command git clone https://github.com/Santhoshi535/epamautomate.git
	   This will download the latest template source code
## Setting up IDE
### Eclipse
configure and install the following plugins in eclipse
	1. Testng
	2. Git Integration
	3. SonarQube/SonarLint
### IntelliJ

## Import Project into Eclipse
File>Import>Maven>Existing Maven Projects>Next> Browse to automationFramework Ensure pom.xml is found Finish
open terminal cd to test root directory run "mvn clean eclipse:eclipse"

## Compile Build or Run Tests
In Terminal, CD to root project directory,
### To clean and compile the build
mvn clean install -DskipTests
### To run all tests
mvn clean install
### To run a specific xml file 
mvn clean
## To Rerun failed test scenarios
@santhoshi535 - PlaceHolder

# Logging 
log4j configured to capture the test execution logs
Configuration file is located at //config/log4j.xml
Execution log is captured in the //log/Automation_Execution.log
# Screenshot
getScreenshot() is used to indicates driver to capture a screenshot and store it in //screenshot/packageName directory.
# Reports
The framework produce index.html report. It resides in the same 'target\surefire-reports' folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.
You can find emailable-report.html from target\surefire-reports to email the test reports. As this is a html report you can open it with browser.
# CircleCI Integration
