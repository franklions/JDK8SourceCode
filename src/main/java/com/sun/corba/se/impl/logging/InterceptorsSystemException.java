// Log wrapper class for Sun private system exceptions in group INTERCEPTORS
//
// Generated by MC.java version 1.0, DO NOT EDIT BY HAND!
// Generated from input file /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u201/12322/corba/src/share/classes/com/sun/corba/se/spi/logging/data/Interceptors.mc on Sat Dec 15 18:36:53 PST 2018

package com.sun.corba.se.impl.logging;

import java.util.logging.Logger ;
import java.util.logging.Level ;

import org.omg.CORBA.OMGVMCID ;
import com.sun.corba.se.impl.util.SUNVMCID ;
import org.omg.CORBA.CompletionStatus ;
import org.omg.CORBA.SystemException ;

import com.sun.corba.se.spi.orb.ORB ;

import com.sun.corba.se.spi.logging.LogWrapperFactory;

import com.sun.corba.se.spi.logging.LogWrapperBase;

import org.omg.CORBA.BAD_PARAM ;
import org.omg.CORBA.BAD_INV_ORDER ;
import org.omg.CORBA.COMM_FAILURE ;
import org.omg.CORBA.INTERNAL ;
import org.omg.CORBA.NO_IMPLEMENT ;
import org.omg.CORBA.OBJECT_NOT_EXIST ;
import org.omg.CORBA.UNKNOWN ;

public class InterceptorsSystemException extends LogWrapperBase {
    
    public InterceptorsSystemException( Logger logger )
    {
        super( logger ) ;
    }
    
    private static LogWrapperFactory factory = new LogWrapperFactory() {
        public LogWrapperBase create( Logger logger )
        {
            return new InterceptorsSystemException( logger ) ;
        }
    } ;
    
    public static InterceptorsSystemException get( ORB orb, String logDomain )
    {
        InterceptorsSystemException wrapper = 
            (InterceptorsSystemException) orb.getLogWrapper( logDomain, 
                "INTERCEPTORS", factory ) ;
        return wrapper ;
    } 
    
    public static InterceptorsSystemException get( String logDomain )
    {
        InterceptorsSystemException wrapper = 
            (InterceptorsSystemException) ORB.staticGetLogWrapper( logDomain, 
                "INTERCEPTORS", factory ) ;
        return wrapper ;
    } 
    
    ///////////////////////////////////////////////////////////
    // BAD_PARAM
    ///////////////////////////////////////////////////////////
    
    public static final int TYPE_OUT_OF_RANGE = SUNVMCID.value + 801 ;
    
