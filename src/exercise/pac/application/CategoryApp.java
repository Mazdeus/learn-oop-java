package exercise.pac.application;

import exercise.pac.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
//        System.out.println(category.getId());
//        System.out.println(category.isExpensive());

        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
    }
}
