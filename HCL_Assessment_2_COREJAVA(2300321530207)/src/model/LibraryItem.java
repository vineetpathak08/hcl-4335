package model;
import java.util.UUID;
public class LibraryItem implements Comparable<LibraryItem>{
    private String type;
    private String name;
    private boolean borrowed;
    private final String id;

    public LibraryItem(String type, String name){
        this.type = type;
        this.name = name;
        this.borrowed = false;
        this.id = UUID.randomUUID().toString();
    }
    public LibraryItem(LibraryItem item){
        this.type = item.type;
        this.name = item.name;
        this.borrowed = item.borrowed;
        this.id = item.id;
    }
    public String getId() {
    return id;
}
    public String getName(){
        return new String(name);
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

    @Override
public boolean equals(Object object) {
    if (this == object) {
        return true;
    }

    if (!(object instanceof LibraryItem other)) {
        return false;
    }

    return id.equals(other.id);
}
@Override
public int hashCode() {
    return id.hashCode();
}
}