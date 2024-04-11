import math
def isprime(a):
    for i in range(2,int(math.sqrt(a))+1):
        if a%i==0:
            return False;
    return True;
n=input().strip();
for i in range(len(n)):
    n=n[1:]+n[0];
    if not isprime(int(n)):
        print("NO");
        exit(0);
print("YES")





