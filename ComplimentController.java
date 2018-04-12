package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by by9506zi on 4/12/2018.
 */

@RestController
public class ComplimentController {

    private Compliment[] compliments = {
            new Compliment("You look nice today"),
            new Compliment("Your code is awesome!"),
            new Compliment("I hope you have a great day!")
    };

    private Random rnd = new Random();

    @RequestMapping("/random")
    ResponseEntity<Compliment> randomCompliment(){
        Compliment randomCompliment = compliments[rnd.nextInt(compliments.length)];
        return new ResponseEntity<Compliment>(randomCompliment, HttpStatus.OK);
    }
}
