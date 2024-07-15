def sum_all_values(*args):
   print('args => ', args)
   total = 0
   for num in args:
      total+=num
   return total

print(sum_all_values(1,2,3,4,5))

nums = [1,2,3,4,5]
# nums = (1,2,3,4,5)
print(sum_all_values(*nums)) # Bu qatordagi kod "tupple unpacking" deyiladi.
 # Maqsad funksiyaga List yoki Tupple berib chaqirganimizda, uni parchalab yuborishda
 # xatolik kelib chiqadi. Shuning uchun, e'tiborli bo'lishimiz kerak.
 # Shu Video darsda yaxshi tushuntirgan!!!