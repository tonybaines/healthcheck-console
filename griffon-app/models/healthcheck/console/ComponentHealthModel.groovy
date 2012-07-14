package healthcheck.console

import groovy.beans.Bindable

class ComponentHealthModel {
    @Bindable String componentName
    @Bindable String status = 'UNKNOWN'
    @Bindable String message = 'Waiting for data'
}