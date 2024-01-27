n=input().strip();
s=-1;
for i in range(len(n)-1,0,-1):
    if int(n[i])>int(n[i-1]):
        s=i-1;
        break;
if s==-1:
    print(s);
else:
    t=n[s:];
    q=[];
    for i in t:
        q.append(int(i));
    q=sorted(q);
    r=q[0];
    for i in q:
        if i>r:
            r=i;
            break;
    print(n[:s]+str(r),end="");
    q.remove(r);
    for i in range(len(q)):
        print(q[i],end="");
