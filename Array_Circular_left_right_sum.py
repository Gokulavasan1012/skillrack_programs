n=int(input());
l=list(map(int,input().split()));
for i in range(n):
    first=int(str(l[i])[0])
    last=l[i]%10;
    s=0;
    r=i-1;
    while first>0:
        if r<0:
            r=n-1;
        s=s+l[r];
        r-=1;
        first-=1;
    r=i+1;
    while last>0:
        if r>n-1:
            r=0;
        s=s+l[r];
        r+=1;
        last-=1;
    print(s,end=" ");


    