    public BAD_PARAM typeOutOfRange( CompletionStatus cs, Throwable t, Object arg0) {
        BAD_PARAM exc = new BAD_PARAM( TYPE_OUT_OF_RANGE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[1] ;
            parameters[0] = arg0 ;
            doLog( Level.WARNING, "INTERCEPTORS.typeOutOfRange",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM typeOutOfRange( CompletionStatus cs, Object arg0) {
        return typeOutOfRange( cs, null, arg0 ) ;
    }
    
    public BAD_PARAM typeOutOfRange( Throwable t, Object arg0) {
        return typeOutOfRange( CompletionStatus.COMPLETED_NO, t, arg0 ) ;
    }
    
    public BAD_PARAM typeOutOfRange(  Object arg0) {
        return typeOutOfRange( CompletionStatus.COMPLETED_NO, null, arg0 ) ;
    }
    
    public static final int NAME_NULL = SUNVMCID.value + 802 ;
    
    public BAD_PARAM nameNull( CompletionStatus cs, Throwable t ) {
        BAD_PARAM exc = new BAD_PARAM( NAME_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.nameNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_PARAM nameNull( CompletionStatus cs ) {
        return nameNull( cs, null  ) ;
    }
    
    public BAD_PARAM nameNull( Throwable t ) {
        return nameNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_PARAM nameNull(  ) {
        return nameNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // BAD_INV_ORDER
    ///////////////////////////////////////////////////////////
    
    public static final int RIR_INVALID_PRE_INIT = SUNVMCID.value + 801 ;
    
    public BAD_INV_ORDER rirInvalidPreInit( CompletionStatus cs, Throwable t ) {
        BAD_INV_ORDER exc = new BAD_INV_ORDER( RIR_INVALID_PRE_INIT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.rirInvalidPreInit",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_INV_ORDER rirInvalidPreInit( CompletionStatus cs ) {
        return rirInvalidPreInit( cs, null  ) ;
    }
    
    public BAD_INV_ORDER rirInvalidPreInit( Throwable t ) {
        return rirInvalidPreInit( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public BAD_INV_ORDER rirInvalidPreInit(  ) {
        return rirInvalidPreInit( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int BAD_STATE1 = SUNVMCID.value + 802 ;
    
    public BAD_INV_ORDER badState1( CompletionStatus cs, Throwable t, Object arg0, Object arg1) {
        BAD_INV_ORDER exc = new BAD_INV_ORDER( BAD_STATE1, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[2] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            doLog( Level.WARNING, "INTERCEPTORS.badState1",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_INV_ORDER badState1( CompletionStatus cs, Object arg0, Object arg1) {
        return badState1( cs, null, arg0, arg1 ) ;
    }
    
    public BAD_INV_ORDER badState1( Throwable t, Object arg0, Object arg1) {
        return badState1( CompletionStatus.COMPLETED_NO, t, arg0, arg1 ) ;
    }
    
    public BAD_INV_ORDER badState1(  Object arg0, Object arg1) {
        return badState1( CompletionStatus.COMPLETED_NO, null, arg0, arg1 ) ;
    }
    
    public static final int BAD_STATE2 = SUNVMCID.value + 803 ;
    
    public BAD_INV_ORDER badState2( CompletionStatus cs, Throwable t, Object arg0, Object arg1, Object arg2) {
        BAD_INV_ORDER exc = new BAD_INV_ORDER( BAD_STATE2, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[3] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            parameters[2] = arg2 ;
            doLog( Level.WARNING, "INTERCEPTORS.badState2",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public BAD_INV_ORDER badState2( CompletionStatus cs, Object arg0, Object arg1, Object arg2) {
        return badState2( cs, null, arg0, arg1, arg2 ) ;
    }
    
    public BAD_INV_ORDER badState2( Throwable t, Object arg0, Object arg1, Object arg2) {
        return badState2( CompletionStatus.COMPLETED_NO, t, arg0, arg1, arg2 ) ;
    }
    
    public BAD_INV_ORDER badState2(  Object arg0, Object arg1, Object arg2) {
        return badState2( CompletionStatus.COMPLETED_NO, null, arg0, arg1, arg2 ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // COMM_FAILURE
    ///////////////////////////////////////////////////////////
    
    public static final int IOEXCEPTION_DURING_CANCEL_REQUEST = SUNVMCID.value + 801 ;
    
    public COMM_FAILURE ioexceptionDuringCancelRequest( CompletionStatus cs, Throwable t ) {
        COMM_FAILURE exc = new COMM_FAILURE( IOEXCEPTION_DURING_CANCEL_REQUEST, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.ioexceptionDuringCancelRequest",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public COMM_FAILURE ioexceptionDuringCancelRequest( CompletionStatus cs ) {
        return ioexceptionDuringCancelRequest( cs, null  ) ;
    }
    
    public COMM_FAILURE ioexceptionDuringCancelRequest( Throwable t ) {
        return ioexceptionDuringCancelRequest( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public COMM_FAILURE ioexceptionDuringCancelRequest(  ) {
        return ioexceptionDuringCancelRequest( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // INTERNAL
    ///////////////////////////////////////////////////////////
    
    public static final int EXCEPTION_WAS_NULL = SUNVMCID.value + 801 ;
    
    public INTERNAL exceptionWasNull( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_WAS_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionWasNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionWasNull( CompletionStatus cs ) {
        return exceptionWasNull( cs, null  ) ;
    }
    
    public INTERNAL exceptionWasNull( Throwable t ) {
        return exceptionWasNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionWasNull(  ) {
        return exceptionWasNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int OBJECT_HAS_NO_DELEGATE = SUNVMCID.value + 802 ;
    
    public INTERNAL objectHasNoDelegate( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( OBJECT_HAS_NO_DELEGATE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.objectHasNoDelegate",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL objectHasNoDelegate( CompletionStatus cs ) {
        return objectHasNoDelegate( cs, null  ) ;
    }
    
    public INTERNAL objectHasNoDelegate( Throwable t ) {
        return objectHasNoDelegate( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL objectHasNoDelegate(  ) {
        return objectHasNoDelegate( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int DELEGATE_NOT_CLIENTSUB = SUNVMCID.value + 803 ;
    
    public INTERNAL delegateNotClientsub( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( DELEGATE_NOT_CLIENTSUB, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.delegateNotClientsub",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL delegateNotClientsub( CompletionStatus cs ) {
        return delegateNotClientsub( cs, null  ) ;
    }
    
    public INTERNAL delegateNotClientsub( Throwable t ) {
        return delegateNotClientsub( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL delegateNotClientsub(  ) {
        return delegateNotClientsub( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int OBJECT_NOT_OBJECTIMPL = SUNVMCID.value + 804 ;
    
    public INTERNAL objectNotObjectimpl( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( OBJECT_NOT_OBJECTIMPL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.objectNotObjectimpl",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL objectNotObjectimpl( CompletionStatus cs ) {
        return objectNotObjectimpl( cs, null  ) ;
    }
    
    public INTERNAL objectNotObjectimpl( Throwable t ) {
        return objectNotObjectimpl( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL objectNotObjectimpl(  ) {
        return objectNotObjectimpl( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_INVALID = SUNVMCID.value + 805 ;
    
    public INTERNAL exceptionInvalid( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_INVALID, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionInvalid",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionInvalid( CompletionStatus cs ) {
        return exceptionInvalid( cs, null  ) ;
    }
    
    public INTERNAL exceptionInvalid( Throwable t ) {
        return exceptionInvalid( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionInvalid(  ) {
        return exceptionInvalid( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int REPLY_STATUS_NOT_INIT = SUNVMCID.value + 806 ;
    
    public INTERNAL replyStatusNotInit( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( REPLY_STATUS_NOT_INIT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.replyStatusNotInit",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL replyStatusNotInit( CompletionStatus cs ) {
        return replyStatusNotInit( cs, null  ) ;
    }
    
    public INTERNAL replyStatusNotInit( Throwable t ) {
        return replyStatusNotInit( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL replyStatusNotInit(  ) {
        return replyStatusNotInit( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_IN_ARGUMENTS = SUNVMCID.value + 807 ;
    
    public INTERNAL exceptionInArguments( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_IN_ARGUMENTS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionInArguments",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionInArguments( CompletionStatus cs ) {
        return exceptionInArguments( cs, null  ) ;
    }
    
    public INTERNAL exceptionInArguments( Throwable t ) {
        return exceptionInArguments( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionInArguments(  ) {
        return exceptionInArguments( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_IN_EXCEPTIONS = SUNVMCID.value + 808 ;
    
    public INTERNAL exceptionInExceptions( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_IN_EXCEPTIONS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionInExceptions",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionInExceptions( CompletionStatus cs ) {
        return exceptionInExceptions( cs, null  ) ;
    }
    
    public INTERNAL exceptionInExceptions( Throwable t ) {
        return exceptionInExceptions( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionInExceptions(  ) {
        return exceptionInExceptions( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_IN_CONTEXTS = SUNVMCID.value + 809 ;
    
    public INTERNAL exceptionInContexts( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_IN_CONTEXTS, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionInContexts",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionInContexts( CompletionStatus cs ) {
        return exceptionInContexts( cs, null  ) ;
    }
    
    public INTERNAL exceptionInContexts( Throwable t ) {
        return exceptionInContexts( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionInContexts(  ) {
        return exceptionInContexts( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_WAS_NULL_2 = SUNVMCID.value + 810 ;
    
    public INTERNAL exceptionWasNull2( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_WAS_NULL_2, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionWasNull2",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionWasNull2( CompletionStatus cs ) {
        return exceptionWasNull2( cs, null  ) ;
    }
    
    public INTERNAL exceptionWasNull2( Throwable t ) {
        return exceptionWasNull2( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionWasNull2(  ) {
        return exceptionWasNull2( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int SERVANT_INVALID = SUNVMCID.value + 811 ;
    
    public INTERNAL servantInvalid( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( SERVANT_INVALID, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.servantInvalid",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL servantInvalid( CompletionStatus cs ) {
        return servantInvalid( cs, null  ) ;
    }
    
    public INTERNAL servantInvalid( Throwable t ) {
        return servantInvalid( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL servantInvalid(  ) {
        return servantInvalid( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CANT_POP_ONLY_PICURRENT = SUNVMCID.value + 812 ;
    
    public INTERNAL cantPopOnlyPicurrent( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( CANT_POP_ONLY_PICURRENT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.cantPopOnlyPicurrent",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL cantPopOnlyPicurrent( CompletionStatus cs ) {
        return cantPopOnlyPicurrent( cs, null  ) ;
    }
    
    public INTERNAL cantPopOnlyPicurrent( Throwable t ) {
        return cantPopOnlyPicurrent( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL cantPopOnlyPicurrent(  ) {
        return cantPopOnlyPicurrent( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CANT_POP_ONLY_CURRENT_2 = SUNVMCID.value + 813 ;
    
    public INTERNAL cantPopOnlyCurrent2( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( CANT_POP_ONLY_CURRENT_2, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.cantPopOnlyCurrent2",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL cantPopOnlyCurrent2( CompletionStatus cs ) {
        return cantPopOnlyCurrent2( cs, null  ) ;
    }
    
    public INTERNAL cantPopOnlyCurrent2( Throwable t ) {
        return cantPopOnlyCurrent2( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL cantPopOnlyCurrent2(  ) {
        return cantPopOnlyCurrent2( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int PI_DSI_RESULT_IS_NULL = SUNVMCID.value + 814 ;
    
    public INTERNAL piDsiResultIsNull( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( PI_DSI_RESULT_IS_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.piDsiResultIsNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL piDsiResultIsNull( CompletionStatus cs ) {
        return piDsiResultIsNull( cs, null  ) ;
    }
    
    public INTERNAL piDsiResultIsNull( Throwable t ) {
        return piDsiResultIsNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL piDsiResultIsNull(  ) {
        return piDsiResultIsNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int PI_DII_RESULT_IS_NULL = SUNVMCID.value + 815 ;
    
    public INTERNAL piDiiResultIsNull( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( PI_DII_RESULT_IS_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.piDiiResultIsNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL piDiiResultIsNull( CompletionStatus cs ) {
        return piDiiResultIsNull( cs, null  ) ;
    }
    
    public INTERNAL piDiiResultIsNull( Throwable t ) {
        return piDiiResultIsNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL piDiiResultIsNull(  ) {
        return piDiiResultIsNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int EXCEPTION_UNAVAILABLE = SUNVMCID.value + 816 ;
    
    public INTERNAL exceptionUnavailable( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( EXCEPTION_UNAVAILABLE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.exceptionUnavailable",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL exceptionUnavailable( CompletionStatus cs ) {
        return exceptionUnavailable( cs, null  ) ;
    }
    
    public INTERNAL exceptionUnavailable( Throwable t ) {
        return exceptionUnavailable( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL exceptionUnavailable(  ) {
        return exceptionUnavailable( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int CLIENT_INFO_STACK_NULL = SUNVMCID.value + 817 ;
    
    public INTERNAL clientInfoStackNull( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( CLIENT_INFO_STACK_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.clientInfoStackNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL clientInfoStackNull( CompletionStatus cs ) {
        return clientInfoStackNull( cs, null  ) ;
    }
    
    public INTERNAL clientInfoStackNull( Throwable t ) {
        return clientInfoStackNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL clientInfoStackNull(  ) {
        return clientInfoStackNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int SERVER_INFO_STACK_NULL = SUNVMCID.value + 818 ;
    
    public INTERNAL serverInfoStackNull( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( SERVER_INFO_STACK_NULL, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.serverInfoStackNull",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL serverInfoStackNull( CompletionStatus cs ) {
        return serverInfoStackNull( cs, null  ) ;
    }
    
    public INTERNAL serverInfoStackNull( Throwable t ) {
        return serverInfoStackNull( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL serverInfoStackNull(  ) {
        return serverInfoStackNull( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int MARK_AND_RESET_FAILED = SUNVMCID.value + 819 ;
    
    public INTERNAL markAndResetFailed( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( MARK_AND_RESET_FAILED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.markAndResetFailed",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL markAndResetFailed( CompletionStatus cs ) {
        return markAndResetFailed( cs, null  ) ;
    }
    
    public INTERNAL markAndResetFailed( Throwable t ) {
        return markAndResetFailed( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL markAndResetFailed(  ) {
        return markAndResetFailed( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int SLOT_TABLE_INVARIANT = SUNVMCID.value + 820 ;
    
    public INTERNAL slotTableInvariant( CompletionStatus cs, Throwable t, Object arg0, Object arg1) {
        INTERNAL exc = new INTERNAL( SLOT_TABLE_INVARIANT, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = new Object[2] ;
            parameters[0] = arg0 ;
            parameters[1] = arg1 ;
            doLog( Level.WARNING, "INTERCEPTORS.slotTableInvariant",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL slotTableInvariant( CompletionStatus cs, Object arg0, Object arg1) {
        return slotTableInvariant( cs, null, arg0, arg1 ) ;
    }
    
    public INTERNAL slotTableInvariant( Throwable t, Object arg0, Object arg1) {
        return slotTableInvariant( CompletionStatus.COMPLETED_NO, t, arg0, arg1 ) ;
    }
    
    public INTERNAL slotTableInvariant(  Object arg0, Object arg1) {
        return slotTableInvariant( CompletionStatus.COMPLETED_NO, null, arg0, arg1 ) ;
    }
    
    public static final int INTERCEPTOR_LIST_LOCKED = SUNVMCID.value + 821 ;
    
    public INTERNAL interceptorListLocked( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( INTERCEPTOR_LIST_LOCKED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.interceptorListLocked",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL interceptorListLocked( CompletionStatus cs ) {
        return interceptorListLocked( cs, null  ) ;
    }
    
    public INTERNAL interceptorListLocked( Throwable t ) {
        return interceptorListLocked( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL interceptorListLocked(  ) {
        return interceptorListLocked( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    public static final int SORT_SIZE_MISMATCH = SUNVMCID.value + 822 ;
    
    public INTERNAL sortSizeMismatch( CompletionStatus cs, Throwable t ) {
        INTERNAL exc = new INTERNAL( SORT_SIZE_MISMATCH, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.sortSizeMismatch",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public INTERNAL sortSizeMismatch( CompletionStatus cs ) {
        return sortSizeMismatch( cs, null  ) ;
    }
    
    public INTERNAL sortSizeMismatch( Throwable t ) {
        return sortSizeMismatch( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public INTERNAL sortSizeMismatch(  ) {
        return sortSizeMismatch( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // NO_IMPLEMENT
    ///////////////////////////////////////////////////////////
    
    public static final int PI_ORB_NOT_POLICY_BASED = SUNVMCID.value + 801 ;
    
    public NO_IMPLEMENT piOrbNotPolicyBased( CompletionStatus cs, Throwable t ) {
        NO_IMPLEMENT exc = new NO_IMPLEMENT( PI_ORB_NOT_POLICY_BASED, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.WARNING )) {
            Object[] parameters = null ;
            doLog( Level.WARNING, "INTERCEPTORS.piOrbNotPolicyBased",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public NO_IMPLEMENT piOrbNotPolicyBased( CompletionStatus cs ) {
        return piOrbNotPolicyBased( cs, null  ) ;
    }
    
    public NO_IMPLEMENT piOrbNotPolicyBased( Throwable t ) {
        return piOrbNotPolicyBased( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public NO_IMPLEMENT piOrbNotPolicyBased(  ) {
        return piOrbNotPolicyBased( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // OBJECT_NOT_EXIST
    ///////////////////////////////////////////////////////////
    
    public static final int ORBINITINFO_INVALID = SUNVMCID.value + 801 ;
    
    public OBJECT_NOT_EXIST orbinitinfoInvalid( CompletionStatus cs, Throwable t ) {
        OBJECT_NOT_EXIST exc = new OBJECT_NOT_EXIST( ORBINITINFO_INVALID, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "INTERCEPTORS.orbinitinfoInvalid",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public OBJECT_NOT_EXIST orbinitinfoInvalid( CompletionStatus cs ) {
        return orbinitinfoInvalid( cs, null  ) ;
    }
    
    public OBJECT_NOT_EXIST orbinitinfoInvalid( Throwable t ) {
        return orbinitinfoInvalid( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public OBJECT_NOT_EXIST orbinitinfoInvalid(  ) {
        return orbinitinfoInvalid( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    ///////////////////////////////////////////////////////////
    // UNKNOWN
    ///////////////////////////////////////////////////////////
    
    public static final int UNKNOWN_REQUEST_INVOKE = SUNVMCID.value + 801 ;
    
    public UNKNOWN unknownRequestInvoke( CompletionStatus cs, Throwable t ) {
        UNKNOWN exc = new UNKNOWN( UNKNOWN_REQUEST_INVOKE, cs ) ;
        if (t != null)
            exc.initCause( t ) ;
        
        if (logger.isLoggable( Level.FINE )) {
            Object[] parameters = null ;
            doLog( Level.FINE, "INTERCEPTORS.unknownRequestInvoke",
                parameters, InterceptorsSystemException.class, exc ) ;
        }
        
        return exc ;
    }
    
    public UNKNOWN unknownRequestInvoke( CompletionStatus cs ) {
        return unknownRequestInvoke( cs, null  ) ;
    }
    
    public UNKNOWN unknownRequestInvoke( Throwable t ) {
        return unknownRequestInvoke( CompletionStatus.COMPLETED_NO, t  ) ;
    }
    
    public UNKNOWN unknownRequestInvoke(  ) {
        return unknownRequestInvoke( CompletionStatus.COMPLETED_NO, null  ) ;
    }
    
    
}
