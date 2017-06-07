package matthewboyle.crowdcubeandroidconcept.domain;

import android.graphics.Bitmap;

/**
 * Created by matthewboyle on 07/06/2017.
 */

public class Bid{
    private String company,copy;
    private long daysLeft,raised,investors,target;
    private int backgroundImage,companyLogo;
    private double equity;


    public Bid(String company, String copy, long daysLeft, long raised, long investors, long target, int backgroundImage, int companyLogo, double equity) {
        this.company = company;
        this.copy = copy;
        this.daysLeft = daysLeft;
        this.raised = raised;
        this.investors = investors;
        this.target = target;
        this.backgroundImage = backgroundImage;
        this.companyLogo = companyLogo;
        this.equity = equity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public long getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(long daysLeft) {
        this.daysLeft = daysLeft;
    }

    public long getRaised() {
        return raised;
    }

    public void setRaised(long raised) {
        this.raised = raised;
    }

    public long getInvestors() {
        return investors;
    }

    public void setInvestors(long investors) {
        this.investors = investors;
    }

    public long getTarget() {
        return target;
    }

    public void setTarget(long target) {
        this.target = target;
    }

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {
        this.companyLogo = companyLogo;
    }

    public double getEquity() {
        return equity;
    }

    public void setEquity(double equity) {
        this.equity = equity;
    }
}