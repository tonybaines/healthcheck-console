package healthcheck.console

/*
 * Each service instance has a tab
 */
actions {
    action(id: 'refreshAction',
            name: 'Refresh',
            closure: controller.refreshAll
    )
}

trimmedUri = model.uri.replace(/http:\/\//,'')[0..20]
tabTitle = "$tabName ($trimmedUri)"

tabbedPane(tabGroup) {
    scrollPane(title: tabTitle,
               id: tabName) {
        panel(id: 'instanceTabPanel') {
            migLayout(layoutConstraints: 'wrap 1')
            button refreshAction
        }
    }
}

