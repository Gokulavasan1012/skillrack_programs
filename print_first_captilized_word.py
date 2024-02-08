n=input().strip();
l=[];
s=0;
for i in range(len(n)-1):
    if n[i+1].isupper():
        l.append(n[s:i+1]);
        s=i+1;
l.append(n[s:]);
l=sorted(l,key=lambda i: len(i));
t=0;
for i in l:
    if len(i)==n and len(i)>=2 and l[i][0].isupper():
        print(i);
        t=1;
        break;
if t==0:
    print(-1);

