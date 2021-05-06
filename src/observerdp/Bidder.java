/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdp;

public class Bidder {
    private String name;
    private int lastBid;
    private Bidder highestBidder;
    
    public Bidder(String name){
        this.name=name;
        this.lastBid=0;
    }

    public String getName() {
        return name;
    }

    public void setInitialBid(int bid){
        this.lastBid=bid;
    }
    
    public int getBid() {
        return lastBid;
    }
    
    public void setHighestBidder(Bidder b){
        System.out.println("Bidder "+name+" received new highest bidder is "+b.getName()+" for "+b.getBid());
        this.highestBidder=b;
    }
    
    public void prepareNewBid(){
        lastBid = highestBidder.getBid()+1;
    }
}
