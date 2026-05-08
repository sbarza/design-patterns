package behavioral.chain_of_responsibility;

/**
 * Concrete filter that logs the request.
 *
 * Delegates to the next filter
 */
public class LogFilter implements Filter {

    // Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        this.nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("LogFilter: logging request " + request.getPayload());

        request.setAttribute("logged", true);

        // Continue to the next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }
}
