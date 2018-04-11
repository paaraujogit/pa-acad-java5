package pt.cgd.app;

import java.util.*;
import pt.cgd.indices.Finantial;
import pt.cgd.indices.FinantialOp;
import pt.cgd.indices.Index;
import pt.cgd.indices.IndexDownload;

class StockApp {

    public static void main(String[] ss) throws Exception {
        
//        List<Index> ind = new ArrayList<Index>();

//        Index[] ind = new Index[5];
        List<FinantialOp> ind = new ArrayList<FinantialOp>();
                
        ind.add( new Index("AAPL", 175, 150));
        ind.add( new Index("GOOG", 1095, 1000));
        ind.add(new Finantial(1.2,15,20));
        
        for(FinantialOp fop : ind)
            fop.calculateGains();
        
        ind.stream().forEach(d -> d.calculateGains());

//        double dGain = ind[0].calculateGains();

        IndexDownload indD0 = new IndexDownload("AAPL", IndexDownload.iALPHAVANTAGE);
    }

}
