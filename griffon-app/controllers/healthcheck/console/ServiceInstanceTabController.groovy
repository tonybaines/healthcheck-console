package healthcheck.console

class ServiceInstanceTabController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        model.mvcId = "${args.mvcId}"

        createMVCGroup('serviceHealthPanel', "${model.mvcId}_health", [uri: model.uri, mvcId: model.mvcId, healthPanel: view.healthPanel])
    }

    def refreshAll = {
        app.controllers["${model.mvcId}_health"].refresh()
    }
}
