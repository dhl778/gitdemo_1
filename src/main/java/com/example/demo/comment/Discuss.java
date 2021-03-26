package com.example.demo.comment;

import javax.persistence.*;

@Entity(name = "t_comment")
public class Discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer id;
    private  String content;
    @Column(name = "a_id")
    private  Integer aId;
    private String  author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", aId=" + aId +
                ", author='" + author + '\'' +
                '}';
    }
}
