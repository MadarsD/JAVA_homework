package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Video> videos = new ArrayList<>();

    public void addVideo(String title){
        videos.add(new Video(title));
        System.out.println("Video " + title + " successfully added");
    }

    public void checkOut(String title){
        for(Video video : videos){
            if(video != null){
                if(video.getTitle().equals(title) && !video.checkoutStatus()){
                    video.isCheckedOut();
                    System.out.println("Video " + title + " is checked out for you!");
                } else {
                    System.out.println("Or inventory dont have this movie or it is checked out");
                }
            }
        }
    }

    public void returnVideo(String title){
        for(Video video : videos){
            if(video != null){
                if(video.getTitle().equals(title)){
                    video.isReturned();
                    System.out.println("Video " + title + " is returned back to video store!");
                } else {
                    System.out.println("This movie was not in our inventory previously!");
                }
            }
        }
    }

    public void rateVideo(String title, int rating){
        for(Video video : videos){
            if(video != null){
                if(video.getTitle().equals(title)){
                    video.receiveRating(rating);
                }
            }
        }
    }

   public void listInventory(){
       System.out.println("===========Your video inventory===============");
       for(Video video : videos){
           if(videos != null){
               System.out.println("Title: " +video.getTitle() + "; Checked out: " +
                       video.checkoutStatus() + "; User rating: " + video.getUserRating());
           }
       }
       System.out.println("==============================================");
   }
}

