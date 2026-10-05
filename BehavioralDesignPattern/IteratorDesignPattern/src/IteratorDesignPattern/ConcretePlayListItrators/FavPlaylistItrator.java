package IteratorDesignPattern.ConcretePlayListItrators;

import IteratorDesignPattern.PlayList;
import IteratorDesignPattern.PlayListItrator;

public class FavPlaylistItrator implements PlayListItrator {

    private PlayList playList;
    int index=0;

    public FavPlaylistItrator(PlayList playList){
        this.playList=playList;
        index=0;
    }
    @Override
    public boolean hasNext() {
        while(index<playList.getSongs().size()){
            if(playList.getSongs().get(index).contains("Fav")) return true;
            index++;
        }
        return false;
    }

    @Override
    public String next() {
        return playList.getSongs().get(index++);
    }
}
