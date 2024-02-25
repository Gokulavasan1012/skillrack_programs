s1=input().strip();
s2=input().strip();
a=s1+s2;
alp="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
for i in alp:
    if i not in a:
        print("no");
        exit(0);
for i in alp:
    if a.count(i)>1:
        print("no");
        exit(0);
print("yes");
