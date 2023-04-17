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

public final class textbox__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_author = null;
Object _dynamic_request = bindings.get("request");
Collection var_collectionvar1_list_coerced$ = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _dynamic_inheritedpageproperties = bindings.get("inheritedpageproperties");
Object _global_array = null;
Collection var_collectionvar13_list_coerced$ = null;
Object _global_books = null;
Collection var_collectionvar32_list_coerced$ = null;
Collection var_collectionvar44_list_coerced$ = null;
Object _global_clientlibs = null;
Object _global_custom = null;
Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar64_list_coerced$ = null;
Collection var_collectionvar74_list_coerced$ = null;
Collection var_collectionvar85_list_coerced$ = null;
Collection var_collectionvar95_list_coerced$ = null;
Object _global_formdataobject = null;
_global_author = renderContext.call("use", com.test.core.core.models.Author.class.getName(), obj().with("rAttribute", "testAttribute"));
out.write("\n\n<!-- query params &key=456 -->");
{
    String var_0 = (("\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_request, "requestParameterMap"), "key"), 0), "toString"), "text"))) + "\n\n");
    out.write(renderContext.getObjectModel().toString(var_0));
}
{
    String var_collectionvar1 = (renderContext.getObjectModel().toString(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_request, "requestParameterMap"), "keySet")) + " ");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object item : var_collectionvar1_list_coerced$) {
                                {
                                    boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                    if (var_traversal10) {
                                        {
                                            String var_11 = (("\n    Key : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "toString"), "text"))) + "\n");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                    }
                                }
                                var_index8++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
{
    String var_12 = (((("\n\n\n\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit"), "text"))) + "\n\n") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "key"), "text"))) + "\n\n");
    out.write(renderContext.getObjectModel().toString(var_12));
}
_global_array = (new Object[] {"a", "b", "c", "d"});
if (renderContext.getObjectModel().toBoolean(_global_array)) {
}
out.write("\n\n");
{
    Object var_collectionvar13 = _global_array;
    {
        long var_size14 = ((var_collectionvar13_list_coerced$ == null ? (var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13)) : var_collectionvar13_list_coerced$).size());
        {
            boolean var_notempty15 = (var_size14 > 0);
            if (var_notempty15) {
                {
                    boolean var_validstartstepend19 = (((1 < var_size14) && true) && true);
                    if (var_validstartstepend19) {
                        if (var_collectionvar13_list_coerced$ == null) {
                            var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13);
                        }
                        long var_index20 = 0;
                        for (Object item : var_collectionvar13_list_coerced$) {
                            {
                                long var_stepcondition21 = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.REM.eval((renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.SUB.eval(var_index20, 1)).longValue()), 1)).longValue());
                                {
                                    boolean var_traversal22 = (((var_index20 >= 1) && (var_index20 <= 2)) && (var_stepcondition21 == 0));
                                    if (var_traversal22) {
                                        {
                                            String var_23 = (("\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", item, "text"))) + "\n");
                                            out.write(renderContext.getObjectModel().toString(var_23));
                                        }
                                    }
                                }
                            }
                            var_index20++;
                        }
                    }
                }
            }
        }
    }
    var_collectionvar13_list_coerced$ = null;
}
out.write("\n\n\n\n<h1>");
{
    String var_24 = ((" hello my name is " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "firstName"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_24));
}
out.write("</h1>\n<h1>");
{
    String var_25 = ((" hello my last name is " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "lastName"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_25));
}
out.write("</h1>\n<h1>");
{
    String var_26 = ((" is checked " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "isAuthor"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_26));
}
out.write("</h1>\n<h1>");
{
    String var_27 = ((" is page title " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "pageTitle"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_27));
}
out.write("</h1>\n<h1>");
{
    String var_28 = ((" requested var " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "requestedTitle"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_28));
}
out.write("</h1>\n<h1>");
{
    String var_29 = ((" requested var " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "homePath"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_29));
}
out.write("</h1>\n<h1>");
{
    String var_30 = ((" requested var " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "lastModified"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_30));
}
out.write("</h1>\n\n");
_global_books = renderContext.call("use", com.test.core.core.models.AuthorBooks.class.getName(), obj());
out.write("\n\n<h1>");
{
    String var_31 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_books, "authorName"), "text"))) + " Books ");
    out.write(renderContext.getObjectModel().toString(var_31));
}
out.write("</h1>\n\n");
{
    Object var_collectionvar32 = renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks");
    {
        long var_size33 = ((var_collectionvar32_list_coerced$ == null ? (var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32)) : var_collectionvar32_list_coerced$).size());
        {
            boolean var_notempty34 = (var_size33 > 0);
            if (var_notempty34) {
                {
                    long var_end37 = var_size33;
                    {
                        boolean var_validstartstepend38 = (((0 < var_size33) && true) && (var_end37 > 0));
                        if (var_validstartstepend38) {
                            out.write("<div>");
                            if (var_collectionvar32_list_coerced$ == null) {
                                var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32);
                            }
                            long var_index39 = 0;
                            for (Object item : var_collectionvar32_list_coerced$) {
                                {
                                    boolean var_traversal41 = (((var_index39 >= 0) && (var_index39 <= var_end37)) && true);
                                    if (var_traversal41) {
                                        out.write("\n    <p> Book : <b>");
                                        {
                                            String var_42 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", item, "text"))) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_42));
                                        }
                                        out.write("</b> </p>\n\n");
                                    }
                                }
                                var_index39++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar32_list_coerced$ = null;
}
out.write("\n<p> All Books : <b>");
{
    String var_43 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("join", renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks"), ","), "text")));
    out.write(renderContext.getObjectModel().toString(var_43));
}
out.write("</b> </p>\n\n");
{
    Object var_collectionvar44 = renderContext.getObjectModel().resolveProperty(_global_books, "bookDetailsWithMap");
    {
        long var_size45 = ((var_collectionvar44_list_coerced$ == null ? (var_collectionvar44_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar44)) : var_collectionvar44_list_coerced$).size());
        {
            boolean var_notempty46 = (var_size45 > 0);
            if (var_notempty46) {
                {
                    long var_end49 = var_size45;
                    {
                        boolean var_validstartstepend50 = (((0 < var_size45) && true) && (var_end49 > 0));
                        if (var_validstartstepend50) {
                            out.write("<div>");
                            if (var_collectionvar44_list_coerced$ == null) {
                                var_collectionvar44_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar44);
                            }
                            long var_index51 = 0;
                            for (Object item : var_collectionvar44_list_coerced$) {
                                {
                                    boolean var_traversal53 = (((var_index51 >= 0) && (var_index51 <= var_end49)) && true);
                                    if (var_traversal53) {
                                        out.write("\n    <p> Book : <b>");
                                        {
                                            String var_54 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "bookname"), "text"))) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_54));
                                        }
                                        out.write("</b> </p>\n    <p> Book : <b>");
                                        {
                                            String var_55 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "booksubject"), "text"))) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_55));
                                        }
                                        out.write("</b> </p>\n    <p> Book : <b>");
                                        {
                                            String var_56 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "publishyear"), "text"))) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_56));
                                        }
                                        out.write("</b> </p>\n\n");
                                    }
                                }
                                var_index51++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar44_list_coerced$ = null;
}
out.write("\n\n\n");
{
    Object var_includedresult57 = renderContext.call("include", "urlStructure.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult57));
}
out.write("\n\n");
_global_clientlibs = renderContext.call("use", com.adobe.cq.wcm.core.components.models.ClientLibraries.class.getName(), obj().with("async", true).with("crossorigin", "anonymous").with("defer", true).with("categories", "clientlib-a").with("onload", "console.log('loaded: ' + this.src)"));
{
    String var_59 = (("\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_clientlibs, "jsAndCssIncludes"), "unsafe"))) + "\n");
    out.write(renderContext.getObjectModel().toString(var_59));
}
out.write("\n\n");
{
    Object var_resourcecontent60 = renderContext.call("includeResource", null, obj().with("addSelectors", "amp").with("resourceType", "test/components/custom/page"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent60));
}
out.write("\n\n");
_global_custom = renderContext.call("use", "custom-template.html", obj());
out.write("\n");
{
    Object var_templatevar61 = renderContext.getObjectModel().resolveProperty(_global_custom, "render");
    {
        String var_templateoptions62_field$_val = "hello";
        {
            java.util.Map var_templateoptions62 = obj().with("val", var_templateoptions62_field$_val);
            callUnit(out, renderContext, var_templatevar61, var_templateoptions62);
        }
    }
}
out.write("\n\n\n<h2> Custom form</h2>");
{
    String var_63 = (("\n\n" + renderContext.getObjectModel().toString(renderContext.call("xss", null, "text"))) + "\n\n");
    out.write(renderContext.getObjectModel().toString(var_63));
}
{
    Object var_collectionvar64 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "children");
    {
        long var_size65 = ((var_collectionvar64_list_coerced$ == null ? (var_collectionvar64_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar64)) : var_collectionvar64_list_coerced$).size());
        {
            boolean var_notempty66 = (var_size65 > 0);
            if (var_notempty66) {
                {
                    long var_end69 = var_size65;
                    {
                        boolean var_validstartstepend70 = (((0 < var_size65) && true) && (var_end69 > 0));
                        if (var_validstartstepend70) {
                            if (var_collectionvar64_list_coerced$ == null) {
                                var_collectionvar64_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar64);
                            }
                            long var_index71 = 0;
                            for (Object resourcelist : var_collectionvar64_list_coerced$) {
                                {
                                    boolean var_traversal73 = (((var_index71 >= 0) && (var_index71 <= var_end69)) && true);
                                    if (var_traversal73) {
                                        out.write("\n    ");
                                        {
                                            Object var_collectionvar74 = renderContext.getObjectModel().resolveProperty(resourcelist, "children");
                                            {
                                                long var_size75 = ((var_collectionvar74_list_coerced$ == null ? (var_collectionvar74_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar74)) : var_collectionvar74_list_coerced$).size());
                                                {
                                                    boolean var_notempty76 = (var_size75 > 0);
                                                    if (var_notempty76) {
                                                        {
                                                            long var_end79 = var_size75;
                                                            {
                                                                boolean var_validstartstepend80 = (((0 < var_size75) && true) && (var_end79 > 0));
                                                                if (var_validstartstepend80) {
                                                                    if (var_collectionvar74_list_coerced$ == null) {
                                                                        var_collectionvar74_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar74);
                                                                    }
                                                                    long var_index81 = 0;
                                                                    for (Object inputs : var_collectionvar74_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal83 = (((var_index81 >= 0) && (var_index81 <= var_end79)) && true);
                                                                            if (var_traversal83) {
                                                                                out.write("\n        ");
                                                                                {
                                                                                    Object var_tagvar84 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(inputs, "element"), "elementName");
                                                                                    if (renderContext.getObjectModel().toBoolean(var_tagvar84)) {
                                                                                        out.write("<");
                                                                                        out.write(renderContext.getObjectModel().toString(var_tagvar84));
                                                                                    }
                                                                                    if (!renderContext.getObjectModel().toBoolean(var_tagvar84)) {
                                                                                        out.write("<div");
                                                                                    }
                                                                                    out.write("> hello");
                                                                                    if (renderContext.getObjectModel().toBoolean(var_tagvar84)) {
                                                                                        out.write("</");
                                                                                        out.write(renderContext.getObjectModel().toString(var_tagvar84));
                                                                                        out.write(">");
                                                                                    }
                                                                                    if (!renderContext.getObjectModel().toBoolean(var_tagvar84)) {
                                                                                        out.write("</div>");
                                                                                    }
                                                                                }
                                                                                out.write("\n        ");
                                                                                {
                                                                                    Object var_collectionvar85 = renderContext.getObjectModel().resolveProperty(inputs, "children");
                                                                                    {
                                                                                        long var_size86 = ((var_collectionvar85_list_coerced$ == null ? (var_collectionvar85_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar85)) : var_collectionvar85_list_coerced$).size());
                                                                                        {
                                                                                            boolean var_notempty87 = (var_size86 > 0);
                                                                                            if (var_notempty87) {
                                                                                                {
                                                                                                    long var_end90 = var_size86;
                                                                                                    {
                                                                                                        boolean var_validstartstepend91 = (((0 < var_size86) && true) && (var_end90 > 0));
                                                                                                        if (var_validstartstepend91) {
                                                                                                            if (var_collectionvar85_list_coerced$ == null) {
                                                                                                                var_collectionvar85_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar85);
                                                                                                            }
                                                                                                            long var_index92 = 0;
                                                                                                            for (Object innerlist : var_collectionvar85_list_coerced$) {
                                                                                                                {
                                                                                                                    boolean var_traversal94 = (((var_index92 >= 0) && (var_index92 <= var_end90)) && true);
                                                                                                                    if (var_traversal94) {
                                                                                                                        out.write("\n            ");
                                                                                                                        {
                                                                                                                            Object var_collectionvar95 = renderContext.getObjectModel().resolveProperty(innerlist, "children");
                                                                                                                            {
                                                                                                                                long var_size96 = ((var_collectionvar95_list_coerced$ == null ? (var_collectionvar95_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar95)) : var_collectionvar95_list_coerced$).size());
                                                                                                                                {
                                                                                                                                    boolean var_notempty97 = (var_size96 > 0);
                                                                                                                                    if (var_notempty97) {
                                                                                                                                        {
                                                                                                                                            long var_end100 = var_size96;
                                                                                                                                            {
                                                                                                                                                boolean var_validstartstepend101 = (((0 < var_size96) && true) && (var_end100 > 0));
                                                                                                                                                if (var_validstartstepend101) {
                                                                                                                                                    if (var_collectionvar95_list_coerced$ == null) {
                                                                                                                                                        var_collectionvar95_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar95);
                                                                                                                                                    }
                                                                                                                                                    long var_index102 = 0;
                                                                                                                                                    for (Object input : var_collectionvar95_list_coerced$) {
                                                                                                                                                        {
                                                                                                                                                            boolean var_traversal104 = (((var_index102 >= 0) && (var_index102 <= var_end100)) && true);
                                                                                                                                                            if (var_traversal104) {
                                                                                                                                                                out.write("\n                <br/>");
                                                                                                                                                                {
                                                                                                                                                                    String var_105 = ((" Attribute key : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(input, "key"), "text"))) + "\n                ");
                                                                                                                                                                    out.write(renderContext.getObjectModel().toString(var_105));
                                                                                                                                                                }
                                                                                                                                                                out.write("<br/>");
                                                                                                                                                                {
                                                                                                                                                                    String var_106 = ((" Attribute Value : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(input, "value"), "text"))) + "\n\n\n            ");
                                                                                                                                                                    out.write(renderContext.getObjectModel().toString(var_106));
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        var_index102++;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var_collectionvar95_list_coerced$ = null;
                                                                                                                        }
                                                                                                                        out.write("\n        ");
                                                                                                                    }
                                                                                                                }
                                                                                                                var_index92++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    var_collectionvar85_list_coerced$ = null;
                                                                                }
                                                                                out.write("\n    ");
                                                                            }
                                                                        }
                                                                        var_index81++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar74_list_coerced$ = null;
                                        }
                                        out.write("\n");
                                    }
                                }
                                var_index71++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar64_list_coerced$ = null;
}
out.write("\n\n");
_global_formdataobject = renderContext.call("use", com.test.core.core.models.FormData.class.getName(), obj());
{
    String var_107 = ("\n\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_formdataobject, "slingResourceType"), "text")));
    out.write(renderContext.getObjectModel().toString(var_107));
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

