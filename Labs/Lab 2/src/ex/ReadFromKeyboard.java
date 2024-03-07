package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFromKeyboard {

    static HashMap<String,POJO> hm = new HashMap<String,POJO>();
    public static String create(String username,int sold){

        POJO user = new POJO(username,sold);
        hm.put(username,user);

        return "Command received: create";
    }

    public static String update(String username,int sold){

        if(hm.containsKey(username))
        {
            POJO user = new POJO(username,sold);
            hm.put(username,user);
        }
        else
            System.out.println("User doesn't exist");

        return "Command received: update";
    }

    public static String delete(String username){

        if(hm.containsKey(username))
            hm.remove(username);
        else
            System.out.println("User doesn't exist");

        return "Command received: delete";
    }

    public static String help()
    {
        System.out.println(
                "\t\thelp: Instructions on how to use the application\n" +
                "\t\tupdate: Update data. Can receive two parameters: username and sold.\n" +
                "\t\tdelete: Delete the user's data.  Receive the username.\n" +
                "\t\tquit: Close the application.");

        return "Command received: help";
    }

    public static String quit(){
        return "Command received: quit";
    }


    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.printf("Enter command >>> ");
            String command = scanner.nextLine();
            switch (command)
            {
                case "help":
                {
                    System.out.println(help());
                    break;
                }

                case "quit":
                {
                    System.out.println(quit());
                    running = false;
                    break;
                }

                case "create":
                {
                    System.out.printf("UserName: ");
                    String usr = scanner.nextLine();
                    System.out.printf("Sold: ");
                    int sld = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(create(usr,sld));
                    break;
                }

                case "update":
                {
                    System.out.printf("UserName: ");
                    String usr = scanner.nextLine();
                    System.out.printf("Sold: ");
                    int sld = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(update(usr,sld));
                    break;
                }

                case "delete":
                {
                    System.out.printf("UserName: ");
                    String usr = scanner.nextLine();

                    System.out.println(delete(usr));
                    break;
                }
            }
        }
    }
}
