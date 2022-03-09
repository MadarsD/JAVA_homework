package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private int userRating;
    private int ratingCount = 0;


    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void isCheckedOut() {
        this.checkedOut = true;
    }

    public void isReturned() {
        this.checkedOut = false;
    }

    public void receiveRating(int rating) {
       this.userRating += rating;
       ratingCount++;
    }

    public double getUserRating() {
        return userRating/ratingCount;
    }

    public boolean checkoutStatus(){
        return checkedOut;
    }
}
