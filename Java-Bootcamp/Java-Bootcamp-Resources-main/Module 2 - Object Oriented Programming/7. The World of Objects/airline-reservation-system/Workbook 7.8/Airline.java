public class Airline {
    
    Person[] people;

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(people[index]);
    }

    public void setPerson(Person source) {
        this.people[source.getSeatNumber() - 1] = new Person(source); 
    }

}
