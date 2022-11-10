package Task_9;

public class BinaryTree {

    // Клас для представлення вузла
    public static class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        Node(int key, String name) {
            this.key = key;
            this.value = name;
        }

        @Override
        public String toString() {
            return "Key: " + key + " Value:" + value;
        }
    }

    private Node root;

    public void addNode(int key, String value) {
        // Створюємо новий вузол:
        Node newNode = new Node(key, value);
        if (root == null) { // перший доданий вузол
            root = newNode;
        } else {
            // Починаємо обхід:
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                // Перевіряємо ключі:
                if (key < currentNode.key) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        // Розміщуємо вузол в потрібному місці:
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        // Розміщуємо вузол в потрібному місці:
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Обхід вузлів в порядку зростання ключів
    public void traverseTree(Node currentNode) {
        if (currentNode != null) {
            traverseTree(currentNode.leftChild);
            System.out.println(currentNode);
            traverseTree(currentNode.rightChild);
        }
    }

    public void traverseTree() {
        traverseTree(root);
    }

    // Пошук вузла за ключем
    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            // Не знайшли:
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public Node deleteNode(Node root, int key) {
        if (root == null) return root;
        if (key > root.key) { //move rightChild
            root.rightChild = deleteNode(root.rightChild, key);
        } else if (key < root.key) { //move leftChild
            root.leftChild = deleteNode(root.leftChild, key);
        } else { //Found the target
            if (root.leftChild == null && root.rightChild == null) { //hmm, its a leaf node; easy peasy
                root = null;
            } else if (root.rightChild != null) {
                root.key = successor(root);
                root.rightChild = deleteNode(root.rightChild, root.key);
            } else {
                root.key = predecessor(root);
                root.leftChild = deleteNode(root.leftChild, root.key);
            }
        }
        return root;
    }

    private int successor(Node root) {
        root = root.rightChild;
        while (root.leftChild != null) {
            root = root.leftChild;
        }
        return root.key;
    }

    private int predecessor(Node root) {
        root = root.leftChild;
        while (root.rightChild != null) {
            root = root.rightChild;
        }
        return root.key;
    }

    // Тест:
    public static void main(String[] args) {
        BinaryTree continents = new BinaryTree();
        continents.addNode(1, "Європа");
        continents.addNode(3, "Африка");
        continents.addNode(5, "Австралія");
        continents.addNode(4, "Америка");
        continents.addNode(2, "Азія");
        continents.addNode(6, "Антарктида");
        continents.traverseTree();
        System.out.println("\nКонтинент з ключем 4:");
        System.out.println(continents.findNode(4));

        System.out.println("--------------------------------");
        continents.deleteNode(continents.root, 1);
        continents.deleteNode(continents.root, 3);
        continents.traverseTree();
    }
}