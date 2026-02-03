import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // Variables (instance & static)
private String[] pictures;
  private String[] captions = {
    "Cabo", "Family Cruise Trip", "European Market", "Halloween", "Mazatlan", "Top Golf"
  };
    
  // Constuctor
  public LastYear() {
    pictures = FileReader.toStringArray("pictures.txt");
  }
  public LastYear(String[] pictures) {
    this.pictures = pictures;
  }
  
  /**
   * Top level drawScene method
   */
  public void drawScene() {
// Title Screen
    drawTitleScreen();
    // pause here before Images
    pause(2.0);
    // Images With Captions (pause in method)
    drawImagesWithCaptions();
    // End Screen
    drawEndScreen();
  }

  // other methods
 public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("Pictures", 100, 175);
    drawText("from", 140, 225);
    drawText("2025", 130, 275);
  }

  /* 
  This method goes through each picture I imported and it also shows the caption of each image.
  */
  public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int index = 0; index < pictures.length; index++) {
      // arguments: image, xPosition, yPosition, width, height, rotation
      drawImage(pictures[index], 0, 0, 400, 400, 0.0);
      // arguments: text, xPosition, yPosition
      drawText(captions[index], 50, 350);
      // arguments: seconds
      pause(2.0);
    }
  }

  public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("THE", 150, 215);
    drawText("END", 150, 265);
  }
  
 /* 
  These methods below are for the fronts, size, and color of the texts for each image and screen
  */

  public void setTitleScreenStyle() {
    setTextHeight(50);
    setTextColor("purple");
    setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);
  }
  
  public void setCaptionStyle() {
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