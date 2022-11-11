public class studentProfile {
    String firstName;
    String lastname;
    int expectedGraduationYear;
    double gpa;
    String declaredMajor;

    public studentProfile(String firstName, String lastname,
                          int expectedGraduationYear, Double gpa,String declaredMajor) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }
    public void incrementExpectedGraduationYear() {
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}
/*
Student Profile Attributes
- First Name
- Last name
- Expected Year to Graduate
- GPA
- Declared Major

Student Profile Behavior
- The student profile class should have at least one behavior
- Sometimes a student cannot get into the right classes in order
to graduate on time and must graduate the following year
- We should have a function that increments a student's expected graduation year by one

Creating and using a Student Profile
- The student profile class should hae a constructor that initializes all the attributes with dynamic values,
meaning the values that the constructor is called with will determine the values of the attributes
- Your program should create two student profile instances that represent two different student profiles
- Your program should call "incrementExpectedGraduationYear" on one of the student profiles and print
 out their expected graduation year instance value to the console
 */