package at.notamWebapp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Created by khoef on 03.05.2017.
 */
public class NameSpaceFilter extends XMLFilterImpl {
    private String usedNamespaceUri;
    private boolean isAddNamespace;

    // State variable
    private boolean isAddedNamespaceAlready = false;

    public NameSpaceFilter(String namespaceUri, boolean addNamespace)
    {
        super();

        if (addNamespace)
            usedNamespaceUri = namespaceUri;
        else
            usedNamespaceUri = "";

        isAddNamespace = addNamespace;
    }

    @Override
    public void startDocument() throws SAXException
    {
        super.startDocument();
        if (isAddNamespace)
        {
            startControlledPrefixMapping();
        }
    }

    @Override
    public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException
    {
        super.startElement(usedNamespaceUri, arg1, arg2, arg3);
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException
    {
        super.endElement(usedNamespaceUri, arg1, arg2);
    }

    @Override
    public void startPrefixMapping(String prefix, String url) throws SAXException
    {
        if (isAddNamespace)
        {
            startControlledPrefixMapping();
        }
        else
        {
            // Remove the namespace, i.e. don?t call startPrefixMapping for parent!
        }
    }

    private void startControlledPrefixMapping() throws SAXException
    {
        if (isAddNamespace && !isAddedNamespaceAlready)
        {
            // We should add namespace since it is set and has not yet been done.
            super.startPrefixMapping("", usedNamespaceUri);

            // Make sure we dont do it twice
            isAddedNamespaceAlready = true;
        }
    }
}