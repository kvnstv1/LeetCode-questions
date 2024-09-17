class Solution:

    def __init__(self):
        pass

    def reverseVowels(self, st: str) -> str:
        left = 0
        right = len(st) - 1
        s=list(st)
        while (left < right):


            while (left <right and not self.vowel( s[left])):
                left += 1
            while (left <right and not self.vowel(s[right])):
                right -= 1


            s[left],s[right] = s[right],s[left]
            left += 1
            right -= 1

        return "".join(s)


    def vowel(self, char: str) -> bool:
        l = char
        if (
                l == 'a' or l == 'e' or l == 'i' or l == 'o' or l == 'u' or l == 'A' or l == 'E' or l == 'I' or l == 'O' or l == 'U'):
            return True
        return False

    def main(self):
        word = input("Enter the test case ")
        rev = self.reverseVowels(word)
        print(rev)

if __name__ == '__main__':
    sol = Solution()
    sol.main()

