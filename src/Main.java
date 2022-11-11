public class Main {

    public static void main(String[] args) {
       int studentAge = 15;
       double studentGPA = 3.45;
       boolean hasPerfectAttendance = true;
       String studentFirstName = "Layla";
       String studentMiddleName = "Belle";
       String studentLastName = "Pierre";
       char studentFirstInitial = studentFirstName.charAt(0);
       char studentMiddleInitial = studentMiddleName.charAt(0);
       char studentLastInitial = studentLastName.charAt(0);

       System.out.println(studentAge);
       System.out.println(studentGPA);
       System.out.println(studentFirstInitial);
       System.out.println(studentMiddleInitial);
       System.out.println(studentLastInitial);
       System.out.println(hasPerfectAttendance);
       System.out.println("My daughter's name is " + studentFirstName + " " + studentMiddleName + " "
               + studentLastName + " " + " and I can't wait to meet her. We are going to have so much fun together!");

    }
}
