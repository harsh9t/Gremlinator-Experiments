 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/632503924");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("categoryName", "Beverages").inE().outV().groupCount{it.unitsInStock}.cap
println (System.currentTimeMillis() - q)
