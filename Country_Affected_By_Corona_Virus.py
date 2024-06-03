n=int(input());
d={};
for i in range(n):
    a=input().strip();
    t=a[::-1];
    s=t.index(' ');
    b=a[len(a)-s:];
    if b not in d:
        d[b]=1;
    else:
        d[b]+=1;
l=list(d.items());
for i in range(len(l)):
    l[i]=list(l[i]);
l=sorted(l,key=lambda a:a[1],reverse=True);
for i in range(len(l)):
    print(l[i][0],l[i][1]);

