package minimini.arr;

import java.util.Arrays;

public class Arr_10 {
    public static void main(String[] args) {
        class User implements Comparable<User> {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User user) {
                if (this.age < user.age) {
                    return -1;
                } else if (this.age == user.age) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
//        class User{
//            String name;
//            int age;
//
//            User(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }}
        User[] users = {
                new User("rits", 32),
                new User("kamin", 31),
                new User("erika", 33),
                new User("see", 50)
        };
        Arrays.sort(users);
        for (User u : users) { // 출력
            System.out.println(u.name + " " + u.age + "세");
        }

    }
}

