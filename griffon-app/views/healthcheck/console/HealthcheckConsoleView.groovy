package healthcheck.console
/*
 * The top level view, handles menus and owns the tab pane
 */

import java.awt.Color
import org.jdesktop.swingx.painter.GlossPainter

gloss = glossPainter(paint: new Color(1f, 1f, 1f, 0.2f), position: GlossPainter.GlossPosition.TOP)
stripes = pinstripePainter(paint: new Color(1f, 1f, 1f, 0.17f), spacing: 5.0)
matte = mattePainter(fillPaint: new Color(51, 51, 51))
compound = compoundPainter(painters: [matte, stripes, gloss])

application(title: 'healthcheck-console',
        preferredSize: [1024, 700],
        pack: true,
        //location: [50,50],
        locationByPlatform: true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                imageIcon('/griffon-icon-32x32.png').image,
                imageIcon('/griffon-icon-16x16.png').image]) {
    actions {
        action(
                id: 'quitAction',
                name: 'Quit',
                mnemonic: 'Q',
                accellerator: shortcut('Q'),
                closure: controller.quit
        )
        action(id: 'refreshAllAction',
                name: 'Refresh All',
                mnemonic: 'R',
                accellerator: shortcut('R'),
                closure: controller.refreshAll
        )
    }

    menuBar {
        menu(text: 'File', mnemonic: 'F') {
            menuItem refreshAllAction
            menuItem quitAction
        }
    }

    borderLayout()
    jxheader(constraints: NORTH, title: "Healthcheck Console",
            titleForeground: Color.WHITE,
            descriptionForeground: Color.WHITE,
            icon: imageIcon("/griffon-icon-16x16.png"),
            preferredSize: [480,40],
            backgroundPainter: compound
    )
    tabbedPane id: 'tabGroup', tabPlacement: JTabbedPane.TOP, constraints: context.CENTER

}
