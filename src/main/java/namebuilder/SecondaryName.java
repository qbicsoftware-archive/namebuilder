package namebuilder;

/**
 * Created by sven1103 on 9/09/16.
 */
public abstract class SecondaryName {

    /**
     * All the field variables for the secondary name
     */
    private String entityID;
    private Integer entityCounter;
    private String[] timepoints;
    private String tissue;
    private Integer sampleAliquot;
    private String extractType;
    private Integer extractAliquot;
    private int currentTimePointIndex;
    private int currentSampleAliquot;
    private int currentExtractAliquot;

    /**
     * Default constructor
      */
    public SecondaryName(){}

    public void nextTimePoint(){
        if (currentTimePointIndex >= timepoints.length-1){
            currentTimePointIndex = 0;
        } else{
            currentTimePointIndex++;
        }
    }

    public String getCurrentTimePoint(){
        if (timepoints == null){
            return "";
        }
        return this.timepoints[currentTimePointIndex];
    }

    public void nextSampleAliquot(){
        currentSampleAliquot++;
    }


    public void nextExtractAliquot(){
        currentExtractAliquot++;
    }

    public String getEntityID() {
        if (entityID == null){
            return "";
        }
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public int getEntityCounter() {
        if (entityCounter == null){
            return -100;
        }
        return entityCounter;
    }

    public void setEntityCounter(int entityCounter) {
        this.entityCounter = entityCounter;
    }

    public String[] getTimepoint() {
        return timepoints;
    }

    public void setTimepoints(String[] timepoint) {
        this.timepoints = timepoint;
        this.currentTimePointIndex = 0;
    }

    public String getTissue() {
        return tissue;
    }

    public void setTissue(String tissue) {
        this.tissue = tissue;
    }

    public int getSampleAliquot() {
        return sampleAliquot;
    }

    public void setSampleAliquot(int sampleAliquot) {
        this.sampleAliquot = sampleAliquot;
        this.currentSampleAliquot = sampleAliquot;
    }

    public String getExtractType() {
        return extractType;
    }

    public void setExtractType(String extractType) {
        this.extractType = extractType;
    }

    public int getExtractAliquot() {
        return extractAliquot;
    }

    public void setExtractAliquot(int extractAliquot) {
        this.extractAliquot = extractAliquot;
        this.currentExtractAliquot = extractAliquot;
    }

    //TODO implement toString() function
    @Override
    public String toString(){
        StringBuilder sampleName = new StringBuilder();

        return sampleName.toString();
    }
}
