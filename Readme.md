This is a sample Java Project build using MAVEN

created a sample Hello function. It contains main method. This method calls the Greetings object and display "Hello World" 

 

**Classes:**

Hello.java 

Greetings.java 

 

**Test class **
 
 GreeterTest.java

 

**Folder structure:** 
 

**Maven-Java-Project**

src/main/java/hello 
  1. Hello.java 
  2. Greetings.java 

src/test/java/hello 
  1. GreeterTest.java 

Pom.xml 

 

**Dependencies added:**

  1. Joda Time 
  2. Junit 

 **Maven life cycles:**

  mvn –v : to check if maven is installed 

  mvn compile : run this command in the pom.xml folder. It checks all the depencies and compile classes and put files in target/classes                 folder 

  mvn package: convert project in to jar file. If testing fails, build also fails. Creates a jar file. Use java –jar target/filename.jar 

  mvn install : install the package to local repository and can be used by other applications as libraries.  
