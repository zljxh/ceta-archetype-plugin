#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.connector.connector;


public class ConnectorInstance {

    def getSdkConnectorInstance(Map inputs) {
        return ["connectorInstance": buildInstance(inputs)]
    }

    // inputs are the inputs of the connectorType
    def buildInstance(Map inputs) {
        // Note: Please try to use caching whenever possible. cache, expires, and timeUnit are explained in the HTTP Connector section.
        // The three values "cache": true, "expires": 15000, "timeUnit": "HOURS" refer to the connectorType documentation
        // executeScriptResult is the result of executing the script, initialized as null here
        return ["cache": true, "expires": 15000, "timeUnit": "HOURS", executeScriptResult: null]
    }
}




