package model;
import java.util.ArrayList;
import java.util.UUID;

public class User implements Comparable<User> {
    private final String name;
    private final String id;
    private final ArrayList<LibraryItem> itemList;
    public User(String name, String id) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        itemList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public void addItem(LibraryItem item) {
        itemList.add(item);
    }
    public boolean canBorrow() {
        return itemList.size()<3;
    }
    public int compareTo(User o) {
        return this.id.compareTo(o.id);
    }

}
