package Task_10;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer, String> country = new RedBlackTree<>();
        country.insert(8, "Європа");
        country.insert(43, "Африка");
        country.insert(6, "Австралія");
        country.insert(7, "Америка");
        country.insert(9, "Азія");
        country.insert(12, "Антарктида");

        country.deleteNode(6);
        country.deleteNode(9);

        country.prettyPrint();
    }
}
