#Attempts to recursively work out the total number of ways one can make total from a certain start coin
#increased everything by 100 to lose decimals.
def twopounds(total,nextcoin):
    count = 0
    coins = [ 1, 2, 5, 10, 20, 50, 100, 200 ]
    if total-nextcoin == 0:
        return 1
    elif total-nextcoin < 0:
        return 0
    else:
        num = max([i for i,k in enumerate(coins) if k <= nextcoin])
        for i in coins[:int(num+1)]:
            count += twopounds(total-nextcoin,i)
        return count
    return total
total = 0
#Work out the total number of ways for each starting denomination. Add them together. Should be our total.
total +=twopounds(200,200)
total +=twopounds(200,100)
total +=twopounds(200,50)
total +=twopounds(200,20)
total +=twopounds(200,10)
total +=twopounds(200,5)
total +=twopounds(200,2)
total +=twopounds(200,1)
print(total)
