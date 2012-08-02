/* Copyright 2011 Jacques Berger

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package domxml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class JavaDomXml {

    public static void main(String[] args) throws Exception {
        DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = parser.parse("xml/documents.xml");
        
        NodeList list = document.getElementsByTagName("document");
        int listLength = list.getLength();
        
        for (int i = 0; i < listLength; i++) {
            Node listItem = list.item(i);
            NamedNodeMap attributes = listItem.getAttributes();
            Node typeAttribute = attributes.getNamedItem("type");
            
            if (typeAttribute.getNodeValue().equalsIgnoreCase("book")) {
                Element book = (Element) listItem;
                NodeList titles = book.getElementsByTagName("title");
                System.out.println(titles.item(0).getTextContent());
            }
        }
    }
}