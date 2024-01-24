# MakeMyTrip Automation

This is a simple web automation project using Selenium and java. The project is built using Maven as the build tool. The project is built using Page Object Model design pattern. The objective of the project is to automate the following scenarios:

- Navigate to [MakeMyTrip](https://www.makemytrip.com/Railways/) website and search for trains between two stations for a given date and given class.


    | Source Station | Destination Station | Date of Journey | Class |
    |----------------|---------------------|-----------------|-------|
    | Delhi          | Luckhnow            | 20-05-2024      | 3A    |


## Folder Structure
```
.
├── automation.jar
├── pom.xml
├── README.md
├── src
│   └── main
│       └── java
│           └── com
│               └── company
│                   ├── helper.java
│                   ├── Main.java
│                   ├── wait.java
│                   └── webpage.java
└── target
    └── classes
        └── com
            └── company
                ├── helper.class
                ├── Main.class
                ├── wait.class
                └── webpage.class
```

## Prerequisites

- Java 8

- Maven 3.6.3

## How to run the project

- Clone the project

- Navigate to the project directory

- Run the following command to build the project
    ```
    mvn clean install
    ```

- Run the following command to run the project
    ```
    java -jar automation.jar
    ```

- The project will run and the output will be displayed on the console.

## License

This project is licensed under the [DBaJ-NC-CFL](./LICENCE.md)