import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    // Create scene objects
    LastYear lastYear = new LastYear();
    NewYear newYear = new NewYear();

    // Call top level methods
    lastYear.drawScene();
    newYear.drawScene();

    // Play scenes (in order of arguments)
    Theater.playScenes(lastYear, newYear);
    
    
  }
}