int a = 0, b = 1, i = 1;

while (i <= 10) {
    System.out.print(a + " ");
    int c = a + b;
    a = b;
    b = c;
    i++;
}
