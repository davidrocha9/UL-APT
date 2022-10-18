def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

test_cases = int(input())
factorials = []
for i in range(test_cases):
    factorials.append(factorial(int(input())))

for i in factorials:
    print(i)