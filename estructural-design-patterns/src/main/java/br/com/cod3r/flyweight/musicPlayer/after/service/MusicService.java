package br.com.cod3r.flyweight.musicPlayer.after.service;

import br.com.cod3r.flyweight.musicPlayer.after.model.Music;
import br.com.cod3r.flyweight.musicPlayer.after.musicFlyweigth.FlyweightFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {
	private Map<String, Map<String, Music>> memory;
	
	public MusicService() {
		memory = new HashMap<String, Map<String, Music>>();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		
		Music song = userPlayList.get(desc);
		if(song == null) {
			song = new Music(FlyweightFactory.getInstance().getMusic(desc));
			userPlayList.put(desc, song);
		}
		System.out.println(String.format("%s is listenning '%s'", 
				user, song.getMusicFlyweight().getName()));
		song.listenning();
	}
	public void report() {
		int musicInMemory = 0;
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.println(String.format("%s/%s %d times", 
						music.getMusicFlyweight().getArtist(), music.getMusicFlyweight().getName(),
						music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
				musicInMemory++;
			}
			System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		System.out.println("Total of musics in memory: " + musicInMemory);
	}
}
