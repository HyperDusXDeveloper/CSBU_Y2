#RECURSIVE FUNCTION

data = ["QWERTYUIOPASDFGHJKLZXCVBNM", #len0
"ASDFGHJKLZXCVBNMqWERTYUIOP", #len1
"ZXCVBNMASDFGHJKLZWERTYUIOP", #len2
"POIUYTREWQLKJHGFDSAmNBVCXZ", #len3
"MNBVCXZLKJHGFDSAPOIUYTREWQ", #len4
"LKJHGFDSaZXCVBNMqPOIUYTREW", #len5
"ASDFGHJKLZXCVBNMWERTYuIOP", #len6
"QWERTYUIOPASDFGHJKLZXCVBNM", #len7
"ZXCVBNMASDFGHJKLZWERTYUIOP", #len8
"POIUYTREWQLKJHGFDSAZXCVBNM", #len9
"MNBVCXZLKJhGFDSAPOIUYTREWQ", #len10
"QWERTYUIOPASDFGHJKLZXCVBNM"] #len11

row = 0
col = 0


def CountLowercase(data,row,col):
    if len(data) <= row:
        return 0
    
    if len(data[row]) <= col :
        return CountLowercase(data,row + 1,0)
    
    if data[row][col].islower():
        lower = 1
    else:
        lower = 0
    return lower + CountLowercase(data,row,col+1)


def FindLinesWithLowercase(data,row,col):
    if row >= len(data):
        return []

    if col >= len(data[row]):
        return FindLinesWithLowercase(data,row+1,0)

    if data[row][col].islower():
        return [row] + FindLinesWithLowercase(data,row+1,0)

    return FindLinesWithLowercase(data,row,col+1)


def CollectLowerCaseCharacters(data,row,col):
    if row >= len(data):
        return []

    if col >= len(data[row]):
        return CollectLowerCaseCharacters(data, row + 1, 0)

    if data[row][col].islower(): 
        return [data[row][col]] + CollectLowerCaseCharacters(data, row, col + 1)

    return CollectLowerCaseCharacters(data, row, col + 1)


def FindLowerCasePositions(data,row,col):
    if row >= len(data):
        return []

    if col >= len(data[row]):
        return FindLowerCasePositions(data,row+1,0)

    if data[row][col].islower():
        return [(row,col,data[row][col])] + FindLowerCasePositions(data,row,col+1)

    return FindLowerCasePositions(data,row,col+1)



print("Total number of lowercase characters: ", CountLowercase(data,row,col))
print("Lines containing lowercae characters: ", FindLinesWithLowercase(data,row,col))
print("Lowercase characters found: ", CollectLowerCaseCharacters(data,row,col))
print("Positions found: ", FindLowerCasePositions(data,row,col))