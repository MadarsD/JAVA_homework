package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private boolean checkedOut = false;
    private int userRating;
    private int ratingCount = 0;


    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void receiveRating(int rating) {
       this.userRating += rating;
       ratingCount++;
    }

    public double getUserRating() {
        return userRating/ratingCount;
    }

}
