for i in range(int(input())):
    number = int(input())
    trailing_zeros = 0
    while (number > 0):
        trailing_zeros = trailing_zeros + (number // 5)
        number = number // 5
    print(trailing_zeros)