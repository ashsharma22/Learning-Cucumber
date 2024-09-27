@CNN
Feature: Checking top links of CNN
  I want to use this template for my feature file

  @Links
  Scenario Outline: Check Top Links of CNN
    Given I open '<Browser>'
    And go to '<URL>'
    #Then top menu should have the links World,US Politics,Business
    Then top menu should have links 
      | Links    | Title     |
      | Home     | XYZ       |
      | World    | ABC       |
      
    Examples: Running on different browsers and environments
    | Browser |      URL               |
    | Chrome  | http://cnn.com         |   
    | Mozilla | http://cnn.com         |
    | Chrome  | http://staging.cnn.com |
    | Mozilla | http://stagingcnn.com  |  
     