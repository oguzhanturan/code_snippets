def solution(S):
    sd = sum(map(int,S))      
    result = int(sd%3==0)    
    for d in map(int,S):      
        for cd in range(10):  
            if d!=cd and (sd-d+cd)%3==0: 
                result += 1
    return result
    
print(solution("23"))
