import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    String press = "";
    System.out.println("'########::'########::::'###::::'########:'####:'##::: ##::'######::::::'##::::'##:'########:::::'##:::'##:'####:'########:::'#####");
    System.out.println(" ##.... ##: ##.....::::'## ##:::... ##..::. ##:: ###:: ##:'##... ##::::: ##:::: ##: ##.... ##:::: ##::'##::. ##:: ##.... ##:'##... ##");
    System.out.println(" ##:::: ##: ##::::::::'##:. ##::::: ##::::: ##:: ####: ##: ##:::..:::::: ##:::: ##: ##:::: ##:::: ##:'##:::: ##:: ##:::: ##: ##:::..");
    System.out.println(" ########:: ######:::'##:::. ##:::: ##::::: ##:: ## ## ##: ##::'####:::: ##:::: ##: ########::::: #####::::: ##:: ##:::: ##:. ######");
    System.out.println(" ##.... ##: ##...:::: #########:::: ##::::: ##:: ##. ####: ##::: ##::::: ##:::: ##: ##.....:::::: ##. ##:::: ##:: ##:::: ##::..... ##");
    System.out.println(" ##:::: ##: ##::::::: ##.... ##:::: ##::::: ##:: ##:. ###: ##::: ##::::: ##:::: ##: ##::::::::::: ##:. ##::: ##:: ##:::: ##:'##::: ##");
    System.out.println(" ########:: ########: ##:::: ##:::: ##::::'####: ##::. ##:. ######::::::. #######:: ##::::::::::: ##::. ##:'####: ########::. ######");       
    System.out.println("........:::........::..:::::..:::::..:::::....::..::::..:::......::::::::.......:::..::::::::::::..::::..::....::........::::......::");
    System.out.println("'########::'#######::'########::::::'######:::'######::'####:'########:'##::: ##::'######::'########:");
    System.out.println(" ##.....::'##.... ##: ##.... ##::::'##... ##:'##... ##:. ##:: ##.....:: ###:: ##:'##... ##: ##.....::");
    System.out.println(" ##::::::: ##:::: ##: ##:::: ##:::: ##:::..:: ##:::..::: ##:: ##::::::: ####: ##: ##:::..:: ##:::::::");
    System.out.println(" ######::: ##:::: ##: ########:::::. ######:: ##:::::::: ##:: ######::: ## ## ##: ##::::::: ######::");
    System.out.println(" ##...:::: ##:::: ##: ##.. ##:::::::..... ##: ##:::::::: ##:: ##...:::: ##. ####: ##::::::: ##...::::");
    System.out.println(" ##::::::: ##:::: ##: ##::. ##:::::'##::: ##: ##::: ##:: ##:: ##::::::: ##:. ###: ##::: ##: ##:::::::");
    System.out.println(" ##:::::::. #######:: ##:::. ##::::. ######::. ######::'####: ########: ##::. ##:. ######:: ########:");   
    System.out.println("::..:::::::::.......:::..:::::..::::::......::::......:::....::........::..::::..:::......:::........::");

    try {
    IO.scrollPrint("Would you like to beat up kids for science? (y/n)");
    String yesno = scan.nextLine(); 
    if(yesno.equals("n")){
      IO.scrollPrint("\"I said no because I wanted to see the flavor text\" - 🤓");
    }else{
      System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠋⠉⠈⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿\n⣿⣿⣿⣿⡏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿\n⣿⣿⣿⢏⣴⣿⣷⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿\n⣿⣿⣟⣾⣿⡟⠁⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⢢⠀⠀⠀⠀⠀⠀⠀⢸⣿\n⣿⣿⣿⣿⣟⠀⡴⠄⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣿\n⣿⣿⣿⠟⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢴⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿\n⣿⣁⡀⠀⠀⢰⢠⣦⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⡄⠀⣴⣶⣿⡄⣿\n⣿⡋⠀⠀⠀⠎⢸⣿⡆⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠗⢘⣿⣟⠛⠿⣼\n⣿⣿⠋⢀⡌⢰⣿⡿⢿⡀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣧⢀⣼\n⣿⣿⣷⢻⠄⠘⠛⠋⠛⠃⠀⠀⠀⠀⠀⢿⣧⠈⠉⠙⠛⠋⠀⠀⠀⣿⣿⣿⣿⣿\n⣿⣿⣧⠀⠈⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⠀⠀⠀⢀⢃⠀⠀⢸⣿⣿⣿⣿\n⣿⣿⡿⠀⠴⢗⣠⣤⣴⡶⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡸⠀⣿⣿⣿⣿\n⣿⣿⣿⡀⢠⣾⣿⠏⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠀⣿⣿⣿⣿\n⣿⣿⣿⣧⠈⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿\n⣿⣿⣿⣿⡄⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣦⣄⣀⣀⣀⣀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠙⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠁⠀⠀⠹⣿⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣿⣿⣿\n⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⢻⣿⡇⠀⠀⠀⠀⠀⠀⢀⠈⣿⣿⡿⠉⠛⠛⠛⠉⠉\n⣿⡿⠋⠁⠀⠀⢀⣀⣠⡴⣸⣿⣇⡄⠀⠀⠀⠀⢀⡿⠄⠙⠛⠀⣀⣠⣤⣤⠄");
    }
    
    press = scan.nextLine();
    IO.scrollPrint("You enter your W6 class.");
    press = scan.nextLine();
    IO.scrollPrint("You remember the horrors that happened to you.");
    press = scan.nextLine();
    IO.scrollPrint("Someone called you a 🤓 yesterday, and you have to find out who did.");
    press = scan.nextLine();
    IO.scrollPrint("This means war.");
    press = scan.nextLine();
    IO.scrollPrint("Defeat W6!");
      } catch (Exception e) {
  System.out.println(e);
}
    int winner = 0;

    
    //initialize special attacks
    press = scan.nextLine();
    Special none = new Special(0, "null", "something went wrong...");
    Special abk = new Special(1, "Abheek's Tech(nique) Adventures", "Improve your technique by watching Abheek's youtube channel(https://www.youtube.com/c/AbheeksTechAdventures/featured)\n(+7 Technique)");
    Special own = new Special(2, "Owen's Singing", "Recover your energy by remembering Owen singing\n(Recovers health to max)");
    Special geo = new Special(3, "Leg Swings", "Increase your speed by doing the sacred leg swings\n(+7 Speed)");
    Special gwt = new Special(4, "Email Mr.White", "Ask Mr.White for math help, but he might not respond\n(50% chance of getting +7 intelligence)");
    Special arm = new Special(5, "Arm Wrestle", "Arm wrestle your opponent with just pure strength!\n(Deals damage equal to 7 times your strength if you win)");
    

    // Stats determined by the people who got picked before them so we can't get canceled on twitter.com
    //       name/strength/speed/technique/intelligence/defeated/quote, special
    //Initialize Player with randomized stats btween 1 and 3
    Player playa = new Player((int)(Math.random()*3) + 1, (int)(Math.random()*3) + 1, (int)(Math.random()*3) + 1, (int)(Math.random()*3) + 1);
    //Initialize Enemies
    Enemy MrWhite = new Enemy("Mr. White",99,99,99,99,false, "So hungry... you...are you food?", none);
    Enemy Kevin = new Enemy("Kevin Tang",3,4,3,30,false, "I just wanna play Pokemon... \nwhy don't we battle right now?", none);
    Enemy Aditya = new Enemy("Aditya Jain",1,1,1,82,false, "I'm not a nerd...(nerd noises)", none);
    Enemy Geoffery = new Enemy("Geoffery Gheorghian",10,65,10,10,false, "---------------------------------------\nW6 HEAVENLY KING - ARCHITECT\nGEOFFERY GHEORGHIAN\n---------------------------------------\n*fart*\nI did not fart.\nI DID NOT FART\nI'LL KILL YOU!!! I SWEAR I DIDN'T FART!!!", geo);
    Enemy OliviaH = new Enemy("Olivia Hu",10,35,2,3,false, "(she's saying threats in fluent German...)\n(...but all you can hear is 'Uber Oktoberfest Bratwurst Blitzkreig')", none);
    Enemy Owen = new Enemy("Owen Edward Stout",5,50,5,5,false, "3 + 3? That should be uh... six.\nSix feet under, that is.", own);
    Enemy Frank = new Enemy("Frank Norris",5,5,5,20,false, "Spare your life?\nI refuse.", none);
    Enemy Aparneesh = new Enemy("Aparneesh Patil",2,1,1,1,false, "I'll kill you if you confuse me with Ashmit again! We're not even remotely similar! \n  -Ashmit", none);
    Enemy Ashmit = new Enemy("Ashmit Tendolkar",10,4,5,1,false, "Shmitty pics... unfollow that right now (and vote me for secretary) unless you want to die!", arm);
    Enemy Abheek = new Enemy("Abheek Dhawan",30,5,5,30,false, "I see++ that you're playing a game in made Java... \nsay your prayers.", abk);
    Enemy Edward = new Enemy("Edward Zhang",3,3,3,1,false, "(he's annoying Mr.J instead of talking to you...)", none);
    Enemy RobertM = new Enemy("Robert Edward Mabbs",20,10,15,10,false, "As the holy protector of Edwards...\nyou must die.", none);
    Enemy JMoney = new Enemy("Jacobus Jagodinskus",15,20,30,35,false, "---------------------------------------\nW6 HEAVENLY KING - PROJECT MANAGER\nJacobus Jagodinskus\n---------------------------------------\nI don't understand why everyone is fighting.\nAll of them are gonna get D's in the class.\n(You cannot resist the urge to say \"D's? more like deez nuts\")\nOkay, that does it. Let's fight.", none);
    Enemy Alex = new Enemy("Alex Abreu",10,5,6,9,false, "Hi, I'm here to show you something I've been working on...\n...It's called your funeral.", none);
    Enemy David = new Enemy("David Jung",10,10,4,1,false, "Die, or else I'll kill you.", none);
    Enemy RobertQ = new Enemy("Robert Quan",2,5,6,2,false, "Yes!!! I finally get to see my stats!\n??? Why are my stats so garbage ???", none);
    Enemy Hariswar = new Enemy("Hariswar Baburaj",21,30,20,19,false, "---------------------------------------\nW6 HEAVENLY KING - TASK MANAGER\nHariswar Baburaj\n---------------------------------------\nAre you done with your project yet? \nBecause if not, god have mercy on you...", none);
    Enemy Grant = new Enemy("Grant Minkler",40,10,20,10,false, "---------------------------------------\nW6 HEAVENLY KING - SCRIBE\nGrant Minkler\n---------------------------------------\nminkleminkleminkleminkle \n(Dev Note: sorry Grant I dont really know what you would say)", none);
    Enemy Christian = new Enemy("Christian Brennan",10,15,25,25,false, "I can't believe that absolute fool/nincompoop/goofball/son of a gun Brian... he forgot my name... \n...and I'm gonna take my anger out on you!", none);
    Enemy OliviaB = new Enemy("Olivia(Roger) Biernacki",15,15,15,15,false, "I would literally prefer any name other than Roger. \n  -Roger", gwt);
