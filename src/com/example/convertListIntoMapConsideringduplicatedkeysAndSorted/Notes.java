package com.example.convertListIntoMapConsideringduplicatedkeysAndSorted;

public class Notes {
    private int id;
    private String title;
    private int value;

    public Notes(int id, String title, int value) {
        this.id = id;
        this.title = title;
        this.value = value;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value=" + value +
                '}';
    }
}
