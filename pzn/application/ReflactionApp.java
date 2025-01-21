package pzn.application;

import pzn.data.CreateUserRequest;
import pzn.util.ValidationUtil;

public class ReflactionApp {
    public static void main(String[] Args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("eko");
        request.setPassword("eko");
        request.setName("eko");

        ValidationUtil.validationReflection(request);
    }
}
