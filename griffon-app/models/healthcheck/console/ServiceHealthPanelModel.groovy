package healthcheck.console

import groovy.beans.Bindable

class ServiceHealthPanelModel {
    String uri
    String mvcId
    @Bindable String health = "Waiting for refresh"
}