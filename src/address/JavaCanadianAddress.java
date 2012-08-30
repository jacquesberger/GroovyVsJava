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

public class JavaCanadianAddress {
    private int civicNumber;
    private String street;
    private String appartment;
    private String city;
    private String province;
    private String postalCode;
    
    public JavaCanadianAddress () {
    }
    
    public JavaCanadianAddress(int civicNumber, String street, String appartment,
                           String city, String province, String postalCode) {
        this.civicNumber = civicNumber;
        this.street = street;
        this.appartment = appartment;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCivicNumber() {
        return civicNumber;
    }

    public void setCivicNumber(int civicNumber) {
        this.civicNumber = civicNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return civicNumber + " " + street + " " + appartment + "\n" + city + ", " + province + "\n" + postalCode;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.civicNumber;
        hash = 13 * hash + (this.street != null ? this.street.hashCode() : 0);
        hash = 13 * hash + (this.appartment != null ? this.appartment.hashCode() : 0);
        hash = 13 * hash + (this.city != null ? this.city.hashCode() : 0);
        hash = 13 * hash + (this.province != null ? this.province.hashCode() : 0);
        hash = 13 * hash + (this.postalCode != null ? this.postalCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JavaCanadianAddress other = (JavaCanadianAddress) obj;
        if (this.civicNumber != other.civicNumber) {
            return false;
        }
        if ((this.street == null) ? (other.street != null) : !this.street.equals(other.street)) {
            return false;
        }
        if ((this.appartment == null) ? (other.appartment != null) : !this.appartment.equals(other.appartment)) {
            return false;
        }
        if ((this.city == null) ? (other.city != null) : !this.city.equals(other.city)) {
            return false;
        }
        if ((this.province == null) ? (other.province != null) : !this.province.equals(other.province)) {
            return false;
        }
        if ((this.postalCode == null) ? (other.postalCode != null) : !this.postalCode.equals(other.postalCode)) {
            return false;
        }
        return true;
    }
}