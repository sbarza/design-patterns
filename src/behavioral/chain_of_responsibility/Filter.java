package behavioral.chain_of_responsibility;

/**
 * Defines the contract for all filters in the chain.
 *
 * Each filter performs a task and optionally delegates
 * to the next filter in the filter chain.
 */
public interface Filter {

    void setNext(Filter filter);

    void apply(Request request);

}
