package br.com.cod3r.flyweight.musicPlayer.after.musicFlyweigth;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static FlyweightFactory instance = new FlyweightFactory();
    private Map<String, MusicFlyweight> musicRepository;

    private FlyweightFactory(){
        musicRepository = new HashMap<>();
    }

    public static FlyweightFactory getInstance() {
        return instance;
    }

    public MusicFlyweight getMusic(String desc){
        MusicFlyweight mf = musicRepository.get(desc);
        if (mf == null){
            System.out.println("Creating new Flyweight for " + desc);
            mf = getMusicByString(desc);
            musicRepository.put(desc, mf);
        }
        return mf;
    }

    private MusicFlyweight getMusicByString(String desc) {
        String[] musicData = desc.split(";");
        return new MusicFlyweight(musicData[0], musicData[1], Integer.valueOf(musicData[2]));
    }
}
