package kingkinfajarr.application;

import kingkinfajarr.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("Halo");
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
