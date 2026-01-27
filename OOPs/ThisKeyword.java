class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p = new Person("Amit");
        p.show();
    }
}
