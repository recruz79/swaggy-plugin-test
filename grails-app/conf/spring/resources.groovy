import hiding.swagger.WPSwaggyDataService

beans = {
    /**
     * We want APIController to inject our extended SwaggyDataService, WPSwaggyDataService
     * So we overwrite the swaggyDataService bean with our own implementation
     */
    swaggyDataService(WPSwaggyDataService){
        pluginSwaggyDataService = ref('pluginSwaggyDataService')
        grailsApplication = grails.util.Holders.getGrailsApplication()
    }

}
