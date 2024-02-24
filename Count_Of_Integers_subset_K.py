x,y,k=map(int,input().split());
t=0;
k=str(k);
while x<=y:
    if k in str(x):
        t+=1;
    x+=1;
print(t);

