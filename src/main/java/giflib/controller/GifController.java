package giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    //using this controller to handle requests to any page of app that displays Gifs
    @RequestMapping(value = "/") //this is the URI pattern that we'll map to this method "/"
    public String listGifs(){
      /**return the name of my html template without the file extension.
      thymeleaf view resolver will find the file for the response **/
        return "home";
    }

    @RequestMapping(value = "/gif")
    @ResponseBody
    public String fig(){
        return "Here is a gif!";

    }
}


