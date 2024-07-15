new_user = {}.fromkeys(['name', 'score', 'email', 'profile bio'], 'unknown')
print(new_user)

new_user['year'] = 1990

print(new_user.get('year'))
print(new_user)


print('---------------------------')


dic1 = {}.fromkeys('phone', 'Samsung')
print(dic1)