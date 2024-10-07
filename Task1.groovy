def compress() {
    def example = "AAAAABBDCAAADDDDBC"
    def result = ""
    def count = 1
    for (i = 1; i < example.length(); i++) {
        if (example[i] == example[i-1]) { 
            count ++
        } else {
            result += example[i-1] + (count > 1 ? count.toString() : "")
            count = 1
        }
    }
    result += example[-1] + (count > 1 ? count.toString() : "")
    return result
}

println(compress())
