package model;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class User implements Comparable<User> {
    private final String name;
    private final String id;
    private final List<LibraryItem> itemList;
    public User(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        itemList = new ArrayList<>();
        System.out.println("user created with name " + name + " and id " + id);
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
    public void setItemList(List<LibraryItem> lt) {
        itemList.clear();
        itemList.addAll(lt);
    }
    public List<LibraryItem> getItemList() {
        return new ArrayList<>(itemList);
    }
    public int compareTo(User o) {
        return this.id.compareTo(o.id);
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof User other)) {
            return false;
        }

        return id.equals(other.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
