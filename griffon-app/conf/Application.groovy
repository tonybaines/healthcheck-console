application {
    title = 'HealthcheckConsole'
    startupGroups = ['healthcheckConsole']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "componentHealth"
    'componentHealth' {
        model      = 'healthcheck.console.ComponentHealthModel'
        view       = 'healthcheck.console.ComponentHealthView'
        controller = 'healthcheck.console.ComponentHealthController'
    }

    // MVC Group for "serviceHealthTab"
    'serviceHealthPanel' {
        model      = 'healthcheck.console.ServiceHealthPanelModel'
        view       = 'healthcheck.console.ServiceHealthPanelView'
        controller = 'healthcheck.console.ServiceHealthPanelController'
    }

    // MVC Group for "serviceInstanceTab"
    'serviceInstanceTab' {
        model      = 'healthcheck.console.ServiceInstanceTabModel'
        view       = 'healthcheck.console.ServiceInstanceTabView'
        controller = 'healthcheck.console.ServiceInstanceTabController'
    }

    // MVC Group for "healthcheck-console"
    'healthcheckConsole' {
        model      = 'healthcheck.console.HealthcheckConsoleModel'
        view       = 'healthcheck.console.HealthcheckConsoleView'
        controller = 'healthcheck.console.HealthcheckConsoleController'
    }

}
