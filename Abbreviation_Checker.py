n=int(input());
l=[];
for i in range(n):
    l.append(input().strip());
t=input().strip();
for i in range(len(l)):
    string=l[i].split();
    q=0;
    if len(string)==len(t):
      for j in range(len(string)):
          if string[i][0]==t[i].upper() or string[i][0]==t[i].lower():
              continue;
          else:
              q=1;
      if q==0:
          print(l[i]);
          exit(0);
        
