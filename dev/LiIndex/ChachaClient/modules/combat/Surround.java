package dev.LiIndex.ChachaClient.modules.combat;

import net.minecraft.Minecraft;
import math.minecraft.Blocks.Block;
import net.minecraft.server.Server;
import net.minecraft.entity.player.Player;
import math.minecraft.util.place.PlaceBlock;
import dev.LiIndex.ChachaClient.modules.Module;

public class Surround {
  public Surround() {
    this.name = "Surround";
    this.Category = Category.COMBAT;
  }
  
  public void onEnable() {
    mc.getPlayer();
    if (mc.player.isOnServer()) {
      mc.getPlayer().getServer().placeBlock();
    } else {
      System.out.println("this idiot is trynna use Surround in singleplayer :D")
    }
  }
}
