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
  public String getGoal() {
    return "Be a junior software developer.";
  }

  public String introduce() {
    return super.introduce() + "from " + previousOrganization + " who skipped " + skippedDays + "days from the course already.";
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
