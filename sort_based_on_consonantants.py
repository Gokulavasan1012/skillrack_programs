n=int(input());
l=list(map(str,input().split()));
v="aeuioAEUIO";
cc=[];
for i in range(n):
    t=0;
    for j in l[i]:
        if j not in v:
            t+=1;   
    cc.append(t);
x=[x for y,x in sorted(zip(cc,l),key=lambda a:a[0])];
print(*x);

