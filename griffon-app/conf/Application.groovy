application {
    title = 'HealthcheckConsole'
    startupGroups = ['healthcheckConsole']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "healthcheck-console"
    'healthcheckConsole' {
        model      = 'healthcheck.console.HealthcheckConsoleModel'
        view       = 'healthcheck.console.HealthcheckConsoleView'
        controller = 'healthcheck.console.HealthcheckConsoleController'
    }

}
