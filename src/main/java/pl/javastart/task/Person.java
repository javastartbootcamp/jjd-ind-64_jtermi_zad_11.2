package pl.javastart.task;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {

        if (firstName == null || lastName == null || firstName.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException();
        }

        if (age < 1) {
            throw new IncorrectAgeException();
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
