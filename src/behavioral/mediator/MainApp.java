package behavioral.mediator;

/**
 * Demonstrates the Mediator Pattern.
 *
 * The SupportCenter (Mediator) coordinates communication between components.
 */
public class MainApp {

    public static void main(String[] args) {
        System.out.println("--- Demo: Support Ticket Routing ---");

        NotificationSender notificationSender = new NotificationSender();
        SupportCenter supportCenter = new SupportCenter(notificationSender);

        supportCenter.registerService(IssueType.BILLING, new BillingService());
        supportCenter.registerService(IssueType.TECHNICAL, new TechnicalService());

        Ticket billingTicket = new Ticket(
                IssueType.BILLING,
                "Refund not processed",
                "Alice"
        );

        Ticket technicalTicket = new Ticket(
                IssueType.TECHNICAL,
                "App is crashing",
                "Bob"
        );

        supportCenter.submitTicket(billingTicket);

        System.out.println();

        supportCenter.submitTicket(technicalTicket);
    }

}
