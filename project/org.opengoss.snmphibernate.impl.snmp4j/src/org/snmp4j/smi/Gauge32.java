/*_############################################################################
  _## 
  _##  SNMP4J - Gauge32.java  
  _## 
  _##  Copyright 2003-2006  Frank Fock and Jochen Katz (SNMP4J.org)
  _##  
  _##  Licensed under the Apache License, Version 2.0 (the "License");
  _##  you may not use this file except in compliance with the License.
  _##  You may obtain a copy of the License at
  _##  
  _##      http://www.apache.org/licenses/LICENSE-2.0
  _##  
  _##  Unless required by applicable law or agreed to in writing, software
  _##  distributed under the License is distributed on an "AS IS" BASIS,
  _##  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  _##  See the License for the specific language governing permissions and
  _##  limitations under the License.
  _##  
  _##########################################################################*/





package org.snmp4j.smi;

/**
 * The <code>Gauge32</code> class is indistinguishable from
 * <code>UnsingedInteger32</code>.
 *
 * @author Frank Fock
 * @version 1.0
 */
public class Gauge32 extends UnsignedInteger32 {

  static final long serialVersionUID = 1469573439175461445L;

  public Gauge32() {
  }

  public Gauge32(long value) {
    super(value);
  }

  public int getSyntax() {
    return SMIConstants.SYNTAX_GAUGE32;
  }

  public Object clone() {
    return new Gauge32(value);
  }

}
