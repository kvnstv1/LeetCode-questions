
#  LeetCode commentary 

### Question 118: Pascal's Triangle 1 (Easy)

Pascal's Triangle forced me to look at the solution. Mainly this is because I thought there was a recursive solution and 
I tried to wrap my head around that. 

But the solution found [here](https://hwennnn.github.io/leetcode-solutions/0118/) achieves it with a nested loop and no recursion! THey ahd a very clever use of indices to prevent going out of bounds. They likely noticed a property of Pascal's Triangle from a mathematician's POV. 

Basically, after making a result arrayList of Integer Lists and an Arraylist called prev initialized to null:
<ol>
<li>iterate from i=1 to i=numRows. </li>
<li>Make a new ArrayList called save that gets remade each i</li>
<li> Iterate through j=1 to j=i</li>
<li> if j=1 or j=i, add 1 to save </li>
<li> Else, add (prev-1)+(prev-2) to save </li>
<li> CLose the bracket, then assign save to prev and add save to result </li>
<li>  return result </li>
</ol>

Like magic. More practice needed in this kind of challenging array questions. 

--- 

