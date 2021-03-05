package nl.streeksoft.novi;

public class Student extends Person implements Comparable<Student> {
    private Integer averageGrade;

    public Student() {

    }

    public Student(String newFirstName, String newLastName, Integer newAverageGrade) {
        super.firstName = newFirstName;
        super.lastName = newLastName;
        this.averageGrade = newAverageGrade;
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
