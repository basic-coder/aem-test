/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.test.components.custom.textbox;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class urlStructure__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_resource = bindings.get("resource");
Object _dynamic_request = bindings.get("request");
Object _dynamic_properties = bindings.get("properties");
{
    String var_0 = (("Resource : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_resource, "path"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</br>");
{
    String var_1 = (("\r\n\r\nScheme : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_request, "scheme"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</br>");
{
    String var_2 = (("\r\nPORT : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_request, "serverPort"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("<br/>");
{
    String var_3 = (("\r\n\r\nURI : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_request, "requestURI"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("<br/>");
{
    String var_4 = (("\r\n\r\nSelectors: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_request, "requestPathInfo"), "selectors"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</br>");
{
    String var_5 = (("\r\n\r\nSUFFIXs : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_request, "requestPathInfo"), "suffix"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</br>");
{
    String var_6 = ((("\r\n\r\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("format", "Hi, {0} why is {1}", obj().with("format", (new Object[] {"bhavesh", "this"}))), "text"))) + "\r\n\r\n") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("format", "yyyy-mm-dd", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:created"))), "text")));
    out.write(renderContext.getObjectModel().toString(var_6));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

