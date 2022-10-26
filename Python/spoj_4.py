for i in range(int(input())):
    result = 0
    for x in input().split():
        result = result + int(x[::-1])
    print(str(result)[::-1].strip("0"))