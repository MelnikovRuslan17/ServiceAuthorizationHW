package ru.netology.serviceauthorizationhw.repository;

import org.springframework.stereotype.Repository;
import ru.netology.serviceauthorizationhw.authorities.Authorities;
import ru.netology.serviceauthorizationhw.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class UserRepository {
    private Map<String, User> users = new HashMap<>();
    {
        users.put("Ruslan", new User("Ruslan", "1233456"));
        users.put("Ekaterina", new User("Ekaterina", "Ekaterina777"));
        users.put("Anna", new User("Anna", "1337"));
    }
    public List<Authorities> getUserAuthorities(User user){
        User userFromRepository = users.get(user.getUser());
        if(user.equals(userFromRepository)){
            return List.of(Authorities.values());
        }else {
            return new ArrayList<>();
        }

    }
}
