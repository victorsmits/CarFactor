#Class diagram description
This diagram contains 5 main classes. The two first allows us to create car objects.
One is more generic and define the car model. The other inherits the first one and define the car itself.
We also decide to implement a calculator class which allows to compute the cost of the cars.
Then we made a comparator class. This class allows the user to choose criteria to filter and order his car fleet.

##CarModelClass
In this class you can find all the information about a car model. This will allows us to create an object CarModel.
We can fill all the original information about a model.

##CarClass
Thanks to the inheritance with CarModelClass we can create easily a car from the fleet.
We just need to implement some additional features like the year of purchase, the plate number and the mileage.

##CalculatorClass
With this class we can compute the estimate assurance, tax and energy- and annual consumption.
In order to do that we have tax rate as variable. 
This class is related to CarClass to be able to compute all those thing for one given car of the fleet.

##ComparatorClass
This class can be used to filter and order the fleet's cars.
We can find two variables, that are the fleet named "cars" and the criteria.
There are four functions which are filter, cutString, comparator and set criteria.
The first one take the dictionary criteria in parameter and return a new array of cars which fully satisfied the criteria.
The second one just take a string and cut it to identify the criteria. We will need this in the next function.
The following function takes a string in parameter and allows the user to select his desired criteria for the sorting.
Finally the last one is just a setter for the dictionary.

##DisplayClass
This class just allow us to have a return on the display.