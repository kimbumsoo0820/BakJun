a,b,c = map(int,input().split())
count=0
for i in range(c):
    if a>b*2:
        a-=1
    else:
        b-=1
while b>=1 and a>=2:
    b-=1
    a-=2
    count+=1
print(count)