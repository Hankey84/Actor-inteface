public class Human extends Actor{
    
    public Human (String name){
        this.name = name;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;       
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        
    }

    @Override
    public boolean isMakeOrder() {

        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {

        return isTakeOrder;
    }

}
