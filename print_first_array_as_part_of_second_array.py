a,b=map(int,input().split());
l=list(map(int,input().split()));
l1=list(map(int,input().split()))
t=[];s=[];
for i in l:
    if i not in l1:
        t.append(i);
for i in l1:
    if i in l:
        for j in range(l.count(i)):
            print(i,end=" ");
t=sorted(t,reverse=True);
print(*t,sep=" ",end=" ");

