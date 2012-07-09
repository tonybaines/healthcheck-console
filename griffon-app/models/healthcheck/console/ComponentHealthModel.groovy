package healthcheck.console

import groovy.beans.Bindable
import java.awt.Color

class ComponentHealthModel {
    @Bindable String componentName
    @Bindable String status
    @Bindable String message
}