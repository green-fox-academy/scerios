package pirates.club.pirates.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pirates.club.pirates.services.PirateRepository;
import pirates.club.pirates.services.RepositoryServices;

@Controller
public class MainController {
  RepositoryServices repoService = new RepositoryServices();

  @GetMapping("/")
  public String getInfo(Model model) {
    model.addAttribute("pirate", PirateRepository.getInstance().getPiratesRepo());
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String login(Model model, @RequestParam String name) {
    model.addAttribute("pirateName", repoService.checkPirates(name).getName());
    return "redirect:/";
  }
}
