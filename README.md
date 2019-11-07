# Car Factor
Determine minimal values for several car characteristics such as energy efficiency, annual cost, cost of purchase, energy consumption etc, based on a given database. 
This will allow enterprises or particulars to filter cars available, and doing so, determine which cars are "interesting" to buy.  
The user can also classify filtered cars following a criteria of his choice.

## User guide

## Architecture
The core code lives in the [src/main/java/CarFactor/main.java](src/main/java/CarFactor/main.java) file. 
Functionnalities are declared in different classes, located in the same folder.
Each criteria is a separate class, child of the "Criterion" superclass. 

The database analysed is in a [json file](Data/models.json), in the Data folder.

A [class diagram](Diagram/Carfactor-class-diagram.pdf) describing this program's structure can be found in the Diagram folder, along with 
its [description](Diagram/DiagramDescription.md). 
### Execution flow

