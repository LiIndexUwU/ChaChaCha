package dev.LiIndex.ChachaClient.utils.client;

public class ClientUtil {
  public boolean runned;
  public void setRunned() {
    if (mc.isRunning) {
      runned = true;
      onRun();
    }  else if (!mc.isRunning) {
      runned = false;
    }
  }
  public void onRun() {
    Display.setTitle("UwU" + " " + "ChaChaCha" + " | " + mc.getVersion());
  }
}
