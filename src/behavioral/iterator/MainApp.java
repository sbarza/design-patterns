package behavioral.iterator;

/**
 * Role: Client.
 *
 * Demonstrates the Iterator design pattern in action.
 * Uses the Iterator to traverse a CourseCatalog without
 * exposing the collection's internal structure.
 */
public class MainApp {

    public static void main(String[] args) {

        // Create a collection and add courses
        CourseCatalog courseCatalog = new CourseCatalog();

        courseCatalog.addCourse(new Course("Master Java Design Patterns"));
        courseCatalog.addCourse(new Course("Spring Boot for Beginners"));
        courseCatalog.addCourse(new Course("Modern Spring Boot REST APIs"));

        // Get a handle to the iterator
        // PatternIterator<Course> courseIterator = courseCatalog.iterator();
        PatternIterator<Course> courseIterator = courseCatalog.reverseIterator();

        // Use the iterator to loop through the courses, print courses name
        while (courseIterator.hasNext()) {
            Course tempCourse = courseIterator.next();
            System.out.println("Course name: " + tempCourse.getName());
        }
    }
}
