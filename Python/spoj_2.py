n = input()
s = input().split()
m = input()
q = input().split()

for i in s:
    if i not in q:
        print(i, end=' ')