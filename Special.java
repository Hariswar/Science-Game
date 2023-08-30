
public class Special{
  private int index;
  private String name;
  private String description;
  
    public Special(int i, String n, String d){
      index = i;
      name = n;
      description = d;
    }
  
    public int getIndex(){
      return index;
    }
    public String getName(){
      return name;
    }
    public String getDescription(){
      return description;
    }
  
  // checks the index of the special to see what it should do
    public static void runSpecial(Special spec, Player play, Enemy enem){
      if(spec.getIndex() == 0){
        System.out.println("???");
      }else if(spec.getIndex() == 1){
        try{IO.scrollPrint("You whipped out your phone in the middle of the fight\nand started watching Abheek's youtube channel.");} catch (Exception e) {System.out.println(e);}
        play.setTechnique(play.getTechnique() + 7);
      }else if(spec.getIndex() == 2){
        try{IO.scrollPrint("You remember hearing Owen sing...");} catch (Exception e) {System.out.println(e);}
         play.setHp(play.getHealth());
      }else if(spec.getIndex() == 3){
        try{IO.scrollPrint("You grab onto a wall and start doing some leg swings...");} catch (Exception e) {System.out.println(e);}
        play.setSpeed(play.getSpeed() + 7);
      }else if(spec.getIndex() == 4){
        try{IO.scrollPrint("You ask Mr.White for math help, and hope he responds...");} catch (Exception e) {System.out.println(e);}
        double mrw = Math.random();
        if(mrw > 0.5){
          try{IO.scrollPrint("\nMr. White responded!");} catch (Exception e) {System.out.println(e);}
          play.setIntelligence(play.getIntelligence() + 7);
        }else{
          try{IO.scrollPrint("\nNo response...");} catch (Exception e) {System.out.println(e);}
        }
      }else if(spec.getIndex() == 5){
        try{IO.scrollPrint("Time to arm wrestle!");} catch (Exception e) {System.out.println(e);}
        int parmwres = play.getStrength() * play.getTechnique();
        int earmwres = enem.getStrength() * enem.getTechnique();
        if(parmwres >= earmwres){
          System.out.println("\n💪😎");
          enem.setHp(enem.getHp() - play.getStrength() * 7);
        }else{
          try{IO.scrollPrint("Maybe you should hit the gym...");} catch (Exception e) {System.out.println(e);}
        }
      }
      
    }
  
  
  
  
    
  }
