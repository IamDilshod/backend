num1 = [1,2,3,4]
num2 = [3,4,5,6]
answer = [x for x in num1 if x in num2]
print(answer)

friends = ['Elie', 'Tim', 'Matt']
answer2 = [friend.lower()[::-1] for friend in friends]
print(answer2)

answer = [[x for x in range(0,10)] for y in range(0,10) ]
print(answer)