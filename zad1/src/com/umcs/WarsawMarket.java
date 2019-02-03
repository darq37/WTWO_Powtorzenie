package com.umcs;

public class WarsawMarket {
    private NewYorkMarket newYorkMarket;
    private SingapurMarket singapurMarket;
    private LondonMarket londonMarket;
    private String code;
    private Integer days;
    int ryzyko;

    public WarsawMarket(int ryzyko) {
        this.ryzyko = ryzyko;
    }

    public int okreslRyzyko(String code, Integer days){
        int london = londonMarket.getRisk(code, days);
        int singapur = singapurMarket.getCompanyRisk(code, (int) Math.ceil(days/30.0));
        int newyork = newYorkMarket.companyTrusWorthy(code, days);
        this.ryzyko = (london+singapur+newyork)/3;


        return ryzyko;

    }



}
