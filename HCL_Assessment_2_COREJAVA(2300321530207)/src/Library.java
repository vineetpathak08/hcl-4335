import exception.Exceptions;
import model.LibraryItem;
import model.User;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private final List<LibraryItem> items = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final 
    public void addItem(LibraryItem item){
        if(item==null) return;
        items.add(item);
    }
    public void addUser(User user){
        if(user==null) return;
        users.add(user);
    }
    public List<LibraryItem> getItems(){
        return new  ArrayList<>(items);
    }
    public List<User> getUsers(){
        return new  ArrayList<>(users);
    }

    public void callBorrowItem(String id , String name){
        LibraryItem tempIt=null;
        User tempUs=null;
        for(LibraryItem item : items){
            if(item.getName().equals(name)) tempIt = item;
        }
        if(tempIt==null) throw new Exceptions("item not found");
        for(User user : users){
            if(user.getId().equals(id)) tempUs = user;
        }
        if(tempUs==null) throw new Exceptions("user not found");
        borrowItem(tempIt, tempUs);
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
        ArrayList<LibraryItem> userBorrowed = tempUser.getItemList();
        int idx=-1;
        for(int i=0;i<userBorrowed.size();i++){
            if(userBorrowed.get(i).equals(item)){
                tempItem = userBorrowed.get(i);
                idx=i;
            }
        }
        if(tempItem==null) throw new Exceptions("Item is not borrowed by this User");
        tempItem.setBorrowed(false);
        userBorrowed.remove(idx);
        tempUser.setItemList(userBorrowed);
    }




}
