/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;


/**
* The Helper for <tt>CompletionStatus</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/CompletionStatusHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* 03 June 1999 11:52:03 o'clock GMT+00:00
*/

abstract public class CompletionStatusHelper
{
  private static String  _id = "IDL:omg.org/CORBA/CompletionStatus:1.0";

  public static void insert (Any a, CompletionStatus that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CompletionStatus extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_enum_tc (CompletionStatusHelper.id (), "CompletionStatus", new String[] { "COMPLETED_YES", "COMPLETED_NO", "COMPLETED_MAYBE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CompletionStatus read (org.omg.CORBA.portable.InputStream istream)
  {
    return CompletionStatus.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CompletionStatus value)
  {
    ostream.write_long (value.value ());
  }

}
