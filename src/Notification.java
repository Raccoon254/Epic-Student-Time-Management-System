public class Notification {
    private String notificationType;
    private User recipient;
    private String message;

    public Notification(String notificationType, User recipient, String message) {
        this.notificationType = notificationType;
        this.recipient = recipient;
        this.message = message;
    }

    // Getters and setters for all attributes
    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
