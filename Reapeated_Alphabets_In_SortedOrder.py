n=input().strip();
s=[];
for i in n:
    if n.count(i)>1:
        s.append(i);
s=sorted(s);j=0;
for i in range(len(n)):
    if n[i] in s:
        print(s[j],end="");
        j+=1;
    else:
        print(n[i],end="");


