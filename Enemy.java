import java.util.ArrayList;
public class Enemy {
  private String name;
  private int strength;
  private int speed;
  private int technique;
  private int intelligence;
  private boolean defeated;
  private String quote;
  private int health;
  private int hp;
  private int strengthGained;
  private int speedGained;
  private int techniqueGained;
  private int intelligenceGained;
  private Special ext;
  
  
  public Enemy(String n, int s, int sp, int t, int i, boolean d, String q, Special ex) {
    name = n;
    //basic stats
    strength = s;
    speed = sp;
    technique = t;
    intelligence = i;
    //whether the player has beat them or not
    defeated = d;
    quote = q;
    //max health
    health = (s+sp+t+i)*10;
    //current health
    hp = health;
    //determines what stats they should give the player once they are defeated
    //based on how their own stats are weighted, plus an extra random
    double average = (strength + speed + intelligence + technique) / 4;
    strengthGained = ((int)((double) (((double) strength)/average) + 0.5));
    speedGained = ((int)((double) (((double) speed)/average) + 0.5));
    techniqueGained = ((int)((double) (((double)technique)/average) + 0.5));
    intelligenceGained = ((int)((double) (((double)intelligence)/average) + 0.5));
    int rand = (int) (Math.random() * 4);
    if(rand < 1){strengthGained += 1;}
    else if(rand < 2){speedGained += 1;}
    else if(rand < 3){techniqueGained += 1;}
    else {intelligenceGained += 1;}
    //which special attack they give upon defeat
    ext = ex;
  }
    public int getStrength() {
      return strength;
    }
    public void setStrength(int s) {
      strength = s;
    }

    public int getSpeed(){
      return speed;
    }
    public void setSpeed(int sp){
      speed = sp;
    }
  
    public int getTechnique() {
      return technique;
    }
    public void setTechnique(int t) {
      technique = t;
    }

    public int getIntelligence() {
      return intelligence;
    }
    public void setIntelligence(int i) {
      intelligence = i;
    }
  
    public boolean getDefeated() {
      return defeated;
    }
    public void setDefeated(boolean d) {
      defeated = d;
    }

    public String getName() {
      return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getQuote(){
      return quote;
    }
//not used very much in the new code, but is used to determine how strong the enemy is to place a marker
    public int power(){
      int pow = strength*speed + strength*technique + technique*intelligence + speed*intelligence;
      return pow;
    }

    public int getHealth(){
      return health;
    }

    public int getHp(){
      return hp;
    }

    public void setHp(int h){
      hp = h;
    }

    public int getStrengthGained(){
      return strengthGained;
    }
    public int getSpeedGained(){
      return speedGained;
    }
    public int getTechniqueGained(){
      return techniqueGained;
    }
    public int getIntelligenceGained(){
      return intelligenceGained;
    }

    public Special getSpecial(){
      return ext;
    }

    
}
