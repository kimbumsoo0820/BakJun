A = int(input())
arr=[500,100,50,10,5,1]
count=0
change=1000-A
count2=0
for i in range(len(arr)):
    if(arr[i]<=change):
        count+=change//arr[i]
        count2=change//arr[i]
        change=change-arr[i]*count2
print(count)