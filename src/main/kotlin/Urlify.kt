fun count( charArray: CharArray, trueLength: Int): Int {
    var count = 0
    for( i in 0 until trueLength){
        if( charArray[i] == ' '){
            count += 1
        }
    }
    return count
}
fun URLify( charArray: CharArray, trueLength: Int): CharArray{

    var newIndex = trueLength - 1 + count(charArray, trueLength) * 2

    for (i in trueLength - 1 downTo 0) {
        if (charArray[i] == ' ') {
            // Replace space with "%20"
            charArray[newIndex] = '0'
            charArray[newIndex - 1] = '2'
            charArray[newIndex - 2] = '%'
            newIndex -= 3
        } else {
            // Move characters
            charArray[newIndex] = charArray[i]
            newIndex--
        }
    }
    return charArray
}


