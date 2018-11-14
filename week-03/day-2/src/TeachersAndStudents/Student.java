package TeachersAndStudents;

public class Student {

  public Student() {
  }

  public void learn() {
    System.out.println("I've learned your smart words.");
  }

  public void question(Teacher teacher) {
    System.out.println("Can you tell me about math?");
    teacher.answer();
  }
}
