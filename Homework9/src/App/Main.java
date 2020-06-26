package App;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    static Scanner scanner = new Scanner(System.in);
//    static ArrayList<User> users = new ArrayList<>();
//    static User loggedInUser = null;
//    static User administrator = new User("admin", "Admin");
//
//    public static void goStartPage() {
//        while (true) {
//            System.out.println("1. Login");
//            System.out.println("2. Register");
//            int i = scanner.nextInt();
//            if (i == 1) {
//                goLoginScreen();
//                break;
//            } else if (i == 2) {
//                goRegistrationScreen();
//                break;
//            } else {
//                System.out.println("Wrong input");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        users.add(administrator);
//        goStartPage();
//    }
//
//    public static void goLoginScreen() {
//        System.out.println("Input username");
//        String username = scanner.next();
//        System.out.println("Input password");
//        String password = scanner.next();
//        boolean foundUser = false;
//        for (User user : users) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                foundUser = true;
//                System.out.println("Login successful");
//                loggedInUser = user;
//                goUserHomePage();
//                break;
//            }
//        }
//        if (!foundUser) {
//            System.out.println("Wrong username password");
//            goLoginScreen();
//        }
//    }
//
//    public static void goUserHomePage() {
//        while (true) {
//            if (!loggedInUser.getUsername().equals(administrator.getUsername())) {
//                System.out.println("Announcements:  [1]");
//                System.out.println("Messages: [3]");
//                System.out.println("Log Out:  [2]");
//            }
//
//            if (loggedInUser.getUsername().equals(administrator.getUsername())) {
//                System.out.println("Announcements:  [1]");
//                System.out.println("Edit announcements:  [4]");
//                System.out.println("Log Out:  [2]");
//
//            } else if (!loggedInUser.announcementSeen && administrator.getAnnouncements().size() != 0) {
//                System.out.println("You have new announcement");
//                for (Announcement announcement : administrator.getAnnouncements()) {
//                    if (!loggedInUser.getAnnouncementsSeen().contains(announcement)) {
//                        System.out.println((administrator.getAnnouncements().indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
//                        loggedInUser.getAnnouncementsSeen().add(announcement);
//                        loggedInUser.announcementSeen = true;
//                    }
//                }
//            } else if (loggedInUser.announcementSeen || administrator.getAnnouncements().size() == 0) {
//                System.out.println("No new announcement");
//            }
//            int i = scanner.nextInt();
//            if (i == 3) {
//                goMessagesScreen();
//                break;
//            } else if (i == 2) {
//                System.out.println("Logged out");
//                loggedInUser = null;
//                goStartPage();
//            } else if (i == 4) {
//                goAnnouncementsEditingScreen();
//                break;
//            } else if (i == 1) {
//                goAnnouncementsShowingScreen();
//            } else {
//                System.out.println("Wrong input");
//            }
//        }
//    }
//
//    public static void goAnnouncementsEditingScreen() {
//        while (true) {
//            System.out.println("Crate announcement: [1]");
//            System.out.println("Delete announcement: [2]");
//            System.out.println("Back:  [3]");
//            int i = scanner.nextInt();
//            if (i == 1) {
//                System.out.println("Write announcement");
//                String announcement = scanner.next();
//                Announcement announcement1 = new Announcement(announcement);
//                for (User user : users) {
//                    user.announcementSeen = false;
//                }
//                administrator.getAnnouncements().add(announcement1);
//                System.out.println("Announcement published");
//            } else if (i == 2) {
//                System.out.println("Input announcement's number which you want to delete");
//                int announcementNumber = scanner.nextInt();
//                if (administrator.getAnnouncements().size() < announcementNumber) {
//                    System.out.println("Wrong number");
//                    break;
//                } else {
//                    administrator.announcements.remove((announcementNumber - 1));
//                    System.out.println("Announcement is deleted");
//                }
//            } else if (i == 3) {
//                goUserHomePage();
//            } else {
//                System.out.println("Wrong input");
//            }
//        }
//    }
//
//    public static void goAnnouncementsShowingScreen() {
//        if (administrator.getAnnouncements().size() == 0) {
//            System.out.println("No any announcement");
//        } else {
//            System.out.println("All announcements:");
//            for (Announcement announcement : administrator.getAnnouncements()) {
//                System.out.println((administrator.getAnnouncements().indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
//            }
//        }
//        System.out.println("Back:  [1]");
//        System.out.println("Log out: [2]");
//        int i = scanner.nextInt();
//        if (i == 1) {
//            goUserHomePage();
//        } else if (i == 2) {
//            goStartPage();
//        } else {
//            System.out.println("Wrong input");
//        }
//    }
//
//    public static void goMessagesScreen() {
//        while (true) {
//            System.out.println("Back:  [1]");
//            System.out.println("Wright message: [2] ");
//            System.out.println("All users");
//
//            for (User user : users) {
//                if (!loggedInUser.getUsername().equals(user.getUsername()) && !user.getUsername().equals(administrator.getUsername())) {
//                    System.out.println(user.getUsername());
//                }
//            }
//            int i = scanner.nextInt();
//            if (i == 1) {
//                goUserHomePage();
//            } else if (i == 2) {
//                System.out.println("Input some user's username");
//                String someUsername = scanner.next();
//                User target = null;
//                for (User user : users) {
//                    if (user.getUsername().equals(someUsername)) {
//                        target = user;
//                        break;
//                    }
//                }
//                if (target != null && !(target.getUsername().equals(loggedInUser.getUsername())) && !(target.getUsername().equals(administrator.getUsername()))) {
//                    goPM(target);
//                } else {
//                    System.out.println("No user with this username");
//                    goMessagesScreen();
//                }
//            } else {
//                System.out.println("Wrong input");
//            }
//        }
//    }
//    public static void goPM(User target) {
//        System.out.println("Your messages from " + target.getUsername());
//        for (Message message : loggedInUser.getMessages()) {
//            if (message.getFrom().getUsername().equals(target.getUsername())) {
//                System.out.println(message.getMessage());
//            }
//        }
//        System.out.println("Write message");
//        String message = scanner.next();
//        Message message1 = new Message(message, loggedInUser, target);
//        target.getMessages().add(message1);
//        System.out.println("Message sent");
//        goUserHomePage();
//
//    }
//
//    public static void goRegistrationScreen() {
//        System.out.println("Input username");
//        String username = scanner.next();
//        boolean foundUser = false;
//        for (User user : users) {
//            if (user.getUsername().equals(username)) {
//                System.out.println("Username already exists. Try again");
//                foundUser = true;
//                break;
//            }
//        }
//
//        if (foundUser) {
//            goRegistrationScreen();
//        } else {
//            System.out.println("Input password");
//            String password = scanner.next();
//            User user = new User(username, password);
//            users.add(user);
//            System.out.println("Successfully created new user with username " + username);
//            goStartPage();
//        }
//    }
//}
