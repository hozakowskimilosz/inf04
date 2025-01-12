class Util:
    @staticmethod
    def countVowels(string):
        if string == "" or string == None:
            return 0

        vowels = "aąeęiouóyAĄEĘIOUÓY"
        counter = 0
        for char in string:
            if char in vowels:
                counter += 1

        return counter

    @staticmethod
    def removeDuplicates(string):
        if string == "" or string is None:
            return ""

        newString = ""
        for char in string:
            if char not in newString:
                newString += char

        return newString

name = "siiemaAAAA"
print(Util.countVowels(name))
print(Util.removeDuplicates(name))