import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head;

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Add a friend connection
    public void addFriend(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null && !user1.friends.contains(userId2)) {
            user1.friends.add(userId2);
            user2.friends.add(userId1);
        }
    }

    // Remove a friend connection
    public void removeFriend(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friends.remove((Integer) userId2);
            user2.friends.remove((Integer) userId1);
        }
    }

    // Find mutual friends
    public List<Integer> findMutualFriends(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 == null || user2 == null) return Collections.emptyList();
        List<Integer> mutualFriends = new ArrayList<>(user1.friends);
        mutualFriends.retainAll(user2.friends);
        return mutualFriends;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        User user = searchUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friends);
        }
    }

    // Search for a user by ID
    public User searchUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search for a user by Name
    public User searchUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Count friends of a user
    public int countFriends(int userId) {
        User user = searchUserById(userId);
        return (user != null) ? user.friends.size() : 0;
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 27);
        sm.addUser(3, "Charlie", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);

        System.out.println("Mutual Friends between Alice and Bob: " + sm.findMutualFriends(1, 2));
        System.out.println("Total Friends of Alice: " + sm.countFriends(1));
    }
}

