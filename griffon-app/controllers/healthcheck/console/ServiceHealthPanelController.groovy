package healthcheck.console

class ServiceHealthPanelController {
    // these will be injected by Griffon
    def model
    def view
    def healthcheckDataService

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        model.mvcId = "${args.mvcId}_health_component"

        def health = healthcheckDataService.getHealth(model.uri)
        health.each { componentName, healthData ->
            createMVCGroup('componentHealth', "${model.mvcId}_$componentName",
                    [componentName: componentName,
                     mvcId: "${model.mvcId}_$componentName",
                     parent: view.componentHealthContainer])
        }
    }

    def refresh = { evt = null ->
        def health = healthcheckDataService.getHealth(model.uri)
        health.each { componentName, healthData ->
            app.controllers["${model.mvcId}_$componentName"].updateHealthData(healthData)
        }
        app.event 'HealthRefreshed'
    }

}
