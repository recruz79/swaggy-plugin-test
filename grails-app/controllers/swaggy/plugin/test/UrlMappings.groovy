package swaggy.plugin.test

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/rest/authors" (resources:'author', excludes:['create', 'edit', 'patch']) { format = 'json' }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
