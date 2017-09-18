package de.melays.ttt;

import java.util.UUID;

public class StatsEntry {
	
	public UUID uuid;
	public int karma;
	public int passes;
	
	public StatsEntry(UUID uuid , int karma , int passes){
		this.uuid = uuid;
		this.passes = passes;
		this.karma = karma;
	}
	
}
