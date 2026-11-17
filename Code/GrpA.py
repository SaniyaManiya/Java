n = int(input("Enter number of terms: "))

a = 0
b = 1
count = 0

print("Fibonacci Series:")

for i in range(n):
    print(a, end=" ")

    c = a + b
    a = b
    b = c

    count = count + 1

print("\nStep Count:", count)
