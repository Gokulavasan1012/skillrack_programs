rooms=input().strip();
s=input().strip();
t=0;
start=0;
for i in s:
    t=t+abs((rooms.index(i))-start);
    start=rooms.index(i);
print(t);



