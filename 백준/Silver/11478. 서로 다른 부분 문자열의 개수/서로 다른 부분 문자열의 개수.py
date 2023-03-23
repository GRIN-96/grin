import sys

s = list(map(str, sys.stdin.readline().rstrip("\n")))

temp = set()

for i in range(len(s)):
    for j in range(len(s) + 1):
        if s[i:j]:
            temp.add("".join(s[i:j]))

print(len(temp))