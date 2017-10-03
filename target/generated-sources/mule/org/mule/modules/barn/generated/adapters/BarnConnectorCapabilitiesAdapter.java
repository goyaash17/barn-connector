
package org.mule.modules.barn.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.barn.BarnConnector;


/**
 * A <code>BarnConnectorCapabilitiesAdapter</code> is a wrapper around {@link BarnConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-02T11:55:08-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class BarnConnectorCapabilitiesAdapter
    extends BarnConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
