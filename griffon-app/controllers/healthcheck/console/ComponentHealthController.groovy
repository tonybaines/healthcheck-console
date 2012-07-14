package healthcheck.console

import griffon.transform.Threading

class ComponentHealthController {
    // these will be injected by Griffon
    def model
    def view

    def updateHealthData = { componentData ->
        model.status = componentData.status
        model.message = componentData.message
    }
}
