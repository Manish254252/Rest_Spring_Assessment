# Rest_Spring_Assessment

# Customer Details API

This project implements a RESTful API for managing customer details. The API is designed to accept and store customer information, including name, email, date of birth (DOB), and occupation. The project follows specific rules for assigning customers to groups and ensures data uniqueness.

## Requirements

1. **Customer Details API:**
   - Accept and store customer details: name, email, DOB, and occupation.
   - Implement an enumeration for occupations: developer, chef, plumber, carpenter, other.

2. **Customer Group Assignment:**
   - Assign customers to specific groups based on rules:
     - If the email domain is @hikeon.tech, assign the customer to the "hikeon" customer group.
     - For other domains and occupations 'developer' or 'chef', assign the customer group accordingly.
     - If the user's DOB indicates they are below 18 years old, throw an error and do not save the data into the database.

3. **Database Schema:**
   - Create a database schema with columns: name, email, dob, occupation, and customer group ('hikeon', 'chef', 'developer', or 'NA').

4. **Uniqueness Constraints:**
   - Ensure uniqueness:
     - A duplicate email should not be allowed.
     - The combination of occupation, DOB, and customer group should be unique.

## Technology Stack

- **Language:** Java
- **Database:** Choose a suitable database of your choice.
- **Frameworks or Libraries:** Spring

## Implementation

The project leverages the Java language and the Spring framework to create a robust and scalable API. The chosen database (e.g., MySQL, PostgreSQL, H2) will be used to persist customer information according to the specified schema and uniqueness constraints.

## Setup and Configuration

1. Clone the repository.

2. Configure the database settings in `src/main/resources/application.properties`.

3. Build and run the application using your preferred IDE or the following commands:

   ```bash
   mvn clean install
   mvn spring-boot:run


##API Endpoints
Save Customer:

Endpoint: POST /api/customers

Payload: JSON data with customer details (name, email, dob, occupation)
Get All Customers:


##Testing
JUnit tests are included to validate the functionality of the API. 

Run the tests using:


      mvn test
