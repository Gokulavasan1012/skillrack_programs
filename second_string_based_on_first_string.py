s1=input().strip();
s2=input().strip();
l=[];
l1=[];
for i in s1:
    l.append(i.lower());
for i in s2:
    l1.append(i.lower());
l=sorted(l);
l1=sorted(l1);
a="";b="";
for i in l:
    a=a+i;
for i in l1:
    b=b+i;
if a==b:
    print('yes');
else:
    print('no');
