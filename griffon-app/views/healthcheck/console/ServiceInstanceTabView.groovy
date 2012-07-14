package healthcheck.console

tabbedPane(tabGroup, selectedIndex: tabGroup.tabCount) {
    scrollPane(title: "$tabName (${model.uri})", id: tabName) {
        panel(id: 'healthPanel') { }
    }
}

