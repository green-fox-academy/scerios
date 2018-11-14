package SharpieSet;

public class SharpieValues {
  String color;
  float width;
  float inkAmount = 10;

  public SharpieValues(float width, String color) {
    this.width = width;
    this.color = color;
  }

  public float currentInkAmount() {
    return this.inkAmount;
  }

  public float getWidth() {
    return this.width;
  }

  public float use() {
    return this.inkAmount -= 10;
  }
}
