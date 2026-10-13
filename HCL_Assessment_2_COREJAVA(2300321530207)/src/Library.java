import exception.Exceptions;
import model.LibraryItem;
import model.User;

import java.util.ArrayList;


public class Library {
    private final ArrayList<LibraryItem> items = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();

    public void addItem(LibraryItem item){
        if(item==null) return;
        items.add(item);
    }
    public void addUser(User user){
        if(user==null) return;
        users.add(user);
    }
    public ArrayList<LibraryItem> getItems(){
        return new  ArrayList<>(items);
    }
    public ArrayList<User> getUsers(){
        return new  ArrayList<>(users);
    }

    public void borrowItem(LibraryItem item, User user){
        if(item==null) throw new Exceptions("Item is null Please provide a valid item");
        if(user==null) throw new Exceptions("User is null Please provide a valid user");
        LibraryItem tempItem=null;
        for(int i=0;i<items.size();i++){
            if(items.get(i).equals(item)) tempItem = items.get(i);
        }
        if(tempItem==null) throw new Exceptions("Item is not registered");
        if(tempItem.getBorrowed()) throw new Exceptions("Item is already borrowed");
        User tempUser=null;
        for(int i=0;i<users.size();i++){
            if(users.get(i).equals(user)) tempUser = users.get(i);
        }
        if(tempUser==null) throw new Exceptions("User is not registered");
        if(!tempUser.canBorrow()) throw new Exceptions("User can not borrow more than 3 items");
        tempItem.setBorrowed(true);
        tempUser.addItem(new LibraryItem(tempItem));
    }
    public void returnItem(LibraryItem item, User user){
        if(user==null) throw new Exceptions("User is null Please provide a valid user");
        if(item==null) throw new Exceptions("Item is null Please provide a valid item");
        LibraryItem tempItem=null;
        User tempUser=null;
        for(int i=0;i<users.size();i++){
            if(users.get(i).equals(user)) tempUser = users.get(i);
        }
        if(tempUser==null) throw new Exceptions("User is not registered");
        for(int j=0;j<items.size();j++){}
    }



}
