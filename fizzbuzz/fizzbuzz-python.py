def fizz_buzz(max, dict: dict):
    for i in range(max):
        i += 1
        out = ""
        for factor in dict:
            if (i % factor == 0):
                string = dict[factor]
                out += string
        print(out if out else i)

fizz_buzz(100, {
    3: "Fizz",
    5: "Buzz"
})
