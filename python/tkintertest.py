import tkinter as tk
from math import *

def evaluate(event):
    res.configure(text="Result: " + str(eval(entry.get())))
    x=0
    while (bool(1)):
        print(x)
        x=x+1

w = tk.Tk()
w.geometry("500x200")
w.title("crash!!! cal")
tk.Label(w, text="Your Expression:").pack()
entry = tk.Entry(w)
entry.bind("<Return>",evaluate)
entry.pack()
res = tk.Label(w)
res.pack()
w.mainloop()