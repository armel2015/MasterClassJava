package Streams.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType == null)
            return null;
        if ("DOMESTICPLAN".equalsIgnoreCase(planType)){
            return new DomesticPlan();
        }else if("COMMERCIALPLAN".equalsIgnoreCase(planType)){
            return new CommercialPlan();
        }else if("INSTITUTIONALPLAN".equalsIgnoreCase(planType)){
            return new InstitutionalPlan();
        }

        return null;
    }
}
