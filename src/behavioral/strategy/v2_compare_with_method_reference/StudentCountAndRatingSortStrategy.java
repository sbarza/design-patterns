package behavioral.strategy.v2_compare_with_method_reference;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy.
 *
 * Concrete strategy that sorts courses by student count first,
 * then by rating as a tiebreaker.
 *
 * This implements a composite sorting strategy where:
 * - Primary sort: student count
 * - Secondary sort: rating
 */
public class StudentCountAndRatingSortStrategy implements SortStrategy {

    private final SortDirection direction;

    public StudentCountAndRatingSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    public StudentCountAndRatingSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {

        // Create a comparator that first compares by student count, then rating.
        Comparator<Course> comparator = Comparator.comparing(Course::getStudentCount)
                .thenComparingDouble(Course::getRating);

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }

        courses.sort(comparator);
    }
}
