/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdp;

import java.util.*;


public class Auctioneer {
    private String name;
    private List<Bidder> biders;
    private Bidder highestBidder;
    
    public Auctioneer(String name,int startingBid){
        this.name=name;
        this.biders=new ArrayList<Bidder>();
        
        // Add foo highest bidder initially        
        this.highestBidder=new Bidder("foo");
        this.highestBidder.setInitialBid(startingBid);
        
        System.out.println(name+" started an auction with staring bid="+startingBid);
    }
    
    public void addBidder(Bidder b){
        b.setHighestBidder(highestBidder);
        this.biders.add(b);
    }
    
    public void newBid(Bidder b){
        if(b.getBid()<=highestBidder.getBid() || b.equals(highestBidder)){
            System.out.println("Bid for "+b.getBid()+" not accepted from "+b.getName());
        }else{
            System.out.println("Bid from "+b.getName()+" for "+b.getBid()+" accepted");
            highestBidder = b;
            notifyBidders();
        }
    }
    
    public int getHighestBid(){
        return highestBidder.getBid();
    }
    
    public void notifyBidders(){
        for(Bidder b:biders){
            b.setHighestBidder(highestBidder);
        }
    }
}
