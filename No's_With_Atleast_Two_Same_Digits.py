a,b=map(int,input().split());
flag=0;
while a<=b:
    s=str(a);
    t=0;
    r=[];
    for i in s:
        r.append(i);
    r=list(set(r));
    for i in range(len(r)):
        if s.count(r[i])>=2:
            t+=2;
    if t>=4:
       print(a,end=" ");
       flag=1;
    a+=1;
if flag==0:
    print(-1);
    
    
