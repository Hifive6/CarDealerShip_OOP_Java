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