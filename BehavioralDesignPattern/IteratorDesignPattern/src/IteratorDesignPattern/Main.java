package IteratorDesignPattern;

public class Main {
    public static void main(String[] args){
        PlayList playlist=new PlayList();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2 Fav");
        playlist.addSong("Song 3");
        playlist.addSong("Song 4 Fav");
        playlist.addSong("Song 5");

        System.out.println("Simple Playlist: ");
        PlayListItrator simplePlaylistItartor=playlist.itrator("Simple");
        while (simplePlaylistItartor.hasNext()){
            System.out.println("Playing Song: "+simplePlaylistItartor.next());
        }

        System.out.println("Shuffled Playlist: ");
        PlayListItrator shuffledPlaylistItrator=playlist.itrator("Shuffled");
        while (shuffledPlaylistItrator.hasNext()){
            System.out.println("Playing Song: "+shuffledPlaylistItrator.next());
        }

        System.out.println("Fav Playlist: ");
        PlayListItrator favPlaylistItrator=playlist.itrator("Fav");
        while (favPlaylistItrator.hasNext()){
            System.out.println("Playing Song: "+favPlaylistItrator.next());
        }
    }
}
