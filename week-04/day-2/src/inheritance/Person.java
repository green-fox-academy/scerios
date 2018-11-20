package inheritance;

public class Person {
  String name;
  String gender;
  int age;

  public Person(String name, String gender, int age) {
    this.name = name;
    if (gender != "male" || gender != "female") {
      System.out.println("A persons gender must be either <male> or <female>.");
    }
    this.gender = gender;
    this.age = age;
  }

  public Person() {
    name = "Jane Doe";
    gender = "female";
    age = 30;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " years old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
