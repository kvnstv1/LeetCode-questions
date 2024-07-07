
#  LeetCode commentary 

### Question 118: Pascal's Triangle 1 (Easy)

Pascal's Triangle forced me to look at the solution. Mainly this is because I thought there was a recursive solution and 
I tried to wrap my head around that. 

But the solution found [here](https://hwennnn.github.io/leetcode-solutions/0118/) achieves it with a nested loop and no recursion! They had a very clever use of indices to prevent going out of bounds. They likely noticed a property of Pascal's Triangle from a mathematician's POV. 

Basically, after making a result arrayList of Integer Lists and an Arraylist called prev initialized to null:
<ol>
<li>iterate from i=1 to i=numRows. </li>
<li>Make a new ArrayList called save that gets remade each i</li>
<li> Iterate through j=1 to j=i</li>
<li> if j=1 or j=i, add 1 to save </li>
<li> Else, add (prev-1)+(prev-2) to save </li>
<li> Close the bracket, then assign save to prev and add save to result </li>
<li>  return result </li>
</ol>

Like magic. More practice needed in this kind of challenging array questions. 

--- 

### Question 29: Divide Two Integers (Medium)

The solution involves bitwise operations? Who knew? Check [this](https://leetcode.com/problems/divide-two-integers/solutions/1516367/complete-thinking-process-intuitive-explanation-all-rules-followed-c-code). 


---

### Question 136: Single Number (Easy)

The solutoon involves using bitwise XOR. WE know that a^b=0 iff a=b. so in the case where an array contians duplicates, all the duplicates cancel out, leaving only the original number.

---

### Question 504 : Base 7 (Easy)

Rebasing a number is pretty interesting. The algorithm goes thus:

1. Repeatedly divide by the new base until the quotient is less than the new base.
2. Reverse the collected remainders and append to the last quotient

Otherwise pretty straightforward. Just watch out for negative numbers.

---

### Question 263: Ugly Number (Easy)

I made this question a LOT harder than it had to be, mainly because I did not recognize that if a number is not repeatedly divisible by 2,3 and 5, it would be ugly. Any number that cannot be divided by this would necessarily have a prime factor that is not 2,2 or 5. The other numbers can definitely be factorized down further. We basically just need to check if n==1 at the end of this repeated division phase.

---

### Question 202: Happy Number (Easy)

So I guesstimated it. I saw that for $2^{31}$ we would still break down the sum of squares of digits into 3 digits within just 3 or 4 iterations. So I just took a worst case scenario of 100 and ran it through with the exit condition that if sum is equal to 1, 10, 100 or 1000 then return true, else false. Apparently this is faster than 67% of submissions.

But another way is to use Floyd's tortoise and hare algorithm. This has two variables, slow and fast, where fast iterates b 2 in sequence where slow iterates by 1. The exit condition is fast=1, which returns true. If fast equals true, then they are stuck in an infinite loop. 

### Question 258: Add digits (Easy)

Getting to the answer is easy, but there is a VERY interesting insight into the digital roots of numbers. Read more [here](url=https://leetcode.com/problems/add-digits/solutions/4343655/java-c-python-efficient-digital-root-calculation-with-math-insights-explained). Basically, the digital root of any number ending in 0 is 0, and for any number ending in 9 is 9. FOr every toher number, the digital root is that number modulo 9. This means you can solve the issue in constant time without ANY loops. Very cool.

### Question 141: Detecting loops in Linked Lists (Easy)

This uses Floyd's tortoise and hare algorithm. Make a pointer that is fast and iterates by 2 and a pointer that is slow and iterates by 1. If there is a loop, they will inevitably meet. The exit condition is that fast.next or fast.next.next equals null. We need to look for other exit conditions like there being an empty set or just one or two elements in a set. This is because fast iterates by 2, so in a set with just 1 element, fast.next.next does not exist. It was good to test my understanding of the algorithm that was used in a question just yesterday. 

### Question 205: Isomorphic Strings (Easy)

This question can use HashMaps to resolve the characters being mapped to each other. The used functions are get(), put() and containsKey(). We need to check 3 things, if hashmap s2t contains a each character from the string s, then check inside if the hashmap s2t's mapped character for that string is equal to the equivalent character from string t. If both fail, check if hashmap t2s has the character in its list, and pass false if it does. If all three fail, it means the hashmap lacks the element at all and we have to put them in there. 

It's easier once you're more comfortable with hashmaps. 

### Question 88: Merge two sorted arrays

Simple enough. And yet, there is a simpler way that I didn't think of. Instead of iterating up, iterate from the back, and set the larger elements into the right position from m+n, while m and n decrment to 0. It's simpler and quicker. We still need to watch out for the early exit condition where m=0, and the boundary condition where n=0 which can generate arrayIndexOutOfBounds error. 

OTOH, this was my first program on my macbook!

### Question 28: First incidence of String

At first I solved this just using Java's provided indexOf() function. That seemed too naive. So I did it again using only charAt() and substring(). The edge condition here is that needle and haystack are equal, in which case you should just return 0. The exit conditon is that i<= i=needle.length(), since haystack cannot possibly contian the full string in that case. 

## Problem 415

I used stacks. It works. But the faster way would have been just to do the addition for each digit place and add it immediately to a result string. That way extra storage is not used either.

One cool thing is to subtract '' from the charAt() to get the integer value we are looking for. 
