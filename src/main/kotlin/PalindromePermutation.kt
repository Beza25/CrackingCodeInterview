fun isPalindromePermutation( str: String ): Boolean {

    val cleanedInput = str.replace(" ", "").lowercase()
    val setChar = mutableSetOf<Char>()

    cleanedInput.forEach{ char ->
        if( setChar.contains(char)){
            setChar.remove(char)
        }else{
            setChar.add(char)
        }
    }
    return setChar.size <= 1
}

