package healthcheck.console

class HealthcheckConsoleController {
    def serviceInstances = [
            'stub1':'http://localhost:5000/healthcheck-console/healthcheckStub/',
            'stub2':'http://localhost:5000/healthcheck-console/healthcheckStub/',
//            'stub3':'http://localhost:5000/healthcheck-console/healthcheckStub/',
//            'stub4':'http://localhost:5000/healthcheck-console/healthcheckStub/',
    ]

    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        execOutsideUI {
            serviceInstances.each { name, uri ->
                createMVCGroup('serviceInstanceTab', name,
                        [uri: uri, tabGroup: view.tabGroup, tabName: name, mvcId: name])
            }
        }
    }

    def quit = {
        app.shutdown()
    }

    def refreshAll = {
        serviceInstances.each { name, uri ->
            app.controllers[name].refreshAll()
        }
    }
}
