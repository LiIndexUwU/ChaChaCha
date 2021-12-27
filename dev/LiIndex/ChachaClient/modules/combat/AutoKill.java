package dev.LiIndex.ChachaClient.modules.combat;

import net.minecraft.Minecraft;
import math.minecraft.util.Hit;
import math.minecraft.util.HitRange;
import net.minecraft.server.Server;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.Player;
import dev.LiIndex.ChachaClient.modules.Module;

public class AutoKill {
  public AutoKill() {
    this.name = "KillAura";
    this.Category = Category.COMBAT;
  }
  
  public void onEnable() {
    mc.getPlayer();
    if (mc.player.isOnServer()) {
      mc.getPlayer().getServer().getEntity().hit().inRange(100);
    } else {
      mc.getPlayer().getWorld().getEntity().hit().inRange(100);
    }
  }
}
