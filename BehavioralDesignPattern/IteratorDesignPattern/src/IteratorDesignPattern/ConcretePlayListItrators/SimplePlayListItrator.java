package IteratorDesignPattern.ConcretePlayListItrators;

import IteratorDesignPattern.PlayList;
import IteratorDesignPattern.PlayListItrator;

public class SimplePlayListItrator implements PlayListItrator {
    private PlayList playList;
    private int index;
    public SimplePlayListItrator(PlayList playList){
        this.playList=playList;
        this.index=0;
    }
    @Override
    public boolean hasNext(){
        return index<playList.getSongs().size();
    }

    @Override
    public String next(){
        return playList.getSongs().get(index++);
    }

}
