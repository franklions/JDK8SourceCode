package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/LocatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u201/12322/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, December 15, 2018 6:37:00 PM PST
*/

public final class LocatorHolder implements org.omg.CORBA.portable.Streamable
{
  public Locator value = null;

  public LocatorHolder ()
  {
  }

  public LocatorHolder (Locator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LocatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LocatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LocatorHelper.type ();
  }

}
