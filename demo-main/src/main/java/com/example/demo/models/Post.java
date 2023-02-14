package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anonce, fulltext, image;
    private int views;

    public String getLastBet() {
        return lastBet;
    }

    public void setLastBet(String lastBet) {
        this.lastBet = lastBet;
    }

    private String lastBet="";

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")

    private User author;

    public User getAuthor() {
        return author;
    }
    public String getAuthorName(){
        return author != null ? author.getUsername() : "<none>";
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnonce() {
        return anonce;
    }

    public void setAnonce(String anonce) {
        this.anonce = anonce;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public int getViews() {
        return views;
    }



    public void setViews(int views) {
        this.views = views;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Post() {
    }

    public Post(String title, String anonce, String fulltext, User user) {
        this.author = user;
        this.title = title;
        this.anonce = anonce;
        this.fulltext = fulltext;
    }
}
