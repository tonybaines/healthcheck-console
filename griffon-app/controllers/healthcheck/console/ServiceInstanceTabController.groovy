package healthcheck.console

class ServiceInstanceTabController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        model.uri = args.uri
        model.mvcId = "${args.mvcId}_health"

        createMVCGroup('serviceHealthPanel', "${model.mvcId}", [uri: model.uri, mvcId: model.mvcId, healthPanel: view.healthPanel])
    }
}
