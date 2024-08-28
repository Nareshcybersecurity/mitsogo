def augstic_values(S):
    n = len(S)
    total_sum = 0
    for i in range (1 << (n-1)):
        expression = S[0]
        for j in range (n - 1):
            if i & (1 << j):
                expression += '+'
            expression += S[j + 1]
        total_sum += sum(map(int, expression.split('+')))
    return str(total_sum)
  S = input();
print (augstic_values(S))
