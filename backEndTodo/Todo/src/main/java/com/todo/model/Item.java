package com.todo.model;


import javax.persistence.*;

@Entity
@Table(name="item")
@Embeddable
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private int itemId;
    @Column
    private String name;
    @Column
    private boolean checked;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folderid")
    private Folder folder;



    public Item() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", checked=" + checked +
                '}';
    }


}
