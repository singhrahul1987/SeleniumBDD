Feature: Auto trader search scenario

	@smoke @regression
  Scenario: Verify home page elements present
    Given Open chrome and launch www.autotrader.com
    When Home page is ready
    Then Links buttons and drop down should be visible

	@regression
  Scenario: Verify advanced search functionality
    Given Advanced search page is loaded
    When Searched with attributes
    Then Results should be displayed according to criteria given