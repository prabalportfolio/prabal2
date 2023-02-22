# theScore-app

**AppTest Automation Project**
This project is an automation test script written in Java using Appium and Selenium for testing TheScore Sports News & Scores app on an Android device. The script tests the following user scenarios:

Launching the app and navigating through the onboarding screens.
Enabling location services.
Searching for a team by name and verifying the correct team is displayed.
Navigating to the Table page and verifying that the page title is "Table".
Closing the Table page and returning to the previous page.


**Setup Instructions**
To run the test script, follow the instructions below:

Clone the repository to your local machine.
Install Appium and Selenium on your machine.
Install Android SDK and set up an Android emulator or connect a physical device.
Open the project in an IDE (e.g. IntelliJ IDEA, Eclipse).
Set up the project dependencies by adding the following libraries to the classpath:
selenium-java (version 3.14.0 or later)
java-client (version 6.1.0 or later)
Update the src/theScore_ Sports News & Scores_23.1.0_Apkpure.apk file path to the correct location on your machine.
Update the DEVICE_NAME capability in the main() method of BaseTest.java to the name of your Android device.
Run the emulator and appium
Run the AppTest.java file to execute the test script.


**Test Specification**
The test scenario implemented in this project is as follows:

Launch the app and navigate through the onboarding screens.
Enable location services.
Search for a team by name and verify the correct team is displayed.
Navigate to the Table page and verify that the page title is "Table".
Close the Table page and return to the previous page.
Rationale for Test Approach
The test approach for this project was designed to test the functionality of the app's core features from a user's perspective. The test scenario covers the most commonly used features of the app, including searching for a team, viewing a team's information, and navigating to the Table page. The test scenario was designed to be easily understandable and repeatable, making it suitable for both manual and automated testing.

**Test Coverage Assessment**
The test scenario implemented in this project covers the following features of the app:

Launching the app and navigating through the onboarding screens.
Enabling location services.
Searching for a team by name and verifying the correct team is displayed.
Navigating to the Table page and verifying that the page title is "Table".
Closing the Table page and returning to the previous page.
The test scenario covers a significant portion of the app's core functionality and provides good coverage for the features that are most commonly used by users. However, additional test scenarios could be added to cover other features of the app, such as viewing news articles and videos, following specific teams or players, and setting up personalized alerts.
