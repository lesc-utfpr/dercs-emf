/***************************************************************************************
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Copyright Contributors to the DERCS-EMF Project.
 * 
 ****************************************************************************************/
package dercs.loader.exception;

public class DercsLoaderException extends Exception {
    public static String ERROR_500 = "Error-500: An unexpected error was found in DERCS loading process.";
    public static String ERROR_501 = "Error-501: Multiple inheritance is not allowed.";
    public static String ERROR_502 = "Error-502: Class not found.";
    public static String ERROR_503 = "Error-503: Invalid data type.";
    public static String ERROR_504 = "Error-504: Invalid visibility.";
    public static String ERROR_505 = "Error-505: Multiplicity not allowed in association.";
    public static String ERROR_506 = "Error-506: Attribute not found.";
    public static String ERROR_507 = "Error-507: Invalid message sequence.";
    public static String ERROR_508 = "Error-508: Invalid lifeline coverage for message.";
    public static String ERROR_509 = "Error-509: Method not found.";
    public static String ERROR_510 = "Error-510: Invalid action sintax.";
    public static String ERROR_511 = "Error-511: Invalid reference to an attribute.";
    public static String ERROR_512 = "Error-512: There is no operation associated with the message.";
    public static String ERROR_513 = "Error-513: Behaviour specified in duplicity.";
    public static String ERROR_514 = "Error-514: Invalid target for the message.";
    public static String ERROR_515 = "Error-515: The execution flow of the sequence diagram is invalid.";
    public static String ERROR_516 = "Error-516: There is no visualization element.";
    public static String ERROR_517 = "Error-517: Combined fragment not supported.";
    public static String ERROR_518 = "Error-518: Number of arguments in message does not match with the number of parameters of the associated method.";
    public static String ERROR_519 = "Error-519: Unexpected argument type.";
    public static String ERROR_520 = "Error-520: Invalid element in aspect specification.";
    public static String ERROR_521 = "Error-521: Invalid pointcut specification.";
    public static String ERROR_522 = "Error-522: Aspect adaptation not found.";
    public static String ERROR_523 = "Error-523: Join point not found.";
    public static String ERROR_524 = "Error-524: Invalid relative postion.";
    public static String ERROR_525 = "Error-525: Invalid node name.";
    public static String ERROR_526 = "Error-526: Object not found.";
    public static String ERROR_527 = "Error-527: Invalid element deployment.";
    public static String ERROR_528 = "Error-528: Node could not be found.";
    public static String ERROR_529 = "Error-529: Invalid child class.";
    public static String ERROR_530 = "Error-530: Unsupported JPDD specification.";
    public static String ERROR_531 = "Error-531: Invalid selection of message within join point specification.";
    public static String ERROR_532 = "Error-532: Aspect not found.";
    public static String ERROR_533 = "Error-533: Local variable already declared.";

    public DercsLoaderException() {
        super(ERROR_500);
    }

    public DercsLoaderException(String msg) {
        super(msg);
    }
}
