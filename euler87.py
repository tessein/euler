li = {0:[],1:[],2:[],3:[],6:[],7:[],8:[],9:[]}
for t in open("keylog.txt", 'r').read().split():
         li[int(t[1])].append(int(t[0]))
         li[int(t[2])].append(int(t[0]))
         li[int(t[2])].append(int(t[1]))
print [v for k,v in sorted([(len(set(v)),k)for k,v in li.items()])]
