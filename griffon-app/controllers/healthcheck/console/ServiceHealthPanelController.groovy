package healthcheck.console

class ServiceHealthPanelController {
    // these will be injected by Griffon
    def model
    def view
    def healthcheckDataService

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        model.mvcId = "${args.mvcId}_health_component"
        execOutsideUI {
            def health = healthcheckDataService.getHealth(model.uri)

            health.each { componentName, healthData ->
                createMVCGroup('componentHealth', "${model.mvcId}_$componentName",
                        [componentName: componentName,
                         componentData: health[componentName],
                         parent: view.componentHealthContainer])
            }
        }
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

}
