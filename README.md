# Personal-Assistant

## Overview

In today's fast-paced world, young working professionals often struggle to find time for self-care amidst their busy schedules. To help address this issue, we have developed the **Personal-Assistant** application. This application is designed to assist users in maintaining a balanced and healthy lifestyle by setting reminders for their daily routines.

The Personal-Assistant application allows users to input their daily activities and schedules, which are then stored securely in a database. When the scheduled time for an activity arrives, the application sends a notification to remind the user to perform the activity. This ensures that important self-care activities are not overlooked, helping users to stay fit and lead a healthier life.

Key functionalities include secure user authentication, routine management, profile updates, and password recovery. The application is built using Java Swing, providing a user-friendly graphical interface for easy interaction.

## Features

- **User Routine Input:** Users can enter their daily routines into the application.
- **Database Storage:** The application stores user details, routines in database.
- **Timed Notifications:** When the system time matches the user's entered time for a specific activity, a notification will appear in a dialog box to remind the user to perform the specified activity.
- **User Authentication:** Secure login and registration system to manage user accounts.
- **Profile Management:** Users can update their profile information and routines.
- **Password Recovery:** Functionality for users to recover forgotten passwords.

## Repository Contents

- `README.md`: Project description and information.
- `adminhomepage.java`: Handles the interface and functionality for the admin homepage.
- `adminlogin.java`: Manages the admin login process.
- `displayroutine.java`: Displays the user's routine in a user-friendly format.
- `forgetpassword.java`: Implements the "forgot password" feature for password recovery.
- `homepage.java`: Serves as the main homepage for the application.
- `login.java`: Manages the user login process.
- `notification.java`: Handles the generation and display of notifications for scheduled activities.
- `registration_page1.java`: The first step in the user registration process.
- `registration_page2.java`: The second step in the user registration process.
- `registration_page3.java`: The third step in the user registration process.
- `resetpassword.java`: Allows users to reset their passwords.
- `settings.java`: Provides an interface for users to change their settings.
- `updateprofile.java`: Allows users to update their profile information.
- `updateroutine.java`: Enables users to update their daily routines.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- An IDE that supports Java (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/megha-uv/Personal-Assistant.git

2. Open the project in your preferred Java IDE.

3. Build the project to resolve any dependencies.

### Running the Application

1. Compile and run the homepage.java file to start the application.
2. Use the application interfaces to register, log in, and set up your daily routine.
3. Ensure that notifications are enabled on your system to receive timely reminders.

## Usage

### User Registration
   - Open the application.
   - Navigate to the registration page.
   - Enter the required information and submit the form.
   - Log in using the registered credentials.
### Setting Up Routines
   - After logging in, navigate to the routine setup page.
   - Enter the activities you want to be reminded of and their respective times.
   - Save the routine to store it in the database.
### Receiving Notifications
   - Ensure the application is running.
   - When the system time matches a scheduled activity, a notification will appear reminding you to perform the activity.

## Screenshots

![Home Page](/images/homepage.png)
*The main interface allows users to navigate through the application, view their routine for the day, and redirect to update their details.*

![Registration Page](/images/registration.png)
*This interface is used to collect the user's routine details through questions and options and store them securely in the database.*

![Display Routine Page](/images/displayroutine.png)
*This interface displays the user's routine details along with the specified time set during registration.*

![Notification Page](/images/notification.png)
*This interface displays reminder notifications for activities specified in the user's routine.*

To view more output images, please check the `images` folder.

## Conclusion

Thank you for exploring our Personal-Assistant application! We hope this tool will assist you in maintaining a healthier and more organized lifestyle by helping you manage your daily routines effectively. Whether it's staying on top of your fitness goals, remembering important tasks, or simply ensuring self-care amidst your busy schedule, Personal-Assistant is here to support you every step of the way.

If you have any questions, feedback, or suggestions for improvement, please don't hesitate to reach out to us. Your input is valuable to us as we continue to enhance and refine the application to better serve your needs.

---




