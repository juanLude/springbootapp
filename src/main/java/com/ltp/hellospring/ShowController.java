
package com.ltp.hellospring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 


@Controller
public class ShowController {
    @GetMapping("/shows")
    public String getShows(Model model) {
        model.addAttribute("first", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.addAttribute("second", new Show("Attack on Titan", "Hero", 9.9));
        model.addAttribute("third", new Show("Attack on Titan", "Perfect Game", 9.9));
        model.addAttribute("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        model.addAttribute("fifth", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));

         
        return "shows";
    }
    
}
