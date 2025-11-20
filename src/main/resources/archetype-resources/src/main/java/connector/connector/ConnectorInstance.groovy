#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.connector.connector;


public class ConnectorInstance {

    def getSdkConnectorInstance(Map inputs) {
        return ["connectorInstance": buildInstance(inputs)]
    }

    def buildInstance(Map inputs) {
    }
}




