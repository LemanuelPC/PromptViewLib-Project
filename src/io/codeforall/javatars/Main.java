package io.codeforall.javatars;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static HashMap<String, String> clientLoginData = new HashMap<>();

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        clientLoginData.put("Luis", "12345");

        String[] options = {"Create new account", "Login with existing account"};
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("Welcome to Goliath National Bank, the world leader in credit and banking!");
        int menuOption = prompt.getUserInput(menuInputScanner);

        if (menuOption == 2) {

            System.out.println("Insert your login credentials below:");

            StringSetInputScanner stringInputScanner = new StringSetInputScanner(clientLoginData.keySet());
            stringInputScanner.setMessage("Username: ");
            String username = prompt.getUserInput(stringInputScanner);
            stringInputScanner.setMessage("Username isn't correct or it doesn't exist.");

            PasswordInputScanner passwordInputScanner = new PasswordInputScanner();
            passwordInputScanner.setMessage("Password: ");
            String password = prompt.getUserInput(passwordInputScanner);

            System.out.println(clientLoginData.get(username).equals(password) ? "Login Successful!" : "Password incorrect. Try again.");



        }




    }
}
