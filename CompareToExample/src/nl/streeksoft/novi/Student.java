package nl.streeksoft.novi;

public class Student implements Comparable<Student> {
    private int age;
    private String fullName;

    public Student(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String toString() {
        return this.getFullName() + " - " + this.getAge();
    }

    @Override
    public int compareTo(Student s) { // return values: -1, 0, 1
        if(this.getAge() == s.getAge()) {
            if(this.getFullName().charAt(0) < s.getFullName().charAt(0)) {
                return -1;
            }
            return 0;
        }
        else if(this.getAge() < s.getAge()) {
            return -1;
        }
        return 1;
    }
}
