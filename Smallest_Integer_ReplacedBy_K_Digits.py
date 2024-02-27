n,a=map(str,input().split());
l=[i for i in n];
a=int(a);
for i in range(len(l)):
    if a==0:
        break;
    if l[i]!='0':
        l[i]='0';
        a-=1;
s="";
for i in l:
    s=s+i;
print(int(s));




