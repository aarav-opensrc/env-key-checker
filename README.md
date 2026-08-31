# Env Key Checker

This is a simple Java application that checks your `.env` files against a template `.env.example`. It identifies any keys that are in the example file but missing in your actual `.env` file. This can help ensure that your environment variables are all set up correctly.

## How to Use
1. Place your `.env` file in the project root.
2. Place your `.env.example` file in the project root.
3. Run the `EnvKeyChecker` class to execute the check.

## Requirements
- Java 8 or higher

## Running the Project
Use your favorite IDE or run it from the command line:
```
javac EnvKeyChecker.java
java EnvKeyChecker
```

## License
This project is open-source. Feel free to use and modify it!
