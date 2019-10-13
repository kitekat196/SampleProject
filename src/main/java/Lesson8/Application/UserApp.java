package Lesson8.Application;
import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.println("login");
        String log = sc.next();
        System.out.println("password");
        String pass = sc.next();
        if(userService.auth(log, pass)) {
            int command;
            System.out.println("access is allowed");
            while (true) {
                System.out.println("1. GetByLogin\n2. AddUser\n3. DeleteByLogin\n4. getAllUser\n5. editUser\n6. Exit");
                command = sc.nextInt();
                switch (command) {
                    case 1: {
                        String login = sc.next();
                        userService.getByLogin(login);
                        break;
                    }
                    case 2: {
                        String login = sc.next();
                        String password = sc.next();
                        String name = sc.next();
                        User user = new User(login,password,name);
                        userService.addUser(login, user);
                        break;
                    }
                    case 3: {
                        String login = sc.next();
                        userService.deleteByLogin(login);
                        break;
                    }
                    case 4: {
                        userService.getAllUser();
                        break;
                    }
                    case 5: {
                        String login = sc.next();
                        String password = sc.next();
                        String name = sc.next();
                        User user = new User(login, password, name);
                        userService.editUser(user);
                        break;
                    }
                    case 6:{
                        System.exit(0);
                    }
                }
            }
        }
        else {
            System.out.println("Incorrect login or password");
        }
    }
}


//
//авторизация
//while
//считывание команд
//switch
//

