package Laba_1.Task6;

import Laba_1.Task6.User.User;

public class Task6 {
    public static void main(final String[] args) {
        final User user = new User ();
        final User user1 =  new User ();
        System.out.println("Чи вони однакові:");
        System.out.println(user.equals(user1));
        System.out.println("hashCode user:");
        System.out.println(user.hashCode());
    }
}
