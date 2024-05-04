n=int(input());
t=int(input());
l=list(map(int,input().split()));
s=[];
for i in l:
    if len(s)<t and i not in s:
        s.append(i);
    elif i not in s:
        s=s[1:];
        s.append(i);
    elif i in s:
        s.remove(i)
        s.append(i);
print(*s);
