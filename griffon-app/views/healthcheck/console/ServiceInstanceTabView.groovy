package healthcheck.console

tabbedPane(tabGroup, selectedIndex: tabGroup.tabCount) {
    panel(title: "$tabName (${model.uri})", id: tabName) {
        panel id: 'healthPanel'
    }
}

