package hw5;

import java.util.ArrayList;
import java.util.List;

class DataService {
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public void createUser(User user) {
        if (user instanceof Student) {
            int maxId = 0;
            for (User u : users) {
                if (u instanceof Student && u.getId() > maxId) {
                    maxId = u.getId();
                }
            }
            user.setId(maxId + 1);
        } else if (user instanceof Teacher) {
            int maxId = 0;
            for (User u : users) {
                if (u instanceof Teacher && u.getId() > maxId) {
                    maxId = u.getId();
                }
            }
            user.setId(maxId + 1);
        }
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
