/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatoreroulette;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author wesle
 */
public class operatorList {
    protected Random challengeGenerator;
    protected Random defenderGenerator;
    protected Random attackerGenerator;
    protected ArrayList<String> attackers  = new ArrayList<String>();
    protected ArrayList<String> defenders  = new ArrayList<String>();
    protected ArrayList<String> challenges = new ArrayList<String>();
    protected int attackerRandomizer;
    protected int defenderRandomizer;
    protected int challengeRandomizer;
    protected int attackerAmount;
    protected String challenge;
    protected String attacker;
    protected String defender;
    protected UI ui;
    
    // VOICES
           String [] voices = {
                            "/sounds/afterRoller1.wav",
                            "/sounds/afterRoller2.wav",
                            "/sounds/afterRoller3.wav",
                            "/sounds/afterRoller4.wav",
                            "/sounds/afterRoller6.wav",
                            "/sounds/afterRoller7.wav",
                            "/sounds/afterRoller8.wav",
                            "/sounds/afterRoller9.wav",
                            "/sounds/afterRoller10.wav"
                          };
    Random randomVoice = new Random();
    String randomVoicePlayer = voices[randomVoice.nextInt(voices.length)];
    String hover = "/sounds/hover.wav";
    String buttonClick = "/sounds/buttonPress.wav";
    String alertSound = "/sounds/AlertSound1.wav";
    String dialog = "/sounds/dialogOpen.wav";
        
public operatorList() {
        addValuesToArray();
        challengeGenerator = new Random();
        attackerGenerator = new Random();
        defenderGenerator = new Random();
  
        attackerAmount = attackers.size();
        challengeRandomizer = challengeGenerator.nextInt(challenges.size());
        attackerRandomizer = attackerGenerator.nextInt(attackers.size());
        defenderRandomizer = defenderGenerator.nextInt(defenders.size());
        challenge = challenges.get(challengeRandomizer);
        attacker = attackers.get(attackerRandomizer);
        defender = defenders.get(defenderRandomizer);

}
        public void generateRandomOperator() {
                    challengeRandomizer = challengeGenerator.nextInt(challenges.size());
                    attackerRandomizer = attackerGenerator.nextInt(attackers.size());
                    defenderRandomizer = defenderGenerator.nextInt(defenders.size());
                    challengeRandomizer = challengeGenerator.nextInt(challenges.size());
                    challenge = challenges.get(challengeRandomizer);
                    attacker = attackers.get(attackerRandomizer);
                    defender = defenders.get(defenderRandomizer);
                    randomVoice = new Random();
                    randomVoicePlayer = voices[randomVoice.nextInt(voices.length)];
                
        } 
      public void addValuesToArray() {
                              challenges.add("Reroll only after making 2 kills in a round!");
                              challenges.add("You may only use his / her sidearm!");
                              challenges.add("Only reinforce walls outside of objective area");
                              challenges.add("Crouch for the entire round!");
                              challenges.add("You may not stand still.");
                              challenges.add("Do another roll if you dislike current selection!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");
                              challenges.add("None!");     
       
                              attackers.add("sledge");
                              attackers.add("thatcher");
                              attackers.add("ash");
                              attackers.add("thermite");
                              attackers.add("twitch");
                              attackers.add("montagne");
                              attackers.add("glaz");
                              attackers.add("fuse");
                              attackers.add("blitz");
                              attackers.add("iq");
                              attackers.add("blackbeard");
                              attackers.add("buck");
                              attackers.add("hibana");
                              attackers.add("recruit");
                              
                              defenders.add("smoke");
                              defenders.add("mute");
                              defenders.add("castle");
                              defenders.add("pulse");
                              defenders.add("doc");
                              defenders.add("rook");
                              defenders.add("kapkan");
                              defenders.add("tachanka");
                              defenders.add("jager");
                              defenders.add("bandit");
                              defenders.add("frost");
                              defenders.add("valkyrie");
                              defenders.add("echo");
                              defenders.add("recruit");
      }
    }
