import java.util.Scanner;
import java.util.ArrayList;
public class Fight{
  private Player play;
  private Enemy enem;

 public Fight(Player p, Enemy e) {
  play = p;
  enem = e;


 }
  public void battle(){
    Scanner scan = new Scanner(System.in);
    String press = "";
    // Sets HP's for enemy and player
    play.setHp(play.getHealth());
    enem.setHp(enem.getHealth());
    System.out.println("-----------------------------------------------------------------------------");
    try{
    IO.scrollPrint(enem.getName());
    System.out.println("\n");
    IO.scrollPrint(enem.getQuote());
    System.out.println("\n");
    // Prints out enemy stats and their catchphrase
    System.out.print("Strength: " + enem.getStrength() + " | Speed: "+ enem.getSpeed() + " | Technique: " + enem.getTechnique() + " | Intelligence: " + enem.getIntelligence());
    System.out.println("\n");
     } catch (Exception e) {
  System.out.println(e);
}
    int win = 0;
    while(win == 0){
    int choice = 999;
      // Loop of beating up kids for science till everyone is defeated or you lost
      while(choice == 999){
      System.out.println("\n-----------------------------------------------------------------------------");
      System.out.println("       Punch [P] | Kick [K] | Grapple [G] | EXTREME [X]");
      System.out.println("-----------------------------------------------------------------------------");
      System.out.print("Your Health: {" + play.getHp() +"/"+ play.getHealth()+"}   "  );
      if (play.getSpirit() == 3 ){System.out.print("⍟   ");}
      System.out.println(enem.getName() + "'s Health: {" + enem.getHp() +"/"+ enem.getHealth()+"}   ");
      String c = scan.nextLine();
      c = c.toUpperCase();
      // Choices the player can choose from (can be lower of uppercase)
      if(c.equals("P")){
        choice = 0;
      }else if(c.equals("K")){
        choice = 1;
      }else if(c.equals("G")){
        choice = 2;
      }else if(c.equals("X")){
        if(play.getSpirit() == 3){
          int cho = 999;
          while(cho == 999){
            // Shows the players special moves
            System.out.println("\n-----------------------------------------------------------------------------");
            for(Special sp : play.getExtreme()){ 
              System.out.println(sp.getName());
              System.out.println("------------------------------");
              System.out.println(sp.getDescription());
              System.out.println("\n\n");    
            }
            System.out.println("\nType 'Back' if you want to... (you can guess what it does)");
            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("Which EXTREME attack will you use?");
            System.out.println("\n-----------------------------------------------------------------------------");
            String specchoice = scan.nextLine();
            if(specchoice.equals("Back")){
              cho = 0;
            }else{
              for(Special ss: play.getExtreme()){
                if(specchoice.equals(ss.getName())){
                  cho = 1;
                  Special.runSpecial(ss, play, enem);
                  choice = 3;
                  play.setSpirit(0);
                }
                
              }
            }
          }
          
          
    
        }else{
//Prints if they ran out of spirit and want use a EXTREME move
 System.out.println("⠀⣞⢽⢪⢣⢣⢣⢫⡺⡵⣝⡮⣗⢷⢽⢽⢽⣮⡷⡽⣜⣜⢮⢺⣜⢷⢽⢝⡽⣝\n⠸⡸⠜⠕⠕⠁⢁⢇⢏⢽⢺⣪⡳⡝⣎⣏⢯⢞⡿⣟⣷⣳⢯⡷⣽⢽⢯⣳⣫⠇\n⠀⠀⢀⢀⢄⢬⢪⡪⡎⣆⡈⠚⠜⠕⠇⠗⠝⢕⢯⢫⣞⣯⣿⣻⡽⣏⢗⣗⠏⠀\n⠀⠪⡪⡪⣪⢪⢺⢸⢢⢓⢆⢤⢀⠀⠀⠀⠀⠈⢊⢞⡾⣿⡯⣏⢮⠷⠁⠀⠀\n⠀⠀⠀⠈⠊⠆⡃⠕⢕⢇⢇⢇⢇⢇⢏⢎⢎⢆⢄⠀⢑⣽⣿⢝⠲⠉⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⡿⠂⠠⠀⡇⢇⠕⢈⣀⠀⠁⠡⠣⡣⡫⣂⣿⠯⢪⠰⠂⠀⠀⠀⠀\n⠀⠀⠀⠀⡦⡙⡂⢀⢤⢣⠣⡈⣾⡃⠠⠄⠀⡄⢱⣌⣶⢏⢊⠂⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⢝⡲⣜⡮⡏⢎⢌⢂⠙⠢⠐⢀⢘⢵⣽⣿⡿⠁⠁⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠨⣺⡺⡕⡕⡱⡑⡆⡕⡅⡕⡜⡼⢽⡻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⣼⣳⣫⣾⣵⣗⡵⡱⡡⢣⢑⢕⢜⢕⡝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⣴⣿⣾⣿⣿⣿⡿⡽⡑⢌⠪⡢⡣⣣⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⡟⡾⣿⢿⢿⢵⣽⣾⣼⣘⢸⢸⣞⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠁⠇⠡⠩⡫⢿⣝⡻⡮⣒⢽⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
          System.out.println("NO SPIRIT?");
          choice = 999;
        }
         
      } 
      
      
      }
    // Damage enemy takes based on players choice of move
    if(choice == 0 || choice == 1 || choice == 2 || choice == 3){
      enem.setHp(enem.getHp() - Damage.getAttack(choice, play, enem));
    }
    double punchchance = (0.75 * (double)enem.getStrength()) + (0.25 * (double)enem.getSpeed());
    double kickchance = ((0.75 * (double) enem.getSpeed()) + (0.25 * (double)enem.getSpeed()));
    double grapplechance = enem.getTechnique();
    double compchoice = (Math.random() * (punchchance + kickchance + grapplechance) + 1);
    int computer = 999;
    // Computers choice of moves
    if(compchoice <= punchchance){
      computer = 0;
    }else if(compchoice <= punchchance + kickchance){
      computer = 1;
    } else {
      computer = 2;
    }
    System.out.println("\n");
    play.setHp(play.getHp() - Damage.getHurt(computer, play, enem));
    System.out.println("\n");
    if(enem.getHp() <= 0){
      // Makes sense so its ok (and makes game easier)
      if(play.getHp() <= 0){try{IO.scrollPrint("You clutched the win despite having negative health!");} catch (Exception ex) {System.out.println(ex);}}
      try{IO.scrollPrint(enem.getName() + " was defeated!");} catch (Exception ex) {System.out.println(ex);}
        press = scan.nextLine();
      if(play.getLife() < 3){
        play.setLife(play.getLife() + 1);
      }
      // You beat up a kid for science
      enem.setDefeated(true);
      win = 1;
      // Gain 50 hp after beating up a kid for science
      play.setHealth(play.getHealth() + 50);
      // Stats gained for beating up a kid for science
      play.setStrength(play.getStrength() + enem.getStrengthGained());
      play.setSpeed(play.getSpeed() + enem.getSpeedGained());
      play.setTechnique(play.getTechnique() + enem.getTechniqueGained());
      play.setIntelligence(play.getIntelligence() + enem.getIntelligenceGained());
      if(enem.getSpecial().getIndex() != 0){
        play.addExtreme(enem.getSpecial());
        try {IO.scrollPrint("\nNew EXTREME action: " + enem.getSpecial().getName() + "\n");} catch (Exception e) {System.out.println(e);}
      }
      
    }else if(play.getHp() <= 0){
      win = 2;
      // You got beat up for trying to beat up a kid for science
      try{IO.scrollPrint(enem.getName() + " beat you up!");}catch (Exception ex){System.out.println(ex);}
      System.out.println("\n");
      press = scan.nextLine();
      play.setLife(play.getLife() - 1);
      play.setSpirit(play.getSpirit() + 1);
      if(play.getSpirit() > 3){
        play.setSpirit(3);
      }
    }  

    
    }
    


    //OLD COMBAT SYSTEM, VERY GARBAGE
/*    int result = (int)(Math.random() * (play.power() + enem.power() + 1));
    if(result <= play.power()){
      win = true;
      enem.setDefeated(true);
      
      play.setStrength(play.getStrength() + (int)((enem.statsGained()).get(0))); 
      play.setSpeed(play.getSpeed() + (int)((enem.statsGained()).get(1))); 
      play.setStrength(play.getTechnique() + (int)((enem.statsGained()).get(2))); 
      play.setStrength(play.getIntelligence() + (int)((enem.statsGained()).get(3)));
      play.setHealth(play.getHealth() + (int) (Math.random() * 10));
      System.out.println("Win");
    } else {
      win = false;
      play.setHealth(play.getHealth() - 10);
      System.out.println("Lose");
    }
    */
  

  }


  
}
