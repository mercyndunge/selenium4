
    This repo has example codes with Selenium 4 features.
    Website used for testing is: https://opensource-demo.orangehrmlive.com/
    This repo uses Maven as build tool and TestNG testing framework to run the tests.
    
    Tools Used:
    1.Programming Language: Java
    2.Web Automation Tool: Selenium WebDriver(latest version)
    3.WebDriverManager is used for managing the drivers.
    4.Test Runner: TestNG
    5.Build Tool: Maven
    
    Scenarios covered in this project:
     1. code to login and logout using Selenium
     2. Password reset
     3. Waits in Selenium 4 (Implicit, EXplicit and Fluent waits)
     4. Taking screenshots and saving them
     5. Pressing keys using selenium

End-to-end tests for https://opensource-demo.orangehrmlive.com/
 1. User will navigate to the website and provide their username and password then login. Test credentials: ( Username : Admin Password : admin123 )
 2. User will log out and will be redirected to the login page
 3. User can reset their password by clicking "Forgot your password?" link on the login page
 4. User will take a screenshot of the dashboard after logging in and save it in the project folder.
 5. Scenario for user to login and clicking enter on the keyboard instead of the login button
