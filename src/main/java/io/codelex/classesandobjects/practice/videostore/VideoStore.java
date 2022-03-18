package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    private final ArrayList<Video> videos = new ArrayList<>();

    public void addVideo(String title) {
        videos.add(new Video(title));
        System.out.println("Video " + title + " successfully added");
    }

    public void checkOut(String title) {
        boolean flag = true;
        for (Video video : videos) {
            if (video.getTitle().equals(title) && !video.isCheckedOut()) {
                System.out.println("Video " + title + " is checked out for you!");
                video.setCheckedOut(true);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Or inventory dont have this movie or it is checked out");
        }
    }

    public void returnVideo(String title) {
        boolean flag = true;
        for (Video video : videos) {
            if (video.getTitle().equals(title) && video.isCheckedOut()) {
                System.out.println("Video " + title + " is returned back to video store!");
                video.setCheckedOut(false);
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("You cannot return video that has never been checked out!");
        }
    }

    public void rateVideo(String title, int rating) {
        for (Video video : videos) {
            if (video != null) {
                if (video.getTitle().equals(title)) {
                    video.receiveRating(rating);
                }
            }
        }
    }

    public void listInventory() {
        System.out.println("===========Your video inventory===============");
        for (Video video : videos) {
            System.out.println("Title: " + video.getTitle() + "; Checked out: " +
                    video.isCheckedOut() + "; User rating: " + video.getUserRating());
        }
        System.out.println("==============================================");
    }
}

