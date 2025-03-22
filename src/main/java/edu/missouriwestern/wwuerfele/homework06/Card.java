package edu.missouriwestern.wwuerfele.homework06;

public class Card {
    private String face;
    private String name;
    private int value;

    public Card(String face, String name, int value){
        this.face = face;
        this.name = name;
        this.value = value;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
