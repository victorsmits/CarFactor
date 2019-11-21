###### Denis Maxime 
###### Smits Victor 
###### Tourneur Bernard

| Analysed by :

Kassabeh Zakariya

El Haddadi Yassine

El Bakkoury Yassine

# Car Factor
Determine minimal values for several car characteristics such as energy efficiency, annual cost, cost of purchase, energy consumption etc, based on a given database. 
This will allow enterprises or particulars to filter cars available, and doing so, determine which cars are "interesting" to buy.  
The user can also classify filtered cars following a criteria of his choice.

## User guide
There is no executable file in this repository; to execute the program, the user must compile it with 
an adequate IDE (java xxx??? compatible). 

This is a console application. All instructions about setting parameters and filters are printed during
the execution. 
## Architecture
The core code lives in the [src/main/java/CarFactor/main.java](src/main/java/CarFactor/main.java) file. 
Functionnalities are declared in different classes, located in the same folder.
Each criteria is a separate class, child of the "Criterion" superclass. 

The database analysed is in a [json file](Data/models.json), in the Data folder.

A [class diagram](Diagram/Carfactor-class-diagram.pdf) describing this program's structure can be found in the Diagram folder, along with 
its [description](Diagram/DiagramDescription.md). 

Jdepend and checkstyle are used to generate reports about metrics and style quality of the project, 
respectively. The generated files are .html files and can be found in the [target/site](target/site) folder.
### Execution flow


#By Analyse Team
### State of progress
To check the state of progress (french) : [State of Progress](StateOfProgress.md)
