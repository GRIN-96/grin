string = input()

answer = "z" * len(string)

def get_alphabetic_lower_string(one, the_other):
    for i in range(len(one)):
        if ord(one[i]) < ord(the_other[i]):
            return one
        elif ord(one[i]) > ord(the_other[i]):
            return the_other
    return one

for i in range(1, len(string) - 1):
    for j in range(i + 1, len(string)):
        s1 = ''.join(reversed(string[:i]))
        s2 = ''.join(reversed(string[i:j]))
        s3 = ''.join(reversed(string[j:]))
        new_string = s1 + s2 + s3
        answer = get_alphabetic_lower_string(answer, new_string)

print(answer)