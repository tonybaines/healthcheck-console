package healthcheck.console

class ServiceHealthPanelController {
    // these will be injected by Griffon
    def model
    def view
    def healthcheckDataService

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        execOutsideUI {
            def health = healthcheckDataService.getHealth(model.uri)

            health.each { componentName, healthData ->
                createMVCGroup('componentHealth', "${componentName}_health_component",
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
