package inheritance;

public class Mentor extends Person {
  String level;

  public Mentor(String name, String gender, String level, int age) {
    this.name = name;
    this.gender = gender;
    if (level != "junior" || level != "intermediate" || level != "senior") {
      System.out.println("A mentors level must be either <junior>, <intermediate> or <senior>.");
    }
    this.level = level;
    this.age = age;
  }

  public Mentor() {
    name = "Jane Doe";
    gender = "female";
    age = 30;
    level = "intermediate";
  }

  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }

  public String introduce() {
    return "Hi, I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor.";
  }
}
