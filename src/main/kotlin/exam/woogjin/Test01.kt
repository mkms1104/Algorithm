package exam.woogjin


fun main() {
    println(solution("abbbcbbb", "bbb")) // 4
    println(solution("abcabcabc", "abc")) // 4
    println(solution("abacaba", "acb")) // 0
}

fun solution(line1: String, line2: String): Int {
    var answer = 0
    for(blank in 0..< line2.length + 1) {
        loop@for(i in 0..line1.length) {
            var isMatch = true
            for (j in line2.indices) {
                val lastIndex = (line2.length - 1) * (blank + 1) + i
                if(lastIndex >= line1.length) break@loop // lastIndex check

                val index = j * (blank + 1) + i
                if(line1[index] != line2[j]) {
                    isMatch = false
                    break
                }
            }
            if(isMatch) answer++
        }
    }
    return answer
}