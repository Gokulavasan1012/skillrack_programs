n=int(input());
l=list(map(int,input().split()));
b=[];
for i in l:
    b.append(bin(i)[2:]);
bl=[];
for i in b:
    bl.append(i.count('0'));
t=list(zip(l,bl));
t=sorted(t,key=lambda a:a[1]);
s=[y for y,x in t];
print(*s);
