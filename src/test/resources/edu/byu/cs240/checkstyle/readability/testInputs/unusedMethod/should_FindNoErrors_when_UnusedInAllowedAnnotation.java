class should_FindNoErrors_when_UnusedInAllowedAnnotation {
    @FooBar("hello")
    public void hi() {
        hello();
    }
    @FooBar(value = "hi")
    public void hello() {
        System.out.println("hello");
    }
}