 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new TinkerGraph("/tmp/386795546");
s.loadGraphML("/srv/Harsh/Yashwant/edbt18/EDBT-2018-Experiments/data/bsbm.graphml");
q = System.currentTimeMillis();
tt = s.V().has("productID", 343).map()
println (System.currentTimeMillis() - q)
System.exit(0);