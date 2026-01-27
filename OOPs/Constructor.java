class Employee {
    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void show() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Rahul");
        e.show();
    }
}
