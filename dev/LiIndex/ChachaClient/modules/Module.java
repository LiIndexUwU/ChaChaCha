package dev.LiIndex.ChachaClient.modules;

public class Module {
  public Module m;
  public Category c;
  public static boolean toggled;
  public static int keys;
  public static String name;
  
  int keybind() {
    return keys;
  }
  
  public void setToggled() {
    toggled = !toggled;
    if (m.toggled()) {
      onEnable();
    } else {
      onDisable();
    }
  }
  
  public void onEnable() {}
  
  public void onDisable() {}
  
  public enum Category {
    COMBAT,
    PLAYER,
    MISC,
    MOVEMENT,
    EXPLOITS;
  }
}
