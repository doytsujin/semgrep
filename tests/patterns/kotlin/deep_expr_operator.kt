fun foo(): Int {
    //ERROR:
    foo(bar(1 + 42))

    foo(1)
}
