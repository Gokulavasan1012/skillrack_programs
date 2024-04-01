a,b=map(int,input().split());
s=0;t="";
s=str(s+a);
for i in range(b):
    
    r=0;
    #pattern printer
    for j in range(a):
        if r>=len(s):
            r=0;
        print(s[r],end="");
        t=t+s[r];
        r+=1;
    print();
    #pattern generator
    s=0;
    r=0;
    for j in range(a):
        if r>=len(t):
            r=0;
        s+=int(t[r]);
        r+=1;
    s=str(s);
    t="";

