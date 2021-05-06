/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdp;

public class ObserverDP {

    
    public static void main(String[] args) {
        Auctioneer auction = new Auctioneer("EBay",100);
        
        Bidder b1=new Bidder("Hlias");
        Bidder b2=new Bidder("Pantelis");
        Bidder b3=new Bidder("Panagiotis");
        
        auction.addBidder(b1);
        auction.addBidder(b2);
        auction.addBidder(b3);
        
        b1.prepareNewBid();
        auction.newBid(b1);
        
        b2.prepareNewBid();
        auction.newBid(b2);
        
        b3.setInitialBid(100);
        auction.newBid(b3);
        
        b2.prepareNewBid();
        auction.newBid(b2);
    }
    
}
