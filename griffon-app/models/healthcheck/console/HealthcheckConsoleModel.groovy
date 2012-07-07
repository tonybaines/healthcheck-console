package healthcheck.console

import groovy.beans.Bindable

class HealthcheckConsoleModel {
   @Bindable String instanceName = "Please refresh"
   @Bindable String health = "Waiting for refresh"
}