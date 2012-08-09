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

def json = new groovy.json.JsonBuilder()

json.contacts {
    contact {
        name 'Jacques Berger'
        address {
            civic_number 2680
            street_name 'Bellerose'
            city 'Longueuil'
            postal_code 'J0L 1C0'
        }
        phone_numbers {
            home '450-995-3823'
            cell '514-994-3443'
            work '514-987-3000'
        }
    }
}

println json