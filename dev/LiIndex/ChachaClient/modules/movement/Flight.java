package dev.LiIndex.CHachaClient.modules.movement;

import net.minecraft.Minecraft;
import net.minecraft.server.Server;
import math.minecraft.util.movement.Fly;
import net.minecraft.entity.player.Player;
import dev.LiIndex.ChachaClient.modules.Module;

public class Flight {
  public Flight() {
    this.name = "Flight";
    this.Category = Category.MOVEMENT;
  }
  
  public void onEnable() {
    mc.getPlayer();
    if (mc.player.isOnServer()) {
      mc.player.y += 10;
    } else {
      mc.player.y += 30;
    }
  }
}
