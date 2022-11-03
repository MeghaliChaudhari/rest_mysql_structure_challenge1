package com.example.jpachallenge.challenge1.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tracktbl")
public class Track {

    @Id
    private int trackId;
    private String trackName;
    private String trackComment;
    private int rating;
    private String trackArtist;

    public Track() {
    }

    public Track(int trackId, String trackName, String trackComment, int rating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComment = trackComment;
        this.rating = rating;
        this.trackArtist = trackArtist;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComment() {
        return trackComment;
    }

    public void setTrackComment(String trackComment) {
        this.trackComment = trackComment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComment='" + trackComment + '\'' +
                ", rating=" + rating +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }
}
