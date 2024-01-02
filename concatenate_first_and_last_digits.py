n=int(input())
l=list(map(str,input().split()));
t=[];
for i in range(0,n-1):
    fi=l[i+1][0];
    l[i+1]=l[i+1][1:];
    la=l[i][len(l[i])-1];
    l[i]=l[i][:len(l[i])-1];
    s=la+fi;
    t.append(s);
r=0;j=1;
for i in t:
    l.insert(j,i);
    j+=2;
for i in range(len(l)-1):
    print(str(int(l[i]))+" +",end=" ");
print(str(int(l[len(l)-1]))+" =",end=" ")
for i in l:
    r=r+int(i);
print(r);
