a,b=map(int,input().split());
l=[];
for i in range(a):
    l.append(list(map(str,input().split())));
t=[];
for i in l:
    s="";
    for j in i:
        s=s+j;
    t.append(int(s,2));
t=sorted(t);
for i in t:
    s=bin(i)[2:];
    r=len(s);
    while r<b:
        print("0",end=" ");
        r+=1;
    q=[];
    for i in s:
        q.append(i);
    print(*q);
