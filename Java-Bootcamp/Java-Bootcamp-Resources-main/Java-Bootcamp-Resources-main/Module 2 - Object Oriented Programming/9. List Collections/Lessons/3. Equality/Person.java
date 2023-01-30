public class Person {
    private String name;
    private int years;

    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public Person(Person source) {
        this.name = source.name;
        this.years = source.years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
