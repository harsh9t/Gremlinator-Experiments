 import com.tinkerpop.blueprints.impls.sparksee.*;
s = new /home/yashwant/edb/data/northwind.graphml("/tmp/898341404");
s.loadGraphML("/home/yashwant/edb/data/northwind.graphml");
q = System.currentTimeMillis();
tt = s.V().has("labelV", "product").order{it.a.unitPrice <=> it.b.unitPrice}[5..9].map("productName", "unitPrice")
println (System.currentTimeMillis() - q)
