n=int(input());
l=[];
for i in range(n):
    l.append(input().strip());
l_sorted=sorted(list(set(l)));
print(len(l_sorted))
for i in l_sorted:
    print(i,end=" ");
    for j in range(n):
        if l[j]==i:
            print(j+1,end=" ");
    print();
    
