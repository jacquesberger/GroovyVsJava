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

forDeclarationJava(10)
forDeclarationGroovyV1(10)
forDeclarationGroovyV2(10)
forDeclarationGroovyV3(10)
forDeclarationGroovyV4()

def forDeclarationJava(index) {
    for (int i = 0; i < index; i++)
        System.out.println(i);
}

def forDeclarationGroovyV1(index) {
    for (i in 0..index-1)
        println i
}

def forDeclarationGroovyV2(index) {
    for (i in 0..<index)
        println i
}

def forDeclarationGroovyV3(index) {
    index.times {
        println it
    }
}

def forDeclarationGroovyV4() {
    10.times {
        println it
    }
}