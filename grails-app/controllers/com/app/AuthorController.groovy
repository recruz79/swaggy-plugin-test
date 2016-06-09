package com.app

import com.wordnik.swagger.annotations.Api
import grails.rest.RestfulController

@Api("Author domain services")
class AuthorController extends RestfulController {

    AuthorController() {
        super(Author)
    }

    def index(Integer max) {
        super.index(max)
    }

    def save() {
        super.save()
    }

}