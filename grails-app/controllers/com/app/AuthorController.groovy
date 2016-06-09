package com.app

import com.wordnik.swagger.annotations.Api
import hiding.swagger.CrudRestfulController

@Api("Author domain services")
class AuthorController extends CrudRestfulController {

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