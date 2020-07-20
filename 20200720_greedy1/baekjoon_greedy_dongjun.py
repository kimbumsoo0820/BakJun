a,b = map(int,input().split())
arr = [int(input()) for _ in range(a)]

count=0

for i in range(a):
    count+=b//arr[-1-i]
    b=b%arr[-1-i]

print(count)