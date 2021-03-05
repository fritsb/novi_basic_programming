package nl.streeksoft.novi;

public class Teacher extends Person {
    private Integer teacherNumber;
    private Integer roomNumber;

    public Teacher(Integer teacherNumber, Integer roomNumber, String firstName, String lastName) {
        this.teacherNumber = teacherNumber;
        this.roomNumber = roomNumber;
        super.firstName = firstName;
        super.lastName = lastName;
    }

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getAllDetails() {
        return "Docent met de naam " + this.getFullName() +
                " zit in kamer " + this.getRoomNumber();
    }
}
