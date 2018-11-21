package abstracts.interfaces;

public class Gnirts implements java.lang.CharSequence {
  String myGnirt;

  Gnirts(String myGnirt) {
    this.myGnirt = myGnirt;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return charAt(index);
  }

  @Override
  public java.lang.CharSequence subSequence(int start, int end) {
    return null;
  }
}
