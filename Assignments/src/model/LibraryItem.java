package model;

public class LibraryItem implements Comparable<LibraryItem>{
    private String type;
    private String name;
    private boolean borrowed;
    public LibraryItem(String type, String name){
        this.type = type;
        this.name = name;
        this.borrowed = false;
    }
    public LibraryItem(LibraryItem item){
        this.type = item.type;
        this.name = item.name;
        this.borrowed = item.borrowed;
    }
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }
    public int compareTo(LibraryItem o) {
        return this.name.compareTo(o.name);
    }
    public boolean getBorrowed(){
        return this.borrowed;
    }
}