/*
 * Copyright 2012 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package syntax

import groovy.xml.MarkupBuilder

def builder = new MarkupBuilder()
builder.html() {
    head(){
        meta(charset:"utf-8")
        title("Groovy Versus Java")
    }
    body(style:"margin:auto; width:600px") {
        p("J'adore écrire du markup avec Groovy.")
        p("Groovy est bien plus cool que Java.")
        p("Affichons des liens intéressants :")
        ul() {
            li() {
                a(href:"http://www.jberger.org/inf2015/", "Le site du cours")
            }
            li() {
                a(href:"http://www.jberger.org/", "Le Blog de l'enseignant")
            }
            li() {
                a(href:"http://agilemanifesto.org/", "Le manifeste Agile")
            }
        }
    }
}

println ""