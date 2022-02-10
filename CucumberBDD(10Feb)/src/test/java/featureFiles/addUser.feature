Feature: chechking add suer functionality of application

 Scenario Outline: chech the add user and delete a user functionality with valid credentails
 
 
  Given user is on login page
  Then User enter the "<userName>" into username field and "<password>" into password field
  Then user click on login button
  Then user is on home page
  Then user click on Add user
  Then user fill "<empName>" and username and "<pass>" and confirm pass
  Then user delelete button by current "<username>" 
  
  Examples:
      |userName|password|empName    |username|pass        |
      |Admin   |admin123|John Smith |sukhjeet |abc1232@rrr|
      


 