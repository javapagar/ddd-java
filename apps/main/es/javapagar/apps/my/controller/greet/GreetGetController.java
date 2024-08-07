package es.javapagar.apps.my.controller.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class GreetGetController {

    @GetMapping("/greet/{name}")
    public HashMap<String, String> handle(@PathVariable("name") String name){
        HashMap <String, String> greet = new HashMap<>();

        greet.put("greeting","hello "+name);

        return greet;
    }
}
