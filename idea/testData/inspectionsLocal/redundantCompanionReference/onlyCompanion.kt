// PROBLEM: none
class C {
    companion object {
        fun create() = C()
    }
}

fun test() {
    C.<caret>Companion
}