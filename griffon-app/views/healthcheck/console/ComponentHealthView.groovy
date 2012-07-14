package healthcheck.console

// the 'parent' property is injected as part of the arguments map when this
// instance of the MVC group was created
panel(parent) {
    label(text: bind {
                /* Using the closure form allows transformation of bound model values */
                model.componentName.replace(/Application/, '')
          },
          constraints: 'left')
    textField(editable: false,
            text: bind(source: model, 'message'),
            background: bind {
                switch (model.status) {
                    case "GREEN": Color.GREEN; break
                    case "RED": Color.RED; break
                    default: Color.LIGHT_GRAY
                }
            },
            constraints: 'left, grow'
    )
}
