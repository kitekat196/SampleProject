package Lesson8.Application;
import java.util.Scanner;
//
public class UserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        while(true){
            System.out.println("login");
            String log = sc.next();
            System.out.println("password");
            String pass = sc.next();
            if(userService.auth(log, pass)){
                System.out.println("access is allowed\n");
            } else {
                System.out.println("incorrect login or password\ntry again\n\n");
            }
            int command;
            while (userService.auth(log, pass)) {
                userService.SaveData();
                System.out.println("1. GetByLogin\n2. AddUser\n3. DeleteByLogin\n4. getAllUser\n5. editUser\n0. Exit");
                command = sc.nextInt();
                switch (command) {
                    case 1: {
                        String login = sc.next();
                        userService.getByLogin(login);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter login or Email");
                        String login = sc.next();
                        System.out.println("Enter password");
                        String password = sc.next();
                        System.out.println("Enter your first name");
                        String name = sc.next();
                        User user = new User(login,password,name);
                        if(userService.addUser(login, user)){
                            System.out.println("A member of the Union successfully registered\n");
                        } else{
                            System.out.println("Oops, an error occurred\nTry again\n");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Enter login\n");
                        String login = sc.next();
                        if(userService.deleteByLogin(login)) {
                            System.out.println("A member of the Union was expelled");
                        }
                        else {
                            System.out.println("Error");
                        }
                        break;
                    }
                    case 4: {
                        userService.getAllUser();
                        break;
                    }
                    case 5: {
                        String login = sc.next();
                        if(userService.searchUser(login)) {
                            if (login.equals("admin")) {
                                System.out.println("You wanted to expel the head of the Union. Is this an attempt at revolution?\n");
                                break;
                            } else {
                                System.out.println("Enter new password");
                                String password = sc.next();
                                System.out.println("Enter new first name");
                                String name = sc.next();
                                User user = new User(login, password, name);
                                userService.editUser(user);
                            }
                        }
                        break;
                    }
                    case 0:{
                        System.exit(0);
                    }
                }
            }
        }
    }
}