class Comments:
   def __init__(self, username, text, likes=0):
      self.username = username
      self.text = text
      self.likes = likes

comment = Comments('Alex', 'Hello Alex')
print(comment.likes)
print(comment.username)
print(comment.text)