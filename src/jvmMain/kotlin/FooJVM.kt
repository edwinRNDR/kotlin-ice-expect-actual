actual interface Foo {
    fun jvmOnly()
    fun jvmOnly2()

    actual fun put(a: Int, f: Int.() -> Int)
    actual val bar: Int
    actual val bar2: Int
    actual fun start()
    actual fun end()
}