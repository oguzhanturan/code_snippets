def Solution(S):
    count = {}
    for s in S:
      if s in count:
        count[s] += 1
      else:
        count[s] = 1
    
    for key in count:
      if count[key] > 1:
        return key
        
print(Solution("zz"))
