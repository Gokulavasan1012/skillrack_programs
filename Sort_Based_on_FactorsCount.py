n=int(input());
l=list(map(int,input().split()));
l1=[];
for i in range(n):
    t=0;
    for j in range(1,l[i]+1):
        if l[i]%j==0:
            t+=1;
    s=[];
    s.append(l[i]);
    s.append(t);
    l1.append(s);
l1=list(sorted(l1,key=lambda i:i[1],reverse=True));
ans=[l1[i][0] for i in range(len(l1))];
print(*ans);












