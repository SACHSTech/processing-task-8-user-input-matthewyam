import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  PImage nana;
  PImage bNana;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
    nana = loadImage("nana.png");
    bNana = loadImage("bNana.png");
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
  
   public void draw() {
	  
  if (mousePressed) {
    image(nana,mouseX,mouseY);
  }
  
  if(keyPressed){
  textSize(50);
  text(key, mouseX,mouseY);
  }

  }

  
  public void mouseWheel() {
    
    image(bNana, mouseX, mouseY);

  }
  
  // define other methods down here.
}