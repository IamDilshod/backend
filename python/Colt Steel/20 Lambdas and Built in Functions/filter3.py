users = [
	{"username": "samuel", "tweets": ["I love cake", "I love pie", "hello world!"]},
	{"username": "katie", "tweets": ["I love my cat"]},
	{"username": "jeff", "tweets": []},
	{"username": "bob123", "tweets": []},
	{"username": "doggo_luvr", "tweets": ["dogs are the best", "I'm hungry"]},
	{"username": "guitar_gal", "tweets": []}
]

usernames = list(map(lambda user: user['username'].upper(), filter(lambda u: not u['tweets'], users)))
print(usernames)

inactive_user = [user for user in users if not user['tweets']]
print(inactive_user)

def remove_negatives(l):
    lsd = filter(lambda x: x >= 0, l)
    return list(lsd)

print(remove_negatives([2, 4, 5, -5, -2, 0, 1, 54, -2]))