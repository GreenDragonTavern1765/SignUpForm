# SignUpForm
Description: a kotlin program that runs as a sign up sheet for a website, prompting the user to enter their name, their email address, a password, and a password confirmation,
each of which will be checked to see if the inputs are valid, as well as if the passwords match. If they do, then a welcome message is printed to the screen. 

### Main Attributes
PageHeader: prints Create Account to the screen, there for aesthetics only, doesn't do anything else

Name: textInput that gets the user's full name, first and last name, if this is left blank, then setError() is called and prints an error message

Email: textInput that gets the user's email address, if this is left blank, then setError() is called and prints an error message

Password: textInput that gets the user's password that is input, if this is left blank, then setError() is called and prints error message. This section is also dependent on the
confirmation part, as if the text values of each do not match then a separate error message.

Confirmation: textInput that gets the user's password that is input, if this is left blank, then setError() is called and prints error message. This section is also dependent on the
password part, as if the text values of each do not match then a separate error message is sent. The confirmation section is where the error message is displayed if the passwords do
not match

### Password Match function
A function that checks if the password and confirmation values match. If they do not match, then 0 is returned, otherwise returns 1. It takes in the input as strings for the password
and then confirmation

### Input Match Function
A function that checks each input value, if the value is blank, then returns an error message, otherwise returns 1, as this means something is input, which is ok.
