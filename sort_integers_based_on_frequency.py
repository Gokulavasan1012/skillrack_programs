n=int(input());
l=list(map(int,input().split()));
l=sorted(l);
d={};
for i in l:
    if i not in list(d.keys()):
        d[i]=1;
    else:
        d[i]+=1;
a=dict(sorted(d.items(),key=lambda x:x[1]));
for i in a.keys():
    for j in range(a[i]):
        print(i,end=" ");
        
