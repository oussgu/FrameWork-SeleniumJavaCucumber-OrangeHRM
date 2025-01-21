Feature: Employee features
  As an HR Manager, I want to add, edit, search, and delete employee records so that I can manage employee details effectively.

  Background: 
    Given I connect to the orangeHRM application
    When I enter valid data for the username field "Admin"
    And I enter valid data for the password field "admin123"
    And I click on the login button
    And I head to the home page "Dashboard"
    And I click on the PIM button
    And I head toword PIM page "Employee Information"
    And I click on the add button
    And I head toword add employee page "Add Employee"
    And I enter a valid first name "ouss"
    And I enter a valid middle name "bit"
    And I enter a valid last name "gueb"
    And I click on save button

  @AddEmployee
  Scenario: I want to add employee records
    Then I head toword the employee detail page "Personal Details"

  @SearchEmployeeByNameandId
  Scenario: I want to search for an existing employee
    And I click on employee list button
    And I enter employee name "ouss"
    And I enter employee Id
    And I click on search button
    Then The employee ID show up in the employee list "ouss"
