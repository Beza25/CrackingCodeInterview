fun stringCompression( input: String ) : String {
    if(input.isEmpty()) return input

    var result = StringBuilder()
    var count = 1

    for( i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1]).append(count)
            count = 1
        }

    }
    
    result.append(input.last()).append(count)

    return if (result.length > input.length) input else result.toString()

}