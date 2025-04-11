
#include <vector>
#include <iostream>
#include <random> // ���� C++11 �����

std::vector<int> getArr(int arrNum) {
    // �����������
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
    // ð������
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
    // ���ֲ���
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
    // ��ӡ����
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


    std::cout << "Ҫ���ҵ������ǣ�" << std::endl;
    int num;
    std::cin >> num;
    // ��������
    if (searchNum(arr1, num)) {
        std::cout << "�ҵ���" << std::endl;
    } else {
        std::cout << "û�ҵ�" << std::endl;
    }
    return 0;
}