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
            model.health = health.QuoteEngineApplication.status
        }
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
       
    def action = { evt = null ->
    }
    */
}
