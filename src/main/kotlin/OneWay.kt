import java.lang.Math.abs

fun oneWay(first: String, second: String): Boolean  {
    val difference = first.length - second.length
    if( abs(difference) > 1  ) return false
    if (first.equals(second)) return true

    if( difference == 0) {
       return isReplaceEdit(first, second)
    }else if( first.length + 1 == second.length) {
        return oneEdit( second, first)
    }else {
        return oneEdit( first, second)
    }
}

fun oneEdit(str1:String, str2: String): Boolean {
    var i = 0
    for( j in str2.indices){
        if( str1[i] != str2[j]){
            if( str1[i+1] != str2[j]){
               return false
            }else{
                i++
            }
        }
        i++
    }
    return true
}


fun isReplaceEdit( str1 : String, str2 : String): Boolean {
    var replaced = false
    for( i in str1.indices ){
        if( str1[i] != str2[i] ){
            if(replaced){
                 return false
            }else {
                replaced = true
            }
        }
    }
    return true
}