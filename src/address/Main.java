/*
 * Copyright 2011 Jacques Berger.
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
package address;

public class Main {

    public static void main(String[] args) {
        JavaCanadianAddress testJava = new JavaCanadianAddress(75, "Port-Royal Est", "Suite 500", "Montréal", "QC", "H3L3T1");
        GroovyCanadianAddress testGroovy = new GroovyCanadianAddress(75, "Port-Royal Est", "Suite 500", "Montréal", "QC", "H3L3T1");
        System.out.println("Test de Java :\n" + testJava + "\n\nTest de Groovy :\n" + testGroovy);
    }
}
