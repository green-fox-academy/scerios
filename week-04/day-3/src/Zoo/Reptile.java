package Zoo;

public class Reptile extends Animal {
  public Reptile(String name) {
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
