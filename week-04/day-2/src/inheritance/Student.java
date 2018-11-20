package inheritance;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  public Student(String previousOrganization) {
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    name = "Jane Doe";
    gender = "female";
    age = 30;
    previousOrganization = "The School of Life";
    skippedDays = 0;

  }
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm" + name + " a " + age + " year old " + gender + " from " + previousOrganization +
        " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
