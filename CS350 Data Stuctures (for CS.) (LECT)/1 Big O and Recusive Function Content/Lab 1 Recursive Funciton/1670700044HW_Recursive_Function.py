data = ["QWERTYUIOPASDFGHJKLZXCVBNM",
        "ASDFGHJKLZXCVBNMqWERTYUIOP",
        "ZXCVBNMASDFGHJKLZWERTYUIOP",
        "POIUYTREWQLKJHGFDSAmNBVCXZ",
        "MNBVCXZLKJHGFDSAPOIUYTREWQ",
        "LKJHGFDSAZXCVBNMqPOIUYTREW",
        "ASDFGHJKLZXCVBNMWERTYuIOP",
        "QWERTYUIOPASDFGHJKLZXCVBNM",
        "ZXCVBNMASDFGHJKLZWERTYUIOP",
        "POIUYTREWQLKJHGFDSAZXCVBNM",
        "MNBVCXZLKJhGFDSAPOIUYTREWQ",
        "QWERTYUIOPASDFGHJKLZXCVBNM"]

# CountLowercase
def count_lowercase_in_string(smalltext):
    if not smalltext:
        return 0
    count = 1 if smalltext[0].islower() else 0
    return count + count_lowercase_in_string(smalltext[1:])

def count_lowercase(data):
    if not data:
        return 0
    return count_lowercase_in_string(data[0]) + count_lowercase(data[1:])


# FindLinesWithLowercase
def lowercase(smalltext):
    return count_lowercase_in_string(smalltext) > 0

def find_lines_with_lowercase(data, current_row=0):
    if not data:
        return []
    lines = [current_row] if lowercase(data[0]) else []
    return lines + find_lines_with_lowercase(data[1:], current_row + 1)


# CollectLowerCaseCharacters
def collect_lowercase_in_string(smalltext):
    if not smalltext:
        return []
    chars = [smalltext[0]] if smalltext[0].islower() else []
    return chars + collect_lowercase_in_string(smalltext[1:])

def collect_lowercase_characters(data):
    if not data:
        return []
    return collect_lowercase_in_string(data[0]) + collect_lowercase_characters(data[1:])


# FindLowerCasePositions
def find_positions_in_string(smalltext, row, column=0):
    if not smalltext:
        return []
    positions = [(row, column, smalltext[0])] if smalltext[0].islower() else []
    return positions + find_positions_in_string(smalltext[1:], row, column + 1)

def find_lowercase_positions(data, row=0):
    if not data:
        return []
    return find_positions_in_string(data[0], row) + find_lowercase_positions(data[1:], row + 1)


print("Total Number of Lowercase Characters :", count_lowercase(data))
print("Lines Containing Lowercase Characters :", find_lines_with_lowercase(data))
print("Lowercase Characters Found :", collect_lowercase_characters(data))
print("Positions Found :", find_lowercase_positions(data))
