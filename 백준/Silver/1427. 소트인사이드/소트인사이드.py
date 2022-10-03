n = str(input())

lists = [int(i) for i in n]
lists_str = [str(i) for i in sorted(lists, reverse=True)]

print(''.join(lists_str))