import numpy as np
import random

class Sorting:


    #Constructor
    def __init__(self):
        pass

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
    sorted = Sorting_instance.selectionSort(unsorted)
    #Print the sorted list
    print("\nSorted: ")
    Sorting_instance.printer(sorted)

if __name__ == "__main__":
    main()





