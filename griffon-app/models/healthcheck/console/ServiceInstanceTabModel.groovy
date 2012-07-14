package healthcheck.console

import groovy.beans.Bindable

class ServiceInstanceTabModel {
    String uri
    String mvcId
    @Bindable String healthStatus = 'UNKNOWN'
}