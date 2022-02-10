Feature: chechking add suer functionality of application

 Scenario Outline: chech the add user and delete a user functionality with valid credentails
 
 Given user is on login page
  Then User enter the "<userName>" into username field and "<password>" into password field
  Then user click on login button
  Then user is on home page
  Then user click on time button
  Then enter the emp details "<empDetail>"
  Then click on view button
  Then click on calender and "<pickDate>"
  Examples:
      |userName|password|empName    |username|pass        |empDetail     |pickDate|
      |Admin   |admin123|John Smith |sukhjeet |abc1232@rrr|Jasmine Morgan |20-2-2022|
      