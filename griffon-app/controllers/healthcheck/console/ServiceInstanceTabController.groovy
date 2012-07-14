package healthcheck.console

class ServiceInstanceTabController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        model.mvcId = "${args.mvcId}"

        createMVCGroup('serviceHealthPanel', "${model.mvcId}_health", [uri: model.uri, mvcId: model.mvcId, parent: view.instanceTabPanel])
        createMVCGroup('serviceInfoPanel', "${model.mvcId}_info", [uri: model.uri, mvcId: model.mvcId, parent: view.instanceTabPanel])
    }

    def refreshAll = {
        app.controllers["${model.mvcId}_health"].refresh()
        app.controllers["${model.mvcId}_info"].refresh()
    }

    // Receive 'HealthRefreshed' application events
    def onHealthRefreshed = {
        def overallStatus = 'UNKNOWN'
        // Examine all models
        app.models.each { name, instance ->
            if(name.startsWith(model.mvcId) && instance.hasProperty('status')) {
                if (overallStatus != 'RED') {
                    overallStatus = instance.status
                }
            }
        }
        log.info("Set the overall status of ${model.mvcId} to $overallStatus")
        model.healthStatus = overallStatus
    }
}
