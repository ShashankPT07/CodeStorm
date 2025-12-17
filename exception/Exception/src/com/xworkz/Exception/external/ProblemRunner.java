package com.xworkz.Exception.external;

import com.xworkz.Exception.internal.Problem;
import org.omg.CORBA.portable.ApplicationException;

import java.rmi.AlreadyBoundException;
import java.rmi.activation.ActivationException;
import java.security.acl.AclNotFoundException;

public class ProblemRunner {
    public static void main(String[] args) throws Exception {

        Problem pro = new Problem();

        pro.aclNotFoundException();
        pro.activationException();
        pro.alreadyBoundException();
        pro.applicationException();
        pro.awtException();
        pro.backingStoreException();
        pro.badAttributeValueExpException();
        pro.badBinaryOpValueExpException();
        pro.badLocationException();
        pro.badStringOperationException();
        pro.brokenBarrierException();
        pro.certificateException();
        pro.cloneNotSupportedException();
        pro.dataFormatException();
        pro.datatypeConfigurationException();
        pro.destroyFailedException();
        pro.executionException();
        pro.expandVetoException();
        pro.fontFormatException();
        pro.generalSecurityException();
        pro.gssException();
        pro.illegalClassFormatException();
        pro.interruptedException();
        pro.introspectionException();
        pro.invalidApplicationException();
        pro.invalidMidiDataException();
        pro.invalidPreferencesFormatException();
        pro.invalidTargetObjectTypeException();
        pro.ioException();
        pro.jaxbException();
        pro.jmException();
        pro.keySelectorException();
        pro.lambdaConversionException();
        pro.lastOwnerException();
        pro.lineUnavailableException();
        pro.marshalException();
        pro.midiUnavailableException();
        pro.mimeTypeParseException();
        pro.namingException();
        pro.noninvertibleTransformException();
        pro.notBoundException();
        pro.notOwnerException();
        pro.parseException();
        pro.parserConfigurationException();
        pro.printerException();
        pro.printException();
        pro.privilegedActionException();
        pro.propertyVetoException();
        pro.reflectiveOperationException();
        pro.refreshFailedException();
        pro.remarshalException();
        pro.runtimeException();
        pro.saxException();
        pro.scriptException();
        pro.serverNotActiveException();
        pro.soapException();
        pro.sqlException();
        pro.timeoutException();
        pro.tooManyListenersException();
        pro.transformerException();
        pro.transformException();
        pro.unmodifiableClassException();
        pro.unsupportedAudioFileException();
        pro.unsupportedCallbackException();
        pro.unsupportedFlavorException();
        pro.unsupportedLookAndFeelException();
        pro.uriReferenceException();
        pro.uriSyntaxException();
        pro.userException();
        pro.xaException();
        pro.xmlParseException();
        pro.xmlSignatureException();
        pro.xmlStreamException();
        pro.xPathException();
    }
}
