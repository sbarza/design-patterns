package behavioral.chain_of_responsibility;

public class TrimFilter implements Filter {

    // Reference to the next filter
    private Filter nextFilter;

    @Override
    public void setNext(Filter filter) {
        this.nextFilter = filter;
    }

    @Override
    public void apply(Request request) {
        System.out.println("TrimFilter: trimming payload " + request.getPayload());

        String payload = request.getPayload();
        String trimmedPayload = payload.trim();
        request.setPayload(trimmedPayload);

        System.out.println("TrimFilter: AFTER trimming payload " + request.getPayload());

        request.setAttribute("trimmed", true);

        // Continue to the next filter if available
        if (nextFilter != null) {
            nextFilter.apply(request);
        }
    }
}
