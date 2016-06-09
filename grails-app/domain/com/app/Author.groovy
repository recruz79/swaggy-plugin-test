package com.app

import hiding.swagger.annotations.HiddenApiRest

@HiddenApiRest(values = ["version", "address"])
class Author {

    String name
    String address
    String phone
    String email

    static constraints = {
        name nullable: false, blank : false
        email nullable: false, blank : false
        phone nullable: false
    }

    @Override
    String toString() {
        return "${name} ${email}"
    }

}
