package pages;

import tests.BaseTestUtils;

public class HealPage extends BaseTestUtils {
    private final String url = "https://healthunify.com/bmicalculator/";
    private final String logoXpath = "//img [@class=\"custom-logo\"]";
    private final String BMI_CalculatorLogo = "//h1 [@class=\"entry-title\"]";
    private final String weightXpath = "//input[@name=\"wg\"]";
    private final String heightXpathSm = "//input [@class=\"innerc resform\"]";
    private final String selectBoxKilo_Pounds = "//select[@name=\"opt1\"]";
    private final String selectBoxFoot = "//select[@name=\"opt2\"]";
    private final String selectBoxInch = "//select[@name=\"opt3\"]";
    private final String calculateButton = "//input[@name=\"cc\"]";
    private final String SI_Units = "//input[@name=\"si\"]";
    private final String US_Units = "//input[@name=\"us\"]";
    private final String UK_Units = "//input[@name=\"uk\"]";

    public String getSI_Units() {
        return SI_Units;
    }

    public String getUS_Units() {
        return US_Units;
    }

    public String getUK_Units() {
        return UK_Units;
    }

    public String getUrl() {
        return url;
    }

    public String getLogoXpath() {
        return logoXpath;
    }

    public String getCalculateButton() {
        return calculateButton;
    }

    public String getBMI_CalculatorLogo() {
        return BMI_CalculatorLogo;
    }

    public String getWeightXpath() {
        return weightXpath;
    }

    public String getHeightXpathSm() {
        return heightXpathSm;
    }

    public String getSelectBoxKilo_Pounds() {
        return selectBoxKilo_Pounds;
    }

    public String getSelectBoxFoot() {
        return selectBoxFoot;
    }

    public String getSelectBoxInch() {
        return selectBoxInch;
    }
}