Enemy Amelia = new Enemy("Amelia Williams",12,8,15,10,false, "If you don't know who I am, then maybe your best course\nwould be to tread lightly. (Dev Note: sorry Amelia I dont know what you would say so I added a cool Breaking Bad quote)", none);
//    Enemy Aaron = new Enemy("Aaron Tatham",20,10,30,45,false);
//Enemy Brian = new Enemy("Glasses",99,1,1,99,false);

//    Enemy HogRider = new Enemy("Hog Rider",30,90,1,1,false);

    // Adds everyone in W6 into an array
    ArrayList<Enemy> W6 = new ArrayList<Enemy>();
    //W6.add(MrWhite);
    W6.add(Kevin);
    W6.add(Aditya);
    W6.add(Geoffery);
    W6.add(OliviaH);
    W6.add(Owen);
    W6.add(Frank);
    W6.add(Aparneesh);
    W6.add(Ashmit);
    W6.add(Abheek);
    W6.add(Edward);
    W6.add(RobertM);
    W6.add(JMoney);
    W6.add(Alex);
    W6.add(David);
    W6.add(RobertQ);
    W6.add(Hariswar);
    W6.add(Grant);
    W6.add(Christian);
    W6.add(OliviaB);
    W6.add(Amelia);
   // W6.add(HogRider);


    // Runs if winner is not declared
    while(winner == 0){
      System.out.println("-----------------------------------------------------------------------------");
      W6.removeIf(en -> (en.getDefeated() == true));
      for (Enemy e : W6){

        if(e.getName() != "Mr. White" && e.getName() != "Hog Rider"){
        // Groups classmates with a asterisk if they have mid power
        if(e.power() > 500 && e.power() < 1500){
          System.out.print("*");
        }
        // Groups classmates with a exclamation mark if they have high power(boss battle!)
        //1500 because thats the year mr J was born
        if(e.power() >= 1500){
          System.out.print("(!)");
        }
      }
        // Prints out classmates and there stats   <------ AARON WROTE THIS. LOOK AT THIS FOOL SAYING "THERE" INSTEAD OF "THEIR"
        //prints out players stats, health and spirit
        if(e.getName() != "Mr. White" && e.getName() != "Hog Rider"){
        System.out.println(e.getName() + " " + e.getStrength()+"/"+ e.getSpeed() + "/" + e.getTechnique() + "/" + e.getIntelligence());
        }
      }
      
      System.out.println("-----------------------------------------------------------------------------");
      System.out.println("Who to fight?  (Your Stats: " + playa.getStrength() + " Strength/" + playa.getSpeed() + " Speed/" + playa.getTechnique() + " Technique/" + playa.getIntelligence() + " Intelligence)");
      String lifeheart = "";
      if(playa.getLife() == 0){lifeheart = "♡ ♡ ♡";}
      else if(playa.getLife() == 1){lifeheart = "♥ ♡ ♡";}
      else if(playa.getLife() == 2){lifeheart = "♥ ♥ ♡";}
      else if(playa.getLife() == 3){lifeheart = "♥ ♥ ♥";}
      System.out.println("Life: " + lifeheart);
      String spiritstar = "";
      if(playa.getSpirit() == 0){spiritstar = "✧ ✧ ✧";}
      else if(playa.getSpirit() == 1){spiritstar = "✦ ✧ ✧";}
      else if(playa.getSpirit() == 2){spiritstar = "✦ ✦ ✧";}
      else if(playa.getSpirit() == 3){spiritstar = "✦ ✦ ✦";}
      System.out.println("Spirit: " + spiritstar);
      System.out.println("-----------------------------------------------------------------------------");
      if (W6.isEmpty()){System.out.println("Press enter to continue...");}
      if (playa.getLife() == 0){System.out.println("Press enter to continue...");}
      
      String input = scan.nextLine();
      

      // Reads player input and compares their power to find who would win in the battle
      for (Enemy e: W6){
        if(e.getName().equals(input)){
          Fight cheese = new Fight(playa, e);
          cheese.battle();
        }}
      // Sees if everyone is defeated
      if(W6.isEmpty()){
        try {
          //win condition
            System.out.println("\n\n\n\n");
            IO.scrollPrint("Mr. Jagogossdikikidgokoki rises from the rubble, barely able to stand up...");
            press = scan.nextLine();
            IO.scrollPrint("\nMr. J: *cough, cough* I'll admit it. I was the one who called you a 🤓...");
            press = scan.nextLine();
            IO.scrollPrint("\nYour body trembles with rage...");
            press = scan.nextLine();
            IO.scrollPrint("\nMr. J: Are you happy now? You've destroyed the entire classroom for no reason, but in the end...");
            press = scan.nextLine();
            IO.scrollPrint("\nMr. J: *chuckle* You'll always... be.. a 🤓...");
            press = scan.nextLine();
            IO.scrollPrint("\nNo, this isn't right. You've changed by beating up your classmates for no reason. \nYou're no longer the old you.");
            press = scan.nextLine();
            IO.scrollPrint("\nYou: That's okay. Maybe I am a 🤓... because all this time...");
            press = scan.nextLine();
            IO.scrollPrint("\nYou: I was beating up kids for science.");
            press = scan.nextLine();
            IO.scrollPrint("\n🔥🔥🔥✍️ ");
            press = scan.nextLine();
            IO.scrollPrint("\nMr J: No! This cannot be!!!");
            press = scan.nextLine();
            IO.scrollPrint("\nHe said something after that, but all you could hear was '🤓🤓🤓'...");
            IO.scrollPrint("\n\n\n THE END", 4);
            press = scan.nextLine();
            System.exit(0);
          
            
          } catch (Exception partyinusa) {
            System.out.println(partyinusa);
          }
      }
      // You lost and takes you out of the while loop
      if (playa.getLife() <= 0){
        try {
          //lose condition
          IO.scrollPrint("\n\n\nYour vision is getting darker...");
          press = scan.nextLine();
          IO.scrollPrint("\nYou hear a mysterious voice...");
          press = scan.nextLine();
          IO.scrollPrint("\n???: As I thought... you'll always be a 🤓...");
          press = scan.nextLine();
          IO.scrollPrint("\n\n\n 🤓YOU LOSE🤓 ", 4);
          press = scan.nextLine();
          System.exit(0);
          
          } catch (Exception rocker) {
          System.out.println(rocker);
          }
        winner = -99999;
      } 
    }
  }
}
