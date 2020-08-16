# New Design Pattern

The new design pattern that has been implemented for this project is the **Builder Pattern**

# Project Background / Use Case

The goal of this project is an application which builds suits. The application provides a user the ability to customize the suits, with **color** and **size** options. The pricing is also determined automatically, based on the size of the suit pieces.

When the suit has been built priced, the order is either fulfilled in store or by the warehouse

# Project Details
Each suit is comprised of a shirt, pants, shoes, and jacket
 - Along with the main suit features, decorators are also provided
    - These include the ability to add a **shoe shine** or **tie** to their suit ensemble

Suit Features
 - Shirt
    - Solid Shirt
    - Striped Shirt
 - Pants
    - Pleated
    - Flat Front
 - Shoes
    - Oxfords
    - Loafers
 - Jacket
    - Solid Jackeet
    - Striped Jacket
 
Pricing
 - The pricing for each suit piece is dependent upon the size of each piece:
     - Any **shirt** size greater than 15 is *2x the size*, otherwise *1.50x the size*
     - Any **pant** size greater than 30 is *2x the size*, otherwise *1.50x the size*
     - Any **shoe** size greater than 10 is *2x the size*, otherwise *1.50x the size*
     - Any **jacket** size greater than 50 is *2x the size*, otherwise *1.50x the size*
   
 - The decorators are priced as follows:
     - **Shoe shine**: Additional *$5.00*
     - **Tie**: Additional *$10.00*
     
Ordering 
 - If the suit costs less than *$200*, it is fulfilled in the store
 - If the suit costs more than *$200*, it is fulfilled at the warehouse
 
# Design Goals

This project was developed utilizing the **Builder Pattern**, **Decorator Pattern**, **Factory Pattern**, and **Singleton Pattern**

Builder Pattern
 - Utilizing the Builder Pattern allows customized suits to be built

Decorator Pattern
 - Utilizing the Decorator Pattern allows add-ons to be included in the suit build

Factory Pattern
 - Utilizing the Factory Pattern allows the determination for whether an order should be fulfilled in the store or at the warehouse

Singleton Pattern
 - Utilizing the Singleton Pattern allows only one instance of the **SuitBuilder** class to be created
 
# How is the flexibility, of your implementation, e.g., how you add or remove in future new types?

New suit builds can be added via the **SuitBuilder** class. The user must create a new method and outline the color options, sizes, suit pieces, and decorators (if any) to be included

# How is the simplicity and understandability of your implementation?

Each of the suit pieces are concrete implementations of their abstract counterparts. For example, the **Pant** class is an abstract class but includes concrete implementations via the **Pleated** and **FlatFront** classes
 - If a user wishes to add a new suit piece, they can do so by implementing the **SuitPiece** class
 - If a user wishes to add a new suit type (ex. new pant type), they can do so by extending the respective abstract class
 - If a user wishes to add a new decorator, they can do so by extending the **SuitDecorator** class
 
# Have you avoided duplicate code?

Yes, duplicate code has been avoided. Each suit piece has unique features which are inherited via their respective superclasses. The same goes for the decorators as each one is unique and priced differently

# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


