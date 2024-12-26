package model;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex gender;

    public Human(String firstName, String lastName, String middleName, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    public Sex getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getFullName(), gender);
    }
}


