class Parent {
    Parent(int x) {
        System.out.println("Parent value: " + x);
    }
}

class SuperE extends Parent {
    SuperE() {
        super(10);   // calls parent constructor
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new SuperE();
    }
}
