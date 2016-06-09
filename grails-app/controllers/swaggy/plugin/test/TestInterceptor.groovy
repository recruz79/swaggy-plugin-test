package swaggy.plugin.test


class TestInterceptor {
    int order = Interceptor.HIGHEST_PRECEDENCE + 9900

    boolean before() {
        println('before')
        true
    }

    boolean after() {
        println('after')
        true
    }

    void afterView() {
        println('afterView')
    }
}
