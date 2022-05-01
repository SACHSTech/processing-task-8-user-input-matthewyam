import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage nana;
  PImage bNana;
  PImage rick;
  boolean rickUp = false;
  boolean rickDown = false;
  boolean rickLeft = false;
  boolean rickRight = false;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /**
   * @param nana loads banana image
   * @param bNana loads bigger banana
   * @param rick loads rick's face
   */
  public void setup() {
    background(0, 0, 0);
    nana = loadImage("nana.png");
    bNana = loadImage("bNana.png");
    rick = loadImage("rick.png");
    
  }
/**
 * @param rickX X value for rick's face
 * @param rickY Y value for rick's face
 */
  float rickX = width/2;
  float rickY = height/2; 
  
  
   public void draw() {
	  
  
  if (mousePressed) {
    image(nana,mouseX,mouseY);
  }
  
  if(keyPressed){
  textSize(50);
  text(key, mouseX,mouseY);
  }
  
  image(rick, rickX, rickY);
  
  if(rickUp){
    rickY--;
  }
  if(rickDown){
    rickY++;
  }
  if(rickLeft){
    rickX--;
  }
  if(rickRight){
    rickX++;
  }



  }

  
  public void mouseWheel() {
    
    image(bNana, mouseX, mouseY);

  }

  public void keyPressed(){
    if (keyCode == UP) {
      rickUp = true;
    } 
    else if (keyCode == DOWN) {
      rickDown = true;
    } 
    else if(keyCode == LEFT){
      rickLeft = true;
    }
    else if(keyCode == RIGHT){
      rickRight = true; 
    }

  }
  public void keyReleased(){
    if (keyCode == UP) {
      rickUp = false;
    } 
    else if (keyCode == DOWN) {
      rickDown = false;
    } 
    else if(keyCode == LEFT){
      rickLeft = false;
    }
    else if(keyCode == RIGHT){
      rickRight = false; 
    }

  }
  
  // define other methods down here.
}