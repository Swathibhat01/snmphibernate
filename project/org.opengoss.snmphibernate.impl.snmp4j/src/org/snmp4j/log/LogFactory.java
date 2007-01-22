/*_############################################################################
  _## 
  _##  SNMP4J - LogFactory.java  
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



package org.snmp4j.log;

import java.util.Iterator;
import java.util.Collections;

/**
 * The <code>LogFactory</code> singleton is used by SNMP4J to determine
 * the logging framework used to process SNMP4J log messages. By default
 * {@link NoLogger} instances are used.
 *
 * @author Frank Fock
 * @version 1.7
 * @since 1.2.1
 */
public class LogFactory {

  private static LogFactory snmp4jLogFactory = null;

  /**
   * Gets the logger for the supplied class.
   *
   * @param c
   *    the class for which a logger needs to be created.
   * @return
   *    the <code>LogAdapter</code> instance.
   */
  public static LogAdapter getLogger(Class c) {
    if (snmp4jLogFactory == null) {
      return NoLogger.instance;
    }
    else {
      return snmp4jLogFactory.createLogger(c.getName());
    }
  }

  /**
   * Returns the top level logger.
   * @return
   *    a LogAdapter instance.
   * @since 1.7
   */
  public LogAdapter getRootLogger() {
    return NoLogger.instance;
  }

  /**
   * Gets the logger for the supplied class name.
   *
   * @param className
   *    the class name for which a logger needs to be created.
   * @return
   *    the <code>LogAdapter</code> instance.
   * @since 1.7
   */
  public static LogAdapter getLogger(String className) {
    if (snmp4jLogFactory == null) {
      return NoLogger.instance;
    }
    else {
      return snmp4jLogFactory.createLogger(className);
    }
  }

  /**
   * Creates a Logger for the specified class. This method returns the
   * {@link NoLogger} logger instance which disables logging.
   * Overwrite this method the return a custom logger to enable logging for
   * SNMP4J.
   *
   * @param c
   *    the class for which a logger needs to be created.
   * @return
   *    the <code>LogAdapter</code> instance.
   */
  protected LogAdapter createLogger(Class c) {
    return NoLogger.instance;
  }

  /**
   * Creates a Logger for the specified class. This method returns the
   * {@link NoLogger} logger instance which disables logging.
   * Overwrite this method the return a custom logger to enable logging for
   * SNMP4J.
   *
   * @param className
   *    the class name for which a logger needs to be created.
   * @return
   *    the <code>LogAdapter</code> instance.
   * @since 1.7
   */
  protected LogAdapter createLogger(String className) {
    return NoLogger.instance;
  }

  /**
   * Sets the log factory to be used by SNMP4J. Call this method before
   * any other SNMP4J class is referenced or created to set and use a custom
   * log factory.
   *
   * @param factory
   *    a <code>LogFactory</code> instance.
   */
  public static void setLogFactory(LogFactory factory) {
    snmp4jLogFactory = factory;
  }

  /**
   * Gets the log factory to be used by SNMP4J.
   * @return
   *    a <code>LogFactory</code> instance.
   * @since 1.7
   */
  public static LogFactory getLogFactory() {
    return snmp4jLogFactory;
  }

  /**
   * Returns all available LogAdapters in depth first order.
   * @return
   *    a read-only Iterator.
   * @since 1.7
   */
  public Iterator loggers() {
    return Collections.singletonList(NoLogger.instance).iterator();
  }

}
