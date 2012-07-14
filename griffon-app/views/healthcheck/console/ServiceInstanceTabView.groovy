package healthcheck.console

trimmedUri = model.uri.replace(/http:\/\//,'')[0..20]
tabTitle = "$tabName ($trimmedUri)"

tabbedPane(tabGroup, selectedIndex: tabGroup.tabCount) {
    scrollPane(title: tabTitle, id: tabName) {
        panel(id: 'healthPanel') { }
    }
}

