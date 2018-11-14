package TeachersAndStudents;

public class Class {
  public static void main(String[] args) {
    Teacher Ann = new Teacher();
    Student Rob = new Student();

    Rob.question(Ann);
    Ann.teach(Rob);
  }
}
