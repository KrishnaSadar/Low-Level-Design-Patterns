package IteratorDesignPattern;

import IteratorDesignPattern.ConcretePlayListItrators.*;

import java.util.ArrayList;

public class PlayList {
   private ArrayList<String>songs;

   public PlayList(){
       songs=new ArrayList<>();
   }

   public void addSong(String song){
       songs.add(song);
   }

   public PlayListItrator itrator(String type){
       switch (type){
           case "Simple":
                return new SimplePlayListItrator(this);
           case "Shuffled":
                return new ShuffledPlaylistItrator(this);
           case "Fav":
                return new FavPlaylistItrator(this);
           default:
               return null;
       }
   }

   public ArrayList<String> getSongs(){
       return songs;
   }

}
