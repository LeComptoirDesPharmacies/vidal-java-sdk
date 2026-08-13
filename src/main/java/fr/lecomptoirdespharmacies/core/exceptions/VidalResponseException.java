package fr.lecomptoirdespharmacies.core.exceptions;

/**
 * Thrown when Vidal answered but its answer could not be turned into entities: malformed or
 * truncated XML, a parser that cannot be set up.
 * <p>
 * Distinct from {@link VidalUnreachableException}, which says the answer never came. Both are
 * failures, and neither is an empty result: an answer we cannot read tells us nothing about whether
 * Vidal knows the package.
 * <p>
 * Unchecked, like every failure this SDK raises, so that callers only handle what they care about.
 */
public class VidalResponseException extends RuntimeException {

    public VidalResponseException(String message, Throwable cause) {
        super(message, cause);
    }
}
