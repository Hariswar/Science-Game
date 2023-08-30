import java.util.ArrayList;
public class Player {
  private int strength;
  private int speed;
  private int technique;
  private int intelligence;
  //max health
  private int health;
  //current health
  private int hp;
  //amount of times they can lose before losing the game
  private int life;
  //charge for special attacks, gained by losing battles
  private int spirit;
  private ArrayList<Special> extreme;

  public Player(int s, int sp, int t, int i) {
    strength = s;
    speed = sp;
    technique = t;
    intelligence = i;
    life = 3;
    health = 50;
    hp = 50;
    spirit = 0;
    extreme = new ArrayList<Special>();
    
    
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

  public int getHealth() {
    return health;
  }
  public void setHealth(int h) {
    health = h;
  }

  public int getLife() {
    return life;
  }
  public void setLife(int l) {
    life = l;
  }


  public int getHp() {
    return hp;
  }
  public void setHp(int h) {
    hp = h;
  }

  public int getSpirit() {
    return spirit;
  }
  public void setSpirit(int s) {
    spirit = s;
  }
  

  public int power(){
    int pow = strength*speed + speed*intelligence + intelligence*technique + technique*strength;
    return pow;
  }

  public ArrayList<Special> getExtreme(){
    return extreme;
  }

  public void addExtreme(Special s){
    extreme.add(s);
  }

  public void deleteExtreme(Special spec){
    extreme.remove(spec);
  }

}
