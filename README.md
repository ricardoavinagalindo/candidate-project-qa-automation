# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

## Test Cases

1.- AA_AC1: Verify header with its corresponding tabs are displayed
- TC1: Verify home page logo and home page title are properly displayed and correct
- TC2: Verify 3 main functionality tabs are displayed correctly in header
- TC3: Verify 'INGRESE' button is displayed correctly
- TC4: Verify language selector is displayed with proper default value
2.- AA_AC2: Verify 3 special functionality tabs are displayed above banner
- TC5: Verify 'Reserve' form is properly displayed
- TC6: Verify 'Administre su viaje / Check-in' tab/section is displayed and correct
- TC7: Verify 'Estado de vuelo' form is properly displayed

## Automation

SELENIUM FRAMEWORK

- In order to use this framework, you need to install following prerequisites:
- Java version "1.8.0_341" or newer.
- IntelliJ IDE
- Apache Maven 3.6.3
- Selenium java 4.8.2
- Git
- Chrome browser (Edge, or Firefox works as well)
- TestNG

In this framework you will be able to run and implement new automated tests to interact with website of American Airlines. This framework is intended to collect a set of testcases which will be run periodically to make sure
the site is working fine as expected. Such framework test code is organized using Page Object Model (POM).

### Part 1

TC1: Verify home page logo and home page title are properly displayed and correct
    *Given the user lands on AA homepage
    *When the user waits for the homepage to be fully loaded
    *Then user is able to identify home page logo and home page title are correct.

TC2: Verify 3 main functionality tabs are displayed correctly in header
    *Given the user lands on AA homepage
    *When the user identifies home page header
    *Then user is able to identify 3 main modules are displayed correctly ('PLANIFIQUE SU VIAJE', 'INFORMACIÓN DE VIAJE' and 'AADVANTAGE')

    *Given the user lands on AA homepage
    *When the user clicks on 'PLANIFIQUE SU VIAJE'
    *Then verify user is able to identify corresponding module is displayed just below the header

    *Given the user lands on AA homepage
    *When the user clicks on 'INFORMACIÓN DE VIAJE'
    *Then verify user is able to identify corresponding module is displayed just below the header

    *Given the user lands on AA homepage
    *When the user clicks on 'AADVANTAGE'
    *Then verify user is able to identify corresponding module is displayed just below the header

TC3: Verify 'INGRESE' button is displayed and working correctly
    *Given the user lands on AA homepage
    *When the user clicks on 'INGRESE'
    *Then verify user is redirected to login page and corresponding login page/form is displayed

TC4: Verify language selector is displayed with proper default value
    *Given user lands on AA homepage
    *When the user clicks on language selector button
    *Then verify user identifies the proper form with default values for country and language is displayed correctly

TC5: Verify 'Reserve' form is properly displayed
    *Given user lands on AA homepage
    *When the user scrolls to 'Reserve' section
    *Then verify user is able to identify 'Vuelo' (default pre-selected), 'Hotel' and 'Auto' subtabs
