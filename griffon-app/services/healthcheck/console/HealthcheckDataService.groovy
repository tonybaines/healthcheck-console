package healthcheck.console

class HealthcheckDataService {

    def getHealth(String serviceUri) {
        def results
        withRest(uri: serviceUri) {
            def response = get(path : 'health')
            results = response.data
        }
        results
    }

    def getStatistics(String serviceUri) {
        def results
        withRest(uri: serviceUri) {
            def response = get(path : 'statistics')
            results = response.data
        }
        results
    }

    def getInformation(String serviceUri) {
        def results
        withRest(uri: serviceUri) {
            def response = get(path : 'information')
            results = response.data
        }
        results
    }
}