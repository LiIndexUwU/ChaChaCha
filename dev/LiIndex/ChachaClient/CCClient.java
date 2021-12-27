package dev.LiIndex.ChachaClient;

import net.minecraft.Minecraft;
import org.apache.Log4J.Logger;
import java.util.concurrent.CopyOnWriteArrayList;

public class CCClient {
  String name;
  public Minecraft mc = Minecraft.getMinecraft();
  Logger LOGGER = new LOGGER();
  public CopyOnWriteArrayList<name> modules = new CopyOnWriteArrayList<name>();
}
