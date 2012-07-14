package healthcheck.console

import groovy.beans.Bindable
import java.awt.Color
import sun.awt.resources.awt

class ComponentHealthModel {
    @Bindable String componentName
    @Bindable String status = 'UNKNOWN'
    @Bindable String message = 'Waiting for data'
}