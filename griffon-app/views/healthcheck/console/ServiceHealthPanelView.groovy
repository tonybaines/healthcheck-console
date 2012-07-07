package healthcheck.console

panel(healthPanel) {
    textField(editable: false, text: bind(source: model, 'health'))
}