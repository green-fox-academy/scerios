package pirates.club.pirates.services;

public class RepositoryServices {

  public void addPirate(Pirate newPirate) {
    for (Pirate existingPirate : PirateRepository.getInstance().getPiratesRepo()) {
      if (existingPirate.getName().equals(newPirate.getName())) {
        return;
      }
    }
    PirateRepository.getInstance().addPirate(newPirate);
  }

  public Pirate checkPirates(Pirate newPirate) {

    for (Pirate existingPirate : PirateRepository.getInstance().getPiratesRepo()) {
      if (existingPirate.getName().equals(newPirate.getName())) {
        return existingPirate;
      }
    }
    return null;
  }
}
