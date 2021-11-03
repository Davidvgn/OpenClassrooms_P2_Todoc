package com.openclassrooms.magicgithub.repository;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;
import java.util.Random;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        return apiService.getUsers();

    }

    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
//        apiService.getUsers().add(FAKE_USERS_RANDOM.get(new Random().nextInt(FAKE_USERS_RANDOM.size())));

    }

    public void deleteUser(User user) {
//        // TODO: A modifier
//        apiService.getUsers().remove(user);
        apiService.deleteUser(user);
    }
}

