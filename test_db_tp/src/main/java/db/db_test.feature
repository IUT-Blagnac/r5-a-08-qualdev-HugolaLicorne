# language: en
Feature: Review a database TP

Scenario: The owner of the TP, should be cited somewhere
    Given A database TP to review
    And The TP owner Hugo Berdinel
    Then The TP should cite the owner's name
        # => brew install pdfgrep 
        # => pdfgrep -Ri keyword /some/directory 

Scenario: A database TP should be an original work
    Given A database TP to review
    Then The database TP be checked against plagiarism
        # => https://www.compilatio.net/sso/cas/ut2/ 