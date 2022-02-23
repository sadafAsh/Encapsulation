# Encapsulation
         Encapsulation in java is a mechanism to wrap up data and methods together in a single
 unit.It is the process of hiding information details and protecting the data and behaviour of
 the object.It is one of the four important OOP concepts.Encapsulated in java can be created 
 by making all the data members of the class private.Now we can use getter and setter method
 to access the data in it.
         In this project, Account object is being created and data members are all private
 and to access the data make getter and setter methods.
 
 ADVANTAGE OF ENCAPSULATION:
       It helps to achieve the data hiding in java because other classes will not be able to
 access the data through private members.
         It is easy to test.It is better in uniting testing.
        By providing the getter and setter method,we can make the class read-only or write-only.   
      
 
 
JunitTest:
        There is JUnit Test also present for all Encapsulation and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube 
  -Dsonar.projectKey=Encapsulation 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=591f352c4ce6ecdb282fdf0a4e180e0facfd358c