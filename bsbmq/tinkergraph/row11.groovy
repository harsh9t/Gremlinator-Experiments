 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/44754881");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("type", "reviewer").has("reviewerID", 86).outE().inV().has("Rating_1").outE().inV().map("productID")
println (System.currentTimeMillis() - q)
System.exit(0);