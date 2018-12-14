package pirates.club.pirates.services;

import java.util.ArrayList;

public class PirateRepository {
  ArrayList<Pirate> piratesRepo;
  private static PirateRepository instance;

  private PirateRepository() {
    this.piratesRepo = new ArrayList<>();
  }

  public static PirateRepository getInstance() {
    if (PirateRepository.instance == null) {
      PirateRepository.instance = new PirateRepository();
    }
    return PirateRepository.instance;
  }

  public ArrayList<Pirate> getPiratesRepo() {
    return this.piratesRepo;
  }

  public void addPirate(Pirate pirate) {
    this.piratesRepo.add(pirate);
  }
}
