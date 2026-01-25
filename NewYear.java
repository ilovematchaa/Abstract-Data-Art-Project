import org.code.theater.*;
import org.code.media.*;
public class NewYear extends Scene {

  //Variables (instance & static)
private String[] captions = {
"Learn new things", "find peace", "no drama", "positive energy"
};

  /**
   * Top level drawScene method
   */
  public void drawScene() {
// Title Screen
    drawTitleScreen();
    // pause here before Images
    pause(2.0);
    drawMiddleScreen();
    pause(2.0);
    // End Screen
    drawEndScreen();
  }
  

  // other methods
   public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("Goals", 140, 175);
    drawText("for", 150, 225);
    drawText("2026", 140, 275);
  }
  public void drawMiddleScreen() {
    setMiddleScreenStyle();
    clear("white");
    drawText("-Learn new things", 50, 155);
    drawText("-Find peace", 50, 215);
    drawText("-No drama", 50, 265);
    drawText("-Positive energy", 50, 315);
    drawText("-Do good in school", 50, 365);
  }
   public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("THE", 150, 215);
    drawText("END", 150, 265);
  }
  public void setTitleScreenStyle() {
    setTextHeight(50);
    setTextColor("purple");
    setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);
  }
  
public void setMiddleScreenStyle() {
  setTextHeight(40);
  setTextColor("purple");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);
}

  public void setEndScreenStyle() {
    setTextHeight(60);
    setTextColor("purple");
    setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);
  }
}
