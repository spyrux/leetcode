class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        strings = []
        combs = {
            "2" : ['a','b','c'],
            "3" : ['d','e','f'],
            "4" : ['g','h','i'],
            "5" : ['j','k','l'],
            "6" : ['m','n','o'],
            "7" : ['p','q','r','s'],
            "8" : ['t','u','v'],
            "9" : ['w','x','y','z']
        }

        def backtrack(self, digits, string):
            if len(digits) <= 0:
                print(string)
                strings.append(string)
            else: 
                for character in combs[digits[0]]:
                    copy = string + character
                    backtrack(self, digits[1:], copy)

        if digits == "":
            return []
        backtrack(self, digits, "")
        
        return strings