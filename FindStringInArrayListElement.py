def Solution(A,B,P):
    result = []
    for i,b in enumerate(B):
      if P in b :
        result.append(A[i])

    returnData = sorted(result)
    if not returnData:
        return 'NO CONTACT'
    return returnData[0]

A = ['adam' , 'eva' , 'leo']
B = ['121212121' , '111111111' , '444555666']
P = '112'
print(Solution(A,B,P))
