package healthcheck.console

panel(healthPanel) {
    panel(constraints: context.CENTER, id: 'componentHealthContainer',
            border: compoundBorder(outer: emptyBorder(5),
                    inner: titledBorder(title: 'Health'))) {
        boxLayout(axis: javax.swing.BoxLayout.PAGE_AXIS)
    }
}