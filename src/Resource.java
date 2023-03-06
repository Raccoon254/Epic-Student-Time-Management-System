public class Resource {
    private String resourceType;
    private String filePath;
    private String description;

    public Resource(String resourceType, String filePath, String description) {
        this.resourceType = resourceType;
        this.filePath = filePath;
        this.description = description;
    }

    // Getters and setters for all attributes
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
