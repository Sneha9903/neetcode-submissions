class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        n1=len(s)
        n2=len(t)
        if n1!=n2:
            return False


        s1 = {}
        s2 = {}
        for i in range(n1):
            s1[s[i]] = s1.get(s[i], 0) + 1
            s2[t[i]] = s2.get(t[i], 0) + 1
        
        for i in s1:
            if s1[i] != s2.get(i, 0):
                return False
        return True

        