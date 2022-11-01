package pages;

import tests.BaseTestUtils;

public class CalculatorLaminatePage extends BaseTestUtils {
    private final String lengthRoom = "//input[@id=\"ln_room_id\"]";
    private final String widthRoom = "//input[@id=\"wd_room_id\"]";
    private final String lengthLaminatePanel = "//input[@id=\"ln_lam_id\"]";
    private final String widthLaminatePanel = "//input[@id=\"wd_lam_id\"]";
    private final String numberOfPanelsInPackage = "//input[@id=\"n_packing\"]";
    private final String laminatePuttingType = "//select[@id=\"laying_method_laminate\"]";
    private final String minimumLengthCut = "//input[@id=\"min_length_segment_id\"]";
    private final String wallThreshold = "//input[@id=\"indent_walls_id\"]";

    private final String[] arrayCleanFields = new String[]{lengthRoom,widthRoom,lengthLaminatePanel,
                                             widthLaminatePanel,numberOfPanelsInPackage,
                                             minimumLengthCut,wallThreshold};
    private final String directionOfLaminatePuttingLengthOfRoom = "//label[@for=\"direction-laminate-id0\"]";
    private final String directionOfLaminatePuttingWidthOfRoom = "//label[@for=\"direction-laminate-id1\"]";
    private final String directionOfLaminatePutting_45_degree = "//label[@for=\"direction-laminate-id2\"]";
    private final String directionOfLaminatePutting_135_degree = "//label[@for=\"direction-laminate-id3\"]";
    private final String colourOfLaminate_1 = "//div[@id=\"csl0\"]";
    private final String buttonCalculation = "//a[@class=\"calc-btn\"]";
    private final String targetTestSiteURL = "https://calc.by/building-calculators/laminate.html";
    private final String requiredLaminateDesks = "//div [@class=\"calc-result\"]//div [@style][1]/span";
    private final String requiredLaminatePackages = "//div [@class=\"calc-result\"]//div [@style][2]/span";
    private final String areaOfBuild = "//div [@id=\"area_room\"]";

    public String[] getArrayCleanFields() {
        return arrayCleanFields;
    }

    protected void targetTestSiteOpen(){
         driver.get(targetTestSiteURL);
    }
    protected void targetTestSiteClose(){
         driver.quit();
    }

    public String getTargetTestSiteURL() {
        return targetTestSiteURL;
    }

    public String getLengthRoom() {
        return lengthRoom;
    }

    public String getWidthRoom() {
        return widthRoom;
    }

    public String getLengthLaminatePanel() {
        return lengthLaminatePanel;
    }

    public String getWidthLaminatePanel() {
        return widthLaminatePanel;
    }

    public String getNumberOfPanelsInPackage() {
        return numberOfPanelsInPackage;
    }

    public String getLaminatePuttingType() {
        return laminatePuttingType;
    }

    public String getMinimumLengthCut() {
        return minimumLengthCut;
    }

    public String getWallThreshold() {
        return wallThreshold;
    }

    public String getDirectionOfLaminatePuttingLengthOfRoom() {
        return directionOfLaminatePuttingLengthOfRoom;
    }

    public String getDirectionOfLaminatePuttingWidthOfRoom() {
        return directionOfLaminatePuttingWidthOfRoom;
    }

    public String getDirectionOfLaminatePutting_45_degree() {
        return directionOfLaminatePutting_45_degree;
    }

    public String getDirectionOfLaminatePutting_135_degree() {
        return directionOfLaminatePutting_135_degree;
    }

    public String getColourOfLaminate_1() {
        return colourOfLaminate_1;
    }

    public String getButtonCalculation() {
        return buttonCalculation;
    }

    public String getRequiredLaminateDesks() {
        return requiredLaminateDesks;
    }

    public String getRequiredLaminatePackages() {
        return requiredLaminatePackages;
    }

    public String getAreaOfBuild() {
        return areaOfBuild;
    }
}
