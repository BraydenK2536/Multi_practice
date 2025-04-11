
#include <vector>
#include <iostream>
#include <random> // 引入 C++11 随机库

std::vector<int> getArr(int arrNum) {
    // 生成随机数组
    std::vector<int> arr;
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<> dis(0, 99);

    for (int i = 0; i < arrNum; ++i) {
        int randomNum = dis(gen);
        arr.push_back(randomNum);
    }
    return arr;
}

std::vector<int> sortArr(std::vector<int> arr) {
    // 冒泡排序
    for (int i = 0; i < arr.size(); ++i) {
        for (int j = 0; j < arr.size() - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

bool searchNum(std::vector<int> arr, int num) {
    // 二分查找
    int left = 0;
    int right = arr.size() - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == num) {
            return true;
        } else if (arr[mid] < num) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return false;
}

void printArr(std::vector<int> arr) {
    // 打印数组
    for (int i = 0; i < arr.size(); ++i) {
        std::cout << arr[i] << " ";
        if (i == arr.size() - 1) {
            std::cout << std::endl;
        }
    }
}

int main() {
    const std::vector<int> arr = getArr(10);
    printArr(arr);
    const std::vector<int> arr1 = sortArr(arr);
    printArr(arr1);


    std::cout << "要查找的数字是：" << std::endl;
    int num;
    std::cin >> num;
    // 查找数字
    if (searchNum(arr1, num)) {
        std::cout << "找到了" << std::endl;
    } else {
        std::cout << "没找到" << std::endl;
    }
    return 0;
}