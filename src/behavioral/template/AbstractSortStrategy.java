package behavioral.template;

import java.util.Comparator;
import java.util.List;

/**
 * Abstract base class for sorting strategies.
 *
 * Provides direction support (ascending/descending) for all subclasses.
 * Subclasses must implement template method, getComparator(), to define their sorting criteria.
 */

public abstract class AbstractSortStrategy implements SortStrategy {

    private final SortDirection direction;

    // Constructors are protected.
    // Protected for subclasses use only. Signals inheritance-only intent.
    // Common pattern in JDK core classes (AbstractList, AbstractMap ...)

    protected AbstractSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    protected AbstractSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort direction must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {
        Comparator<Course> comparator = getComparator();

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }

    // Template method: subclasses provide the specific comparator.
    protected abstract Comparator<Course> getComparator();
}
