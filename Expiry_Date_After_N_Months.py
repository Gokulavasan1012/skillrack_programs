mon,y=map(int,input().split('-'));
m=int(input());
year=m//12;
month=m-year*12;
if (mon+month)>12:
    year=year+(mon+month)//12;
    mon=(mon+month)%12;
else:
    mon=mon+month;
y=y+year;
if mon<10:
    print(f"0{mon}-{y}");
else:
    print(f"0{mon}-{y}");
    
