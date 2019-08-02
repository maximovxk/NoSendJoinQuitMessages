package me.maximovxk;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;

public class NoSendJoinQuitMessages extends PluginBase implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent event) {
		event.setJoinMessage("");
	}
	
	@EventHandler
	public void PlayerQuitEvent(PlayerQuitEvent event) {
		event.setQuitMessage("");
	}

}
