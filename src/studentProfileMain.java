public class studentProfileMain {
    public static void main(String[] args) {
        studentProfile studentProfileA = new studentProfile("Natasha", "Pierre", 2023,3.89, "Masters in Education");
        studentProfile studentProfileB = new studentProfile("Elyi", "Pierre", 2024, 3.78, "Bachelors in Computer Science");

        studentProfileA.incrementExpectedGraduationYear();
        System.out.println(studentProfileA.firstName  + " " + studentProfileA.lastname + " is expected to graduate in "
                + studentProfileA.expectedGraduationYear + " If study time and assignments " +
                "are not completed on time with a " +studentProfileA.declaredMajor);
        System.out.println("--------------------------------------------------------------------------------------" +
                "----------------------------------------------------------------");
        studentProfileB.incrementExpectedGraduationYear();
        System.out.println(studentProfileB.firstName  + " " + studentProfileB.lastname + " is expected to graduate in "
                + studentProfileB.expectedGraduationYear + " If study time and assignments " +
                "are not completed on time with a " + studentProfileB.declaredMajor);

    }
}
