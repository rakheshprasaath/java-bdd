Feature: Application Login

    Scenario Outline: Admin Page default Login
        Given User is on Netbanking landing Page
        When User Login into Application with "<user>" and password "<password>"
        Then Home Page is displayed
        And Cards are displayed

Examples:
    | user | password |
    | admin | 123 |
    | operational| 1234 |