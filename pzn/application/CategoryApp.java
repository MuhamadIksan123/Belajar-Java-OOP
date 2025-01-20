package pzn.application;

import pzn.data.Category;

public class CategoryApp {
    public static void main(String[] Args) {
        Category category = new Category();
        System.out.println(category.getId());
        category.setId("ID");
        System.out.println(category.getId());
        category.setId(null);
        System.out.println(category.getId());
    }
}
