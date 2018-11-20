package inheritance;

public class Person {
  String name;
  String gender;
  int age;

  public Person(String name, int age, String gender) {
    this.name = name;
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
