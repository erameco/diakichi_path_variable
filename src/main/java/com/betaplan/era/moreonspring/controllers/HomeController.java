package com.betaplan.era.moreonspring.controllers;
import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/daikichi/travel/{city}")
    public String travelToCity(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }
    @GetMapping("/daikichi/lotto/{number}")
    public String checkLottoNumber(@PathVariable int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }

}
