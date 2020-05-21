interface Discountable {
    //In interfaces, methods are by default public and abstract so those keywords arent needed
    float getMaxinumDiscountPct();
    
    float getPersonDiscount();
    
    float getCorporateDiscount();
}