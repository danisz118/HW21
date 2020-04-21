


public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.removeAll();
        User user1 = new User("Den", 26);
        User user2 = new User("Daria", 25);
        userDao.addUser(user1);
        userDao.addUser(user2);
        System.out.println(userDao.getAllUsers());
        userDao.close();
    }
}
