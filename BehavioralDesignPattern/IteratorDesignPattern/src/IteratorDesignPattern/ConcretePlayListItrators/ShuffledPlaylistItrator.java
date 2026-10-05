package IteratorDesignPattern.ConcretePlayListItrators;

import IteratorDesignPattern.PlayList;
import IteratorDesignPattern.PlayListItrator;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylistItrator implements PlayListItrator {
    private PlayList playList;
    private int index;
    private ArrayList<String> shuffledSongs;

    public ShuffledPlaylistItrator(PlayList playList){
        this.playList=playList;
        this.shuffledSongs= new ArrayList<>(this.playList.getSongs());
        Collections.shuffle(shuffledSongs);
        this.index=0;
    }
    @Override
    public boolean hasNext() {
        return (index<shuffledSongs.size());
    }
    @Override
    public String next(){
        return shuffledSongs.get(index++);
    }
}
