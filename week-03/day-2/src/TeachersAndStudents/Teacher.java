package TeachersAndStudents;

public class Teacher {

  public Teacher() {
  }

  public void teach(Student student) {
    System.out.println("Math is bad for you.");
    student.learn();
  }

  public void answer() {
    System.out.println("Sure! Listen closely!");
  }
}
