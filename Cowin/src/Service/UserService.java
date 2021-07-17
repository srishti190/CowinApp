package Service;

import Models.User;
import Models.VaccineType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    public static List<User> userList=new ArrayList<>();
    public static Map<String,User> registeredUser=new HashMap<>();

    public void register_user(String name,String username,String gender, VaccineType preferredVaccine){
        if(registeredUser.containsKey(username)){
            System.out.println("User already registered!");
        }
        else {
            User user = new User(name, username, gender, preferredVaccine);
            registeredUser.put(username, user);
            userList.add(user);
            System.out.println("User Successfully registered!");
        }
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static Map<String, User> getRegisteredUser() {
        return registeredUser;
    }
}
