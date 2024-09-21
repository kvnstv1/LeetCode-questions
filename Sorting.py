import numpy as np
import random

class Sorting:


    #Constructor
    def __init__(self):
        pass

    #Sorting covered:
    # 1. Selection sort
    # 2. Insertion sort
    # 3. Bubble sort
    # 4. Merge sort
    # 5. Quick sort


    #Selection sort
    def selectionSort(self, listNums):
        unsorted = np.array(listNums)
        for i in range(len(unsorted)):
            minIndex = i
            min = unsorted[i]
            for j in range(i, (len(unsorted)),1):
                if(unsorted[j]<min):
                    min = unsorted[j]
                    minIndex = j
            temp = unsorted[i]
            unsorted[i] = unsorted[minIndex]
            unsorted[minIndex] = temp
        return unsorted



    #Insertion sort
    def insertionSort(self, listNums):
        #print("")
        for i in range(1, len(listNums)-1):
            key = listNums[i]
            for j in range(i-1, -1, -1):
                if(listNums[j] > key):
                    listNums[j+1] = listNums[j]
                    listNums[j] = key
                    #self.printer(listNums)
                    #print("")
        return listNums;



    #Bubble sort
    def bubbleSort(self, listNums):
        while(True):
            swap = 0
            for i in range(0, len(listNums)-1):
                if(listNums[i]>listNums[i+1]):
                    listNums[i], listNums[i+1] = listNums[i+1], listNums[i]
                    swap += 1
            if(swap == 0):
                break
        return listNums



    # Merge sort
    def mergeSort(self, listNums):



        #Base case for recursion
        if(len(listNums)<=1):
            return listNums

        mid = len(listNums)//2
        left = listNums[:mid]
        right = listNums[mid:]
        left = self.mergeSort(left)
        right = self.mergeSort(right)

        return self.merge(left, right)

    # Inner function
    def merge(self, l, r):
        result = []
        i, j = 0,0
        while (i<len(l) and j < len(r)):
            if (l[i] <= r[j]):
                result.append(l[i])
                i += 1
            else:
                result.append(r[j])
                j+=1
        result.extend(l[i:])
        result.extend(r[j:])
        return result

    # Display method
    def printer(self, listNums):
        for i in range(len(listNums)):
            print(f"{listNums[i]}", end = " ")



def main():

    Sorting_instance = Sorting()
    length = int(input("Enter the length of the list: "))
    max = int(input("Enter the maximum number: "))
    unsorted = np.random.randint(0,max,length)
    #print the unsorted list
    print("\nUnsorted: ")
    Sorting_instance.printer(unsorted)
    sorted = Sorting_instance.mergeSort(unsorted)
    #Print the sorted list
    print("\nSorted: ")
    Sorting_instance.printer(sorted)

if __name__ == "__main__":
    main()





