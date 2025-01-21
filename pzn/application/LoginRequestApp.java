package pzn.application;

import pzn.data.LoginRequest;

public class LoginRequestApp {
    public static void main(String[] Args) {
        LoginRequest loginRequest = new LoginRequest("iksan", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("eko"));
        System.out.println(new LoginRequest("eko", "rahasia"));
    }
}
