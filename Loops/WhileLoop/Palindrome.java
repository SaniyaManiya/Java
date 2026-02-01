int n = 121;
int temp = n, rev = 0;

while (n != 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n = n / 10;
}

if (temp == rev)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
