package fr.lecomptoirdespharmacies.core.exceptions;

import java.io.IOException;

/**
 * Thrown when Vidal could not be reached: the connect or read timeout expired, the connection was
 * reset, the host is unknown, or the answer could not be read to the end.
 * <p>
 * This is the one failure callers usually want to tell apart, because it says nothing about the
 * request they made — retrying later may well succeed. Every other failure (a request this SDK
 * refuses to send, an unreadable answer) keeps coming out as a plain exception. Only this SDK can
 * make that distinction, since it is the one holding the {@link IOException}.
 * <p>
 * Unchecked so that callers wanting to let it through — typically to fail a wider operation — have
 * nothing to write, while {@link #getCause()} still carries the original {@link IOException} for
 * those classifying failures on it.
 */
public class VidalUnreachableException extends RuntimeException {

    public VidalUnreachableException(String message, IOException cause) {
        super(message, cause);
    }
}
