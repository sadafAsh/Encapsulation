# Encapsulation
       
         Encapsulation in java is a mechanism to wrap up data and methods together in a single unit.
         
         It is the process of hiding information details, protecting the data and behaviour of
 the object.
         It is easy to test that means it is better in unit testing.
         It is one of the four important OOP concepts.
         Encapsulated in java can be created  by making  the class members/attributes as private.
         To access the private members, getter and setter methods to be created.
        
         In this project, "Account" object is being created, class members are declared as private 
 and getter and setter methods is created to access the class.   
      
 
 
JunitTest:
        The JUnit Test is done of all the classes in an Encapsulation project  and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 
  
  gradle command to publish code to sonarqube
gradle sonarqube 
  -Dsonar.projectKey=Encapsulation 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=591f352c4ce6ecdb282fdf0a4e180e0facfd358c