package pirates.club.pirates.services;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RepositoryServices {
  private RepositoryServices repoService;

  public void addPirate(Pirate newPirate) {
    for (Pirate existingPirate : PirateRepository.getInstance().getPiratesRepo()) {
      if (existingPirate.getName().equals(newPirate.getName())) {
        return;
      }
    }
    PirateRepository.getInstance().addPirate(newPirate);
  }

  public ArrayList<Pirate> getPirates() {
    return PirateRepository.getInstance().getPiratesRepo();
  }

  public String getName(Pirate pirate) {
    return pirate.name;
  }

  public Pirate checkPirates(String name) {
    return (Pirate) this.repoService
        .getPirates()
        .stream()
        .filter(pirate -> pirate.name.equals(name))
        .collect(Collectors.toList());
  }
}
