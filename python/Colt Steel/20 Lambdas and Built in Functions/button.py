import tkinter as tk

root = tk.Tk()
frame = tk.Frame(root)
frame.pack()

def say_hi():
   print('Hello World!')

button1  = tk.Button(frame, text="Click Me", fg='red', command=lambda: print('Hello!'))
button2  = tk.Button(frame, text="Click Me", fg='red', command=lambda: say_hi)

button1.pack(side=tk.LEFT)
button2.pack(side=tk.LEFT)
root.mainloop()
