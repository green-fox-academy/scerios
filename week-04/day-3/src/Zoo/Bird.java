package Zoo;

public class Bird extends Animal {
  public Bird(String name) {
    super.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
