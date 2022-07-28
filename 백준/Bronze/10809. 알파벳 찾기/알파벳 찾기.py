s = input()

al= [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1]
for i in range(len(s)):
    for j in s[i] :
        if j == 'a' :
            al[0] = s.index('a') 
        if j == 'b' :
            al[1] = s.index('b')
        if j == 'c' :
            al[2] = s.index('c') 
        if j == 'd' :
            al[3] = s.index('d')
        if j == 'e' :
            al[4] = s.index('e') 
        if j == 'f' :
            al[5] = s.index('f')
        if j == 'g' :
            al[6] = s.index('g') 
        if j == 'h' :
            al[7] = s.index('h')
        if j == 'i' :
            al[8] = s.index('i') 
        if j == 'j' :
            al[9] = s.index('j')
        if j == 'k' :
            al[10] = s.index('k') 
        if j == 'l' :
            al[11] = s.index('l')
        if j == 'm' :
            al[12] = s.index('m') 
        if j == 'n' :
            al[13] = s.index('n')
        if j == 'o' :
            al[14] = s.index('o') 
        if j == 'p' :
            al[15] = s.index('p')
        if j == 'q' :
            al[16] = s.index('q') 
        if j == 'r' :
            al[17] = s.index('r')
        if j == 's' :
            al[18] = s.index('s') 
        if j == 't' :
            al[19] = s.index('t')
        if j == 'u' :
            al[20] = s.index('u') 
        if j == 'v' :
            al[21] = s.index('v')
        if j == 'w' :
            al[22] = s.index('w') 
        if j == 'x' :
            al[23] = s.index('x')
        if j == 'y' :
            al[24] = s.index('y') 
        if j == 'z' :
            al[25] = s.index('z')
    

for i in al :
    print(i,end=' ')