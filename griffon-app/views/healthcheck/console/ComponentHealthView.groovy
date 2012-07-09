package healthcheck.console

// the 'parent' property is injected as part of the arguments map when this
// instance of the componentHealth MVC group was created
panel(parent) {
    jxtitledPanel(title: bind(source: model, 'componentName')) {
        vbox {
            textField(editable: false, text: bind(source: model, 'status'))
            textField(editable: false, text: bind(source: model, 'message'))
        }
    }
}
