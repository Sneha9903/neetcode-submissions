class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s = {}
        for i in strs:
            j = tuple(sorted(i))
            if j in s:
                s[j].append(i)
            else:
                s[j]=[i]
        return list(s.values())