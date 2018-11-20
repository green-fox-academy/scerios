package inheritance;

public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.gender = gender;
    this.level = level;
    this.age = age;
  }

  public Mentor() {
    name = "Jane Doe";
    gender = "female";
    age = 30;
    level = "intermediate";
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
  }
}
