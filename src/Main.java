import com.company.controller.AuthorizationController;
import com.company.model.Role;
import com.company.model.Store;
import com.company.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            AuthorizationController authorizationController = new AuthorizationController();
            Store store = generateStore();
            authorizationController.execute(store);
        }

    }

    private static Store generateStore() {
        User user1 = new User("LoRaWAN", "Qwerty123", "Serhii");
        user1.setRole(Role.CLIENT);
        User user2 = new User("ADMIN", "ADMIN", "Max");
        user2.setRole(Role.ADMINISTRATOR);
        User user3 = new User("BaBy", "QAZwsxedc321", "Tetiana");
        user3.setRole(Role.MANAGER);
        User user4 = new User("Boy", "Password88", "Artem");
        user4.setRole(Role.CLIENT);
        User user5 = new User("Zelensky", "PutinHu*lo", "Volodimir");
        user5.setRole(Role.DIRECTOR);


        User[] users = new User[]{user1, user2, user3, user4, user5};
        Store store = new Store("Rozetka", "www.rozetka.ua", users);
        return store;
    }
}