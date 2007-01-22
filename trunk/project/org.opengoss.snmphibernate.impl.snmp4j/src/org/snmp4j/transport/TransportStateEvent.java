/*_############################################################################
  _## 
  _##  SNMP4J - TransportStateEvent.java  
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


package org.snmp4j.transport;

import java.io.*;
import java.util.*;

import org.snmp4j.smi.*;

/**
 * The <code>TransportStateEvent</code> describes a state change for
 * a transport connection.
 *
 * @author Frank Fock
 * @version 1.7
 * @since 1.7
 */
public class TransportStateEvent extends EventObject {

  public static final int STATE_UNKNOWN = 0;
  public static final int STATE_CONNECTED = 1;
  public static final int STATE_DISCONNECTED_REMOTELY = 2;
  public static final int STATE_DISCONNECTED_TIMEOUT = 3;
  public static final int STATE_CLOSED = 4;

  private int newState;
  private Address peerAddress;
  private IOException causingException;

  public TransportStateEvent(Object source,
                             Address peerAddress,
                             int newState,
                             IOException causingException) {
    super(source);
    this.newState = newState;
    this.peerAddress = peerAddress;
    this.causingException = causingException;
  }

  public IOException getCausingException() {
    return causingException;
  }

  public int getNewState() {
    return newState;
  }

  public Address getPeerAddress() {
    return peerAddress;
  }

  public String toString() {
    return TransportStateEvent.class.getName()+"[source="+source+
        ",peerAddress="+peerAddress+
        ",newState="+newState+
        ",causingException="+causingException+"]";
  }
}
