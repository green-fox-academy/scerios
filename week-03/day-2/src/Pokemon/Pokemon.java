package Pokemon;

public class Pokemon {
  String name;
  String type;
  String isEffectiveAgainst;

  public Pokemon(String name, String type, String isEffectiveAgainst) {
    this.name = name;
    this.type = type;
    this.isEffectiveAgainst = isEffectiveAgainst;
  }

  boolean isEffectiveAgainst(Pokemon anotherPokemon) {
    return this.isEffectiveAgainst.equals(anotherPokemon.type);
  }
}
