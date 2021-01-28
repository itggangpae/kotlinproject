fun main(args: Array<String>) {
    // 시드값 1을 시작으로 1씩 증가하는 시퀀스 정의
    var sequence: Sequence<Int> = generateSequence(1) { it + 1 }

    // take()를 사용해 원하는 요소 개수만큼 획득하고
    // toList()를 사용해 List 컬렉션으로 반환
    println(sequence.take(10).toList())

    sequence = generateSequence(10) { it + 10 }
    println(sequence.take(5).toList())

    //list를 이용해서 sequence 생성
    val list = listOf(11, 22, 33, 44, 55)
    print(list.asSequence().take(5).toList())
}