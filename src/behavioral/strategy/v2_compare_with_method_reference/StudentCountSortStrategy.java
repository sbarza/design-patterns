package behavioral.strategy.v2_compare_with_method_reference;

import java.util.Comparator;
import java.util.List;

/**
 * Role: Concrete Strategy.
 *
 * Implements sorting algorithm for courses by student count.
 * Sorts courses by number of enrolled students in ascending or descending order.
 */
public class StudentCountSortStrategy implements SortStrategy {

    private final SortDirection direction;

    public StudentCountSortStrategy() {
        this(SortDirection.ASCENDING);
    }

    public StudentCountSortStrategy(SortDirection direction) {

        if (direction == null) {
            throw new IllegalArgumentException("Sort must be non-null");
        }

        this.direction = direction;
    }

    @Override
    public void sort(List<Course> courses) {
        Comparator<Course> comparator = Comparator.comparingInt(Course::getStudentCount);

        if (direction == SortDirection.DESCENDING) {
            comparator = comparator.reversed();
        }


        courses.sort(comparator);
    }
}
