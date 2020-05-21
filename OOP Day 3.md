## Object Relationships

### Assoication
* loose relationship, lifetime of object are independent of one another 
* "is-a" relationship(doesn't apply to every instance of an Association)

### Composition
*"has -a" relationship or a "part-of"
* A Dealership 'has-a' Department
    * The Department don't exist outside of a Dealership, therefore its a **Composition** relationship


### Aggregation
* A Dealership also "has" Vehicles, but ist a less tightly coupled relationship
* Vehicles come ang o tthroug the Dealerhip and the Deaership can manipulate them with it "own" them
* But, ultimately, a Vehicle _can_ exist outside of a Dealership - this is called **aggregation**


### Generics
*allows us to create classses and methods that can be used on multiple kinds of data types, elements, etc...
* <E> for elements, <T> for data type, <K> for key, <V> for value
* we can 'bound' our generics to specific user-generate object/type by using the 'extends'  keyword
* example: <E extends Vehicle>

### OOP Design Patterns
* Sounds really intimidating, but it is not
* A convention so wll recognized that it hava a name and when someon calls a pattern by its name, everyone knows what they're taling about


### Factory pattern
* a method for creating objects without exposing the logice needed for creation
* Super common patter in OOP
* using a Factory insulates the consumer rom the actual class implementation
