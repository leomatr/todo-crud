package com.todo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folder")
public class Folder {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folderid")
    @Id()
    private int folderId;
    @Column
    private String name;
    @OneToMany(mappedBy="folder", fetch = FetchType.EAGER)
    private List<Item> items;

    public Folder() {
    }


    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderId=" + folderId +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
