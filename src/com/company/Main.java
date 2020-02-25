package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // - Single Comment
        /* Block Comment */
        System.out.println();

        // Phase 1

        Scanner keyboard;
        String verb;
        String object;
        String adjective;
        String letter;
        String bodyPart;
        String job;
        String differentJob;
        String objectTwo;
        String verbTwo;
        String objectThree;
        String adjectiveTwo;
        String verbThree;
        String verbFour;
        String time;
        String pluralObject;
        String verbFive;
        String pluralTwo;
        String adjectiveThree;
        String adjectiveFour;
        String objectFour;

        // Phase 2

        keyboard = new Scanner(System.in);
        System.out.println("Gimme a verb broski");
        verbTwo = keyboard.nextLine();
        System.out.println("That's a pretty stupid verb. Anyways, gimme an object");
        objectThree = keyboard.nextLine();
        System.out.println("Okey Dokey. Now I need a job");
        job = keyboard.nextLine();
        System.out.println("Thnx for that. Now I need a letter. Don't pick 4");
        letter = keyboard.nextLine();
        System.out.println("Thnx for not picking 4. Now gimme another object");
        object = keyboard.nextLine();
        System.out.println("Great. Now either your house gets burned down, or you gimme a body part");
        bodyPart = keyboard.nextLine();
        System.out.println("Fine, I'll put the lighter away. I need a different verb now");
        verb = keyboard.nextLine();
        System.out.println("Bep bep lachuga. Give me adjective");
        adjective = keyboard.nextLine();
        System.out.println("I'm slowly losing my mind. I need another job now");
        differentJob = keyboard.nextLine();
        System.out.println("fhkhrgurhkvjrnvkjer THIRD OBJECT");
        objectTwo = keyboard.nextLine();
        System.out.println("Ok, I'm back now. I need another adjective");
        adjectiveTwo = keyboard.nextLine();
        System.out.println("I've run out of jokes. Give me a third verb");
        verbThree = keyboard.nextLine();
        System.out.println("Fourth verb now");
        verbFour = keyboard.nextLine();
        System.out.println("Ok, this TIME I need a period of time. Ex: Minutes, Hours, Seconds");
        time = keyboard.nextLine();
        System.out.println("That was a joke in the previous line if you didn't get it. I need a plural object");
        pluralObject = keyboard.nextLine();
        System.out.println("MORE VERB!!!");
        verbFive = keyboard.nextLine();
        System.out.println("Another plural object plz");
        pluralTwo = keyboard.nextLine();
        System.out.println("You thought the adjectives were gone. Nope, I need another one");
        adjectiveThree = keyboard.nextLine();
        System.out.println("YOU SERIOULY THOUGHT THEY WOULD DISSAPEAR!?!? Nope, ANOTHER ADJECTIVE");
        adjectiveFour = keyboard.nextLine();
        System.out.println("Thnx for sticking with my horrible puns. Finally, I need an object. Enjoy your story :)");
        objectFour = keyboard.nextLine();
        System.out.println("");

        // Phase 3

        System.out.println("Somebody once told me the "+objectThree + " is gonna "+verb + " me");
        System.out.println("I ain't the "+adjectiveTwo + " tool in the "+object);
        System.out.println("She was looking kind of "+adjective + " with her finger and her thumb");
        System.out.println("In the shape of an "+letter + " on her "+bodyPart);
        System.out.println("Well the "+time + " start coming and they don't stop coming");
        System.out.println("Fed to the rules and I hit the "+objectFour + " running");
        System.out.println("Didn't make sense not to live for fun");
        System.out.println("Your brain gets "+adjectiveThree + " but your head gets "+adjectiveFour);
        System.out.println("So much to do, so much to "+verbFive);
        System.out.println("So what's wrong with taking the "+pluralObject + "?");
        System.out.println("You'll never know if you don't go");
        System.out.println("You'll never "+verbThree + " if you don't "+verbFour);
        System.out.println("Hey now, you're an "+job + " get your game on, go play");
        System.out.println("Hey now, you're a "+differentJob + " get the show on, get paid");
        System.out.println("And all that "+objectTwo + " is gold");
        System.out.println("Only "+pluralTwo + " "+verbTwo + " the mold");
    }
}