
package org.mule.modules.barn.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.barn.BarnConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>BarnConnectorProcessAdapter</code> is a wrapper around {@link BarnConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-02T11:55:08-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class BarnConnectorProcessAdapter
    extends BarnConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<BarnConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, BarnConnectorCapabilitiesAdapter> getProcessTemplate() {
        final BarnConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,BarnConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, BarnConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, BarnConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
