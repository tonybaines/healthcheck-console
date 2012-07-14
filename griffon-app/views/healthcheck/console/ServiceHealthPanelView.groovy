package healthcheck.console

actions {
    action(id: 'refreshAction',
           name: 'Refresh',
           closure: controller.refresh
    )
}
panel(healthPanel) {
//    boxLayout(axis: javax.swing.BoxLayout.PAGE_AXIS)
    migLayout()
    button refreshAction
    panel(constraints: context.CENTER, id: 'componentHealthContainer',
            border: compoundBorder(outer: emptyBorder(5),
                    inner: titledBorder(title: 'Health'))) {
        migLayout(layoutConstraints: 'wrap 2')
    }
}