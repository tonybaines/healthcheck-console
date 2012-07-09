package healthcheck.console

class ComponentHealthController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        model.status = args.componentData.status
        model.message = args.componentData.message
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
