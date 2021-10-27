package com.example.songr.model;

import javax.persistence.*;

@Entity
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length ;
    private  int trackNumber;
    @ManyToOne
    private Album albumSong;

    public Songs(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Songs(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    @Override
    public String toString() {
        return "songModel{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                '}';
    }
}

