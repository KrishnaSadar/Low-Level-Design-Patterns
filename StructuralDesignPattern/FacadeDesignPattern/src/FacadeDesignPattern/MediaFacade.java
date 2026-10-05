package FacadeDesignPattern;

import FacadeDesignPattern.Subsystems.ImageViewer;
import FacadeDesignPattern.Subsystems.MusicPlayer;
import FacadeDesignPattern.Subsystems.VideoPlayer;

public class MediaFacade {
    private MusicPlayer musicPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MediaFacade(){
        this.musicPlayer=new MusicPlayer();
        this.imageViewer=new ImageViewer();
        this.videoPlayer=new VideoPlayer();
    }
    public void performAction(String action){
        switch (action.toLowerCase()){
            case "playmusic":
                musicPlayer.initializeAudioDrivers();
                musicPlayer.decodeAudio();
                musicPlayer.startPlayback();
                break;
            case "playvideo":
                videoPlayer.setupRenderingEngine();
                videoPlayer.loadVideoFile();
                videoPlayer.playVideo();
                break;
            case "viewimage":
                imageViewer.loadImageFile();
                imageViewer.applyScaling();
                imageViewer.displayImage();
                break;
            default:
                System.out.println("Invalid action!");
        }
    }
}
