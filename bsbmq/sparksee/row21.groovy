 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/bsbm.graphml("/tmp/570396164");
s.loadGraphML("/home/yashwant/edb/data/bsbm.graphml");
q = System.currentTimeMillis();
tt =  s.V().has("type", "product").filter{it.productID==343 || it.productID == 350}.map()
println (System.currentTimeMillis() - q)
