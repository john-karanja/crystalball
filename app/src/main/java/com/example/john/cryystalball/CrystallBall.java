package com.example.john.cryystalball;

import java.util.Random;

/**
 * Created by john on 4/30/2015.
 */
public class CrystallBall {
    // Member variables (properties about the object)
  public String[] mAnswers = {
            "It is certain",
            "It is decidedly so",
            "All signs say YES",
            "The stars are not aligned",
            "My reply is no",
            "It is doubtful",
            "Better not tell you now",
            "Concrete and ask again",
            "Unable to answer now"
    };
    // Methods (abilities: things the object can do)

    public String geAnAnswer() {


        String answer = "";

        //Randomly select one of three mAnswers yes,no or maybe
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mAnswers.length);


        answer = mAnswers[randomNumber];

        return answer;

    }
}