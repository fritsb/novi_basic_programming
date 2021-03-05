package nl.streeksoft.javafx;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Integer averageGrade;

    public Student() {

    }

    public Student(String newFirstName, String newLastName, Integer newAverageGrade) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.averageGrade = newAverageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Integer averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAverageGrade() == o.getAverageGrade()) {
            if(this.getLastName().charAt(0) == o.getLastName().charAt(0)) {
                return 0;
            }
            else if(this.getLastName().charAt(0) > o.getLastName().charAt(0)) {
                return 1;
            }
            else {
                return -1;
            }
        } else if (this.getAverageGrade() < o.getAverageGrade()) {
            return 1;
        } else {
            return -1;
        }
    }
}
