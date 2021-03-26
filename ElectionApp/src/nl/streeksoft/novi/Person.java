package nl.streeksoft.novi;

public class Person implements iPerson, Comparable<Person> {
    protected String firstName;
    protected String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void doSomething() {
        System.out.println("Bla bla");
    }

    public void breath() {

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() > 1) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person p) {
        if(this.getAge() == p.getAge()) {
            if(this.getFullName().charAt(0) == p.getFullName().charAt(0)) {
                return 0;
            }
            else if(this.getFullName().charAt(0) > p.getFullName().charAt(0)) {
                return 1;
            }
            return -1;
        }
        else if (this.getAge() > p.getAge() ) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
