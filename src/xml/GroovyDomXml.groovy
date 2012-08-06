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
package xml

import javax.xml.parsers.DocumentBuilderFactory

def documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
def document = documentBuilder.parse("xml/documents.xml").documentElement

def documentList = document.getElementsByTagName("document")
(0..<documentList.length).each {
    def listItem = documentList.item(it)
    if (listItem.attributes.getNamedItem('type').nodeValue == "book")
        println listItem.getElementsByTagName("title").item(0).getTextContent()
}