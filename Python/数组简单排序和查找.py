import random

def getArr(arrNum):
    # 生成随机数组
    arr = []
    for i in range(arrNum):
        randomNum = random.randint(0, 99)
        arr.append(randomNum)
    return arr

def searchNum(arr, num):
    # 二分查找
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == num:
            return True
        elif arr[mid] < num:
            left = mid + 1
        else:
            right = mid - 1
    return False

if __name__ == '__main__':
    arr = getArr(10)
    print(arr)
    print(sorted(arr))
    num = int(input("要查找的数字是：\n"))
    # 查找数字
    if searchNum(sorted(arr), num):
        print("找到了")
    else:
        print("没找到")