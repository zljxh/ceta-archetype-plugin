#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.connector;

import ${package}.connector.action.Action
import ${package}.connector.connector.ConnectorInstance


ConnectorInstance connectorInstance = new ConnectorInstance()
Map inputs = [:]
def instance = connectorInstance.getSdkConnectorInstance(connector, inputs)


def actionInputs = [:]
Action action = new Action();

result = action.action(instance.connectorInstance, actionInputs)

println result
