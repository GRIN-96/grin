spell = input().upper()
spell_ = list(set(spell))

counts = []
for i in spell_ :
    x = spell.count(i)
    counts.append(x)
    
if counts.count(max(counts)) > 1 :
    print('?')
else :
    num_index = counts.index(max(counts))
    print(spell_[num_index])

