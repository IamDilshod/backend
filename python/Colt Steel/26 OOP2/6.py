class Character:
    def __init__(self, name, hp, level):
        self.name = name
        self.hp=hp
        self.level=level
        
class NPC(Character):
   def __init__(self, name, hp, level):
       super().__init__(name, hp, level)