package edu.itstep.hw20220914.comparable.name_surName;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //testAddress();
        System.out.println("----------------------------------------------------");
        testUser();
    }

    public static void testUser() {
        User user1 = new User(
                "Petro",
                "Petrenko",
                "Kyiv",
                "Shevchenka pr., 1., kv.77",
                010001,
                "044 123-1234", "044 123-4321"
        );
        //System.out.println(user1);
        User user2 = new User(
                "Semen",
                "Antonenko",
                "Harkiv",
                "Lisenka st., 7., kv.11",
                070007,
                "097 987-6543", "098 333-2222", "050 987-1122"
        );
        User user3 = new User(
                "Andrij",
                "Ivanenko",
                "Zhytomyr",
                "Peremogy sq., 2., kv.123",
                100002
        );
        User user4 = new User(
                "Philip",
                "Minajlo",
                "Zhytomyr",
                "Liatoshinskogo st., 11., kv.2",
                100012,
                "041 233-5757"
        );

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        showUsers(users);
        System.out.println();
        System.out.println("Сортування по полях firstName + lastName");
        Collections.sort(users);
        showUsers(users);
    }

    public static void showUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("------------------------------------------------");
    }

    public static void testAddress() {
        Address address1 = new Address("City", "Московское ш., 101, кв.101", 101101);
        System.out.println(address1);
    }
}
