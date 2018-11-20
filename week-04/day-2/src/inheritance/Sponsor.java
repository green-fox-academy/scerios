package inheritance;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;

  }
  public Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;

  }
  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " years old " + gender + " who represents " + company + " and hired "
        + hiredStudents + " students so far";
  }
  public void hire() {
    hiredStudents++;
  }

  public String getGoal() {
    return "Hire brilliant junior software developers.";
  }
}
