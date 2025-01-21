package pzn.application;

import pzn.annotation.Fancy;
import pzn.data.LoginRequest;
import pzn.error.ValidationException;
import pzn.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "AnimalApp", tags = {"application", "java"})
    public static void main(String[] Args) {
        LoginRequest loginRequest = new LoginRequest(null, "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Success");
    }
}
