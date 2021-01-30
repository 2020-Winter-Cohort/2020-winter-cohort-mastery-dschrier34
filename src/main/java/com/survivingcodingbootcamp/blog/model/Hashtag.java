package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;



@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Post> post;

    public Hashtag(){
    }

    public Hashtag(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Post> getPost() {return post;
    }

    public void addPost(Post inPost) {this.post.add(inPost); }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}


