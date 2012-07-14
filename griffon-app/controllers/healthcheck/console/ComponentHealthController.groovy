package healthcheck.console

class ComponentHealthController {
    // these will be injected by Griffon
    def model
    def view

    def mvcId

    void mvcGroupInit(Map args) {
        mvcId = args.mvcId
    }

    def updateHealthData = { componentData ->
        model.status = componentData.status
        model.message = componentData.message

        // Notify anything interested in health-status updates
        app.event("HealthUpdate", [this.mvcId, model.status])
    }
}
