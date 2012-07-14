package healthcheck.console

// the 'parent' property is injected as part of the arguments map when this
// instance of the componentHealth MVC group was created
panel(parent) {
//    designGridLayout {
//        row().grid(label(bind(source: model, 'componentName')))
//                .add(textField(editable: false, text: bind(source: model, 'status')))
//                .add(textField(editable: false, text: bind(source: model, 'message')))
//    }

    jxtitledPanel(title: bind(source: model, 'componentName')) {
        vbox {
            textField(editable: false,
                      text: bind(source: model, 'message'),
                      background: bind { model.status == "GREEN" ? java.awt.Color.GREEN : java.awt.Color.RED }
            )
        }
    }
}
