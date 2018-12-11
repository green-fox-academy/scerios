package com.webshop.Controllers;

import com.webshop.Item;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebshopController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getitems(Model model) {
    model.addAttribute("item", Stock.listOfItems);
    return "webshop-index";
  }

  @RequestMapping(value = "/addItem", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String addItem(@RequestBody MultiValueMap<String, String> formData) {
    Item newItem = new Item(
        formData.toSingleValueMap().get("name"),
        formData.toSingleValueMap().get("description"),
        Double.parseDouble(formData.toSingleValueMap().get("price")),
        Integer.parseInt(formData.toSingleValueMap().get("quantity"))
    );
    Stock.listOfItems.add(newItem);
    return "webshop-index";
  }
}