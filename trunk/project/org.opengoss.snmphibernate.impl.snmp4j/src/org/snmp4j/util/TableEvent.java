/*_############################################################################
  _## 
  _##  SNMP4J - TableEvent.java  
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



package org.snmp4j.util;

import java.util.EventObject;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.PDU;

/**
 * The <code>TableEvent</code> class reports events in a table retrieval
 * operation.
 *
 * @author Frank Fock
 * @version 1.0.2
 * @since 1.0.2
 * @see TableUtils
 */
public class TableEvent extends EventObject {

  /**
   * Table operation was successfull.
   */
  public static final int STATUS_OK = 0;
  /**
   * A request to the agent timed out.
   */
  public static final int STATUS_TIMEOUT = -1;
  /**
   * The agent failed to return the objects in lexicographic order.
   */
  public static final int STATUS_WRONG_ORDER = -2;
  /**
   * A report has been received from the agent.
   * @see #getReportPDU()
   */
  public static final int STATUS_REPORT = -3;
  /**
   * An exception occured during table operation.
   * @see #getException()
   */
  public static final int STATUS_EXCEPTION = -4;

  private OID index;
  private VariableBinding[] columns;
  private int status = STATUS_OK;
  private Object userObject;
  private Exception exception;
  private PDU reportPDU;

  protected TableEvent(Object source, Object userObject) {
    super(source);
    this.userObject = userObject;
  }

  /**
   * Creates a table event with a status.
   * @param source
   *    the source of the event.
   * @param userObject
   *    the user object or <code>null</code>.
   * @param status
   *    one of the status constants defined for this object.
   */
  public TableEvent(Object source, Object userObject, int status) {
    this(source, userObject);
    this.status = status;
  }

  /**
   * Creates a table event with an exception.
   * @param source
   *    the source of the event.
   * @param userObject
   *    the user object or <code>null</code>.
   * @param exception
   *    an exception instance.
   */
  public TableEvent(Object source, Object userObject, Exception exception) {
    this(source, userObject);
    this.exception = exception;
    this.status = STATUS_EXCEPTION;
  }

  /**
   * Creates a table event with a report PDU.
   * @param source
   *    the source of the event.
   * @param userObject
   *    the user object or <code>null</code>.
   * @param report
   *    a PDU of type {@link PDU#REPORT}.
   */
  public TableEvent(Object source, Object userObject, PDU report) {
    this(source, userObject);
    this.reportPDU = report;
    this.status = STATUS_REPORT;
  }

  /**
   * Creates a table event with row data.
   *
   * @param source
   *    the source of the event.
   * @param userObject
   *    the user object or <code>null</code>.
   * @param index
   *    the index OID of the row.
   * @param cols
   *    an array of <code>VariableBinding</code> instances containing the
   *    elements of the row. The array may contain <code>null</code> elements
   *    which indicates that the agent does not return an instance for that
   *    column and row index. If an element is not <code>null</code>, then
   *    the <code>OID</code> of the variable binding contains the full instance
   *    <code>OID</code> of the variable.
   */
  public TableEvent(Object source, Object userObject,
                    OID index, VariableBinding[] cols) {
    this(source, userObject);
    this.index = index;
    this.columns = cols;
  }

  /**
   * Gets the row index OID.
   * @return
   *    the row's index OID or <code>null</code> if {@link #isError()} returns
   *    <code>true</code>.
   */
  public OID getIndex() {
    return index;
  }

  /**
   * Gets the columnar objects of the row.
   * @return
   *    an array of <code>VariableBinding</code> instances containing the
   *    elements of the row. The array may contain <code>null</code> elements
   *    which indicates that the agent does not return an instance for that
   *    column and row index. If an element is not <code>null</code>, then
   *    the <code>OID</code> of the variable binding contains the full instance
   *    <code>OID</code> of the variable.<p>
   *    If {@link #isError()} returns <code>true</code>, <code>null</code>
   *    will be returned.
   */
  public VariableBinding[] getColumns() {
    return columns;
  }

  /**
   * Gets the status of the table operation.
   * @return
   *    one of the status constants defined for this object.
   *    {@link #STATUS_OK} indicates success, all other values indicate
   *    failure of the operation.
   */
  public int getStatus() {
    return status;
  }

  /**
   * Indicates whether the event reports an error or not.
   * @return
   *    <code>true</code> if the operation failed with an error.
   */
  public boolean isError() {
    return (status != STATUS_OK);
  }

  /**
   * Gets the user object that has been specified by the user when the table
   * operation that fired this event has been requested.
   * @return
   *    an object instance if an user object has been specified or
   *    <code>null</code> otherwise.
   */
  public Object getUserObject() {
    return userObject;
  }

  /**
   * Gets the exception associated with this event.
   * @return
   *    an Exception instance if there has been an exception instance
   *    associated with this event ({@link #getStatus()} returns
   *    {@link #STATUS_EXCEPTION}), or <code>null</code> otherwise.
   */
  public Exception getException() {
    return exception;
  }

  /**
   * Gets the report PDU associated with this event.
   * @return
   *    a <code>ScopedPDU</code> instance if there has been a report PDU instance
   *    associated with this event ({@link #getStatus()} returns
   *    {@link #STATUS_REPORT}), or <code>null</code> otherwise.
   */
  public PDU getReportPDU() {
    return reportPDU;
  }

}
