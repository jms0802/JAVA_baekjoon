N = int(input())
n_li = []

for i in range(N):
  li = list(input())
  s = 0
  n = 1
  for j in range(0,len(li)):
    if li[j-1] == 'O' and li[j] == 'O':
      s += n
      n += 1
    elif li[j] == 'X':
      n = 1
    else:
      s += n
      n += 1
  n_li.append(s)

for i in range(N):
  print(n_li[i])
