class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        rev = 0
        num = x
        while num:
            rev = (rev * 10) + (num % 10)
            num //= 10
        return rev == x