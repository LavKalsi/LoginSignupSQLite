# LoginSignupSQLite App

A Kotlin-based Android app that allows users to register, login, and securely store user information using SQLite.

## Features

- **User Registration**: Allows new users to sign up by providing username, email, and password.
- **User Authentication**: Validates user credentials during login to grant access to the app.
- **SQLite Database**: Stores user information locally on the device.
- **Homepage Display**: Once authenticated, users are greeted with a welcome message.

## Screenshots

| Feature | Screenshot |
|---------|-------------|
| Start Screen | <img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/Screenshots/StartScreen.png" width="200" height="446"/> |
| Signup Screen | <img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/Screenshots/Signup.png" width="200" height="446"/> |
| Login Screen | <img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/Screenshots/Login.png" width="200" height="446"/> |
| Homepage | <img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/Screenshots/HomePage.png" width="200" height="446"/> |
| Icon | <img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/Screenshots/icon.png" width="200" height="200"/> |

<table>
  <tr>
    <td align="center">Signup Screen</td>
    <td align="center">Login Screen</td>
    <td align="center">Homepage</td>
  </tr>
  <tr>
    <td><img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/screenshots/signup.png" width="200" height="356"/></td>
    <td><img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/screenshots/login.png" width="200" height="356"/></td>
    <td><img src="https://github.com/LavKalsi/LoginSignupSQLite/blob/master/screenshots/homepage.png" width="200" height="356"/></td>
  </tr>
</table>


## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/LoginSignupSQLite.git
    cd LoginSignupSQLite
    ```

2. Open the project in Android Studio.

3. Build and run the project on an Android device or emulator.

    OR

    Go to releases and download the APK file.

## Adding App on GitHub

To add the APK file of your app to GitHub, follow these steps:

1. Build your app in Android Studio to generate the APK file. You can find the APK file in the `app/build/outputs/apk/` directory.

2. Create a new release on GitHub:
    - Go to the "Releases" section of your GitHub repository.
    - Click on "Draft a new release".
    - Fill in the tag version (e.g., `v1.0`) and release title (e.g., `Initial Release`).
    - Add a description for your release.
    - Attach the APK file by dragging and dropping it into the release description area or by using the "Attach binaries by dropping them here or selecting them" button.
    - Click on "Publish release" to make the release live.

## Usage

1. **Signup**: Fill out the registration form with required details (username, password, confirm password).
   
2. **Login**: Use registered credentials to log into the app.
   
3. **Homepage**: Upon successful login, view the welcome message.

### Use Cases

- **Personal Use**: Manage login credentials securely on your Android device.
- **Development**: Use as a template for integrating SQLite database in Android apps.
- **Learning**: Understand basic authentication and database handling in Android development.

## Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests.

## Built With

- [Kotlin](https://kotlinlang.org/) - The programming language used.
- SQLite - For local database storage on Android.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Lav Kalsi
