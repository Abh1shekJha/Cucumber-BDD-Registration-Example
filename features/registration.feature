Feature: Registration
@P1
Scenario: User Registration
Given I am on Registration.jsp Page
When  I insert 'Abhishek' 'Jha' 'abhishekjha@gmail.com' and 'password1234'
Then I naviagate to google.com
