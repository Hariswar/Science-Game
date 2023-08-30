public class Damage {
  private int type;
  private Player pl;
  private Enemy en;

  //determines amount of damage that the attack does
  //intelligence is a multiplier for all attacks 
  public static int getAttack(int t, Player p, Enemy e){
    int amount = 0;
    if(t == 0){
      //basic attack, punch
      amount = (int)( ((2.3 * p.getStrength()) + (1.7 * p.getSpeed()) + (p.getTechnique())) * (1 + (((double) p.getIntelligence())/100)) );
      try{IO.scrollPrint("You punched " + e.getName() + ", which dealt " + amount + " damage.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
    }
    else if(t == 1){
      double chance = 0.5;
      //kick is usually stronger than punch, but has varying accuracy
      //technique level determines chance if kick hits
      chance += (((double)p.getTechnique())/200);
      double roll = Math.random();
      if(chance >= roll){
        amount = (int)( ((1.7 * p.getStrength()) + (4.2 * p.getSpeed()) + (2.3 * p.getTechnique())) * (1 + (((double) p.getIntelligence())/100)) );
      try{IO.scrollPrint("You landed an ⭒exquisite⭒ kick that dealt " + amount + " damage.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
      }else{
        //miss
        try{IO.scrollPrint("You kicked with all your might!\n...And you whiffed, which is quite goofy indeed.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
        
      }
    }else if(t == 2){
      //grappling takes off a percentage of the opponents health based on technique
       double per = 0.05;
       per += (((double)p.getTechnique())/200);
      amount = (int)((e.getHealth() * per) * (1 + (((double) p.getIntelligence())/100)));
      try{IO.scrollPrint("You wrestled, choked, and locked up " + e.getName() + ", to deal " + amount + " damage.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
      }
      
    return amount;
  }





  //determines enemy damage based on their stats (more in depth on player ^^^)
public static int getHurt(int t, Player p, Enemy e){
    int amount = 0;
    if(t == 0){
      //enemy punch
      amount = (int)( ((2.3 * e.getStrength()) + (1.7 * e.getSpeed()) + (e.getTechnique())) * (1 + (((double) e.getIntelligence())/100)) );
      try{IO.scrollPrint(e.getName() + " punched you with their grubby little hands for " + amount + " damage.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
    }
    else if(t == 1){
      double chance = 0.5;
      //kick hits with chance based on technique
      chance += (((double)e.getTechnique())/200);
      double roll = Math.random();
      if(chance >= roll){
        amount = (int)( ((1.5 * e.getStrength()) + (4.2 * e.getSpeed()) + (2.3 * e.getTechnique())) * (1 + (((double) e.getIntelligence())/100)) );
      try{IO.scrollPrint(e.getName() + " kicked you for " + amount + " damage!");} catch (Exception ex) {System.out.println(ex); amount = 0;}
      }else{
        //kick miss
        try{IO.scrollPrint(e.getName() + " tried to kick...\n...but missed! What a goofballius quandarius quindlesnatchium III!");} catch (Exception ex) {System.out.println(ex); amount = 0;}
        amount = 0;
      }
        
      }else if(t == 2){
       double per = 0.05;
      //enemy grapple
       per += (((double)e.getTechnique())/200);
      amount = (int)((p.getHealth() * per) * (1 + (((double) e.getIntelligence())/100)));
      try{IO.scrollPrint(e.getName() + " hugged you very aggresively, dealing " + amount + " damage.");} catch (Exception ex) {System.out.println(ex); amount = 0;}
      }
      
    return amount;
  }
  
  
}