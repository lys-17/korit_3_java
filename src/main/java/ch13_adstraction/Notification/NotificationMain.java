package ch13_adstraction.Notification;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification =
                new EmailNotification("admin@test.com",
                        "user@example.com", "가입 축하", 1);
        emailNotification.setPriority(8);
        System.out.println(emailNotification.getPriority());
        emailNotification.printNotificationInfo();
        emailNotification.validateRecipient();      //주석
        emailNotification.send();
        emailNotification.updateMessage("가입 승인");

    }
}
