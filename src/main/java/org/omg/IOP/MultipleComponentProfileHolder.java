package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u201/12322/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Saturday, December 15, 2018 6:37:04 PM PST
*/


/** An array of tagged components, forming a multiple component profile. */
public final class MultipleComponentProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public TaggedComponent value[] = null;

  public MultipleComponentProfileHolder ()
  {
  }

  public MultipleComponentProfileHolder (TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MultipleComponentProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MultipleComponentProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MultipleComponentProfileHelper.type ();
  }

}
