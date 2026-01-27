class Construction {
    public int projectId;
    public String projectName;
    public long estimatedDurationDays;
    public float siteArea;
    public double totalBudget;
    public char projectType; 
    public boolean isApproved;

    public Construction(int projectId, String projectName, long estimatedDurationDays, float siteArea,
                        double totalBudget, char projectType, boolean isApproved) {

   
        System.out.println("first try=" + this.projectId);
        System.out.println("first try=" + this.projectName);
        System.out.println("first try=" + this.estimatedDurationDays);
        System.out.println("first try=" + this.siteArea);
        System.out.println("first try=" + this.totalBudget);
        System.out.println("first try=" + this.projectType);
        System.out.println("first try=" + this.isApproved);

  
        this.projectId = projectId;
        this.projectName = projectName;
        this.estimatedDurationDays = estimatedDurationDays;
        this.siteArea = siteArea;
        this.totalBudget = totalBudget;
        this.projectType = projectType;
        this.isApproved = isApproved;

      
        System.out.println("second try=" + this.projectId);
        System.out.println("second try=" + this.projectName);
        System.out.println("second try=" + this.estimatedDurationDays);
        System.out.println("second try=" + this.siteArea);
        System.out.println("second try=" + this.totalBudget);
        System.out.println("second try=" + this.projectType);
        System.out.println("second try=" + this.isApproved);
    }
}
