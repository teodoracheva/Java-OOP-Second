import java.util.Scanner;

public class StudentRecordExample {
    public static void main(String[] args){

        System.out.println("Solution with array...");
        solutionWithArray();
        System.out.println("");
    }
    public static void solutionWithArray(){
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
        }

        for(int i = 0; i < students.length; i++){
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Id=");
            students[i].setStudentId(Integer.parseInt(s.nextLine()));

            students[i].setStudentRecord(new StudentRecord()); //!

            System.out.println("Name=");
            students[i].getStudentRecord().setName(s.nextLine());

            System.out.print("Math grade:");
            students[i].getStudentRecord().setMathGrade(Double.parseDouble(s.nextLine()));

            System.out.print("English grade:");
            students[i].getStudentRecord().setEnglishGrade(Double.parseDouble(s.nextLine()));

            System.out.print("Science grade:");
            students[i].getStudentRecord().setScienceGrade(Double.parseDouble(s.nextLine()));
        }
        System.out.println("");

        for(int i = 0; i < students.length; i++){
            System.out.println("Student " + (i + 1) + ": Id =" + students[i].getStudentId() + ",Name =" + students[i].getStudentRecord().getName() + ", Grades= Math:" + students[i].getStudentRecord().getMathGrade() + ", English:" + students[i].getStudentRecord().getEnglishGrade() + ", Science:" + students[i].getStudentRecord().getScienceGrade());
        }
    }
}
