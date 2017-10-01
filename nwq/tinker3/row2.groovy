
x = TinkerGraph.open();
x.io(gryo()).readGraph("/home/yashwant/edb/data/northwind.kryo");
g = x.traversal();
q = System.currentTimeMillis();
tt = g.V().match( __.as('a').values('name').as('b'), __.as('a').values('description').as('c')).select('b','c').dedup()

println (System.currentTimeMillis() - q)
