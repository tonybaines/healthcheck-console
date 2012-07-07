package healthcheck.console

import groovy.beans.Bindable

class ServiceHealthPanelModel {
    String uri
    @Bindable String health = "Waiting for refresh"
}