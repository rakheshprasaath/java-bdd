Feature: Application Login

    Background:
        Given connect database and set environment
        When connect driver and launch the brower


    @regression
    Scenario Outline: Admin Page default Login
        Given User is on Netbanking landing Page
        When User Login into Application with <user> and password <password>
        Then Home Page is displayed
        And Cards are displayed

    Examples:
        | user | password |
        | admin | 123 |
        | operational| 1234 |

    @smoketest @regression
    Scenario: user signup
        Given User is on Netbanking landing Page
        When User Signup into Application
        |Rakhesh|
        |rakhesh@gmail.com|
        |#Rakhesh223#|
        Then Home Page is displayed
        And Cards are displayed
