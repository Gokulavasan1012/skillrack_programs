n=input().strip();
l=[];
for i in n:
    l.append(i);
l=sorted(l); 
s=[];
for i in range(len(l)-1):
    t=ord(l[i+1])-ord(l[i]);
    s.append(t);
for i in range(len(s)):
    if s.count(s[i])==1:
        if i==0:
            print(l[i]);
        else:
            print(l[i+1]);
        break;

