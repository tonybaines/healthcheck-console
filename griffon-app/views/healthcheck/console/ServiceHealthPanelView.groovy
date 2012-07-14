package healthcheck.console

/*
 * Container for the per-component views
 */

// the 'parent' property is injected as part of the arguments map when this
// instance of the MVC group was created
panel(parent) { // referring to an existing panel instance lets us build in its context
    panel(constraints: 'left, grow',
            id: 'componentHealthContainer',
            border: compoundBorder(outer: emptyBorder(5),
                    inner: titledBorder(title: 'Health'))) {
        migLayout(layoutConstraints: 'wrap 2')
    }
}