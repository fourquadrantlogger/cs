
 ### sudo iptables --list -n

 ```
 Chain INPUT (policy ACCEPT)
 target     prot opt source               destination

 Chain FORWARD (policy DROP)
 target     prot opt source               destination
 DOCKER-ISOLATION  all  --  0.0.0.0/0            0.0.0.0/0
 DOCKER     all  --  0.0.0.0/0            0.0.0.0/0
 ACCEPT     all  --  0.0.0.0/0            0.0.0.0/0            ctstate RELATED,ESTABLISHED
 ACCEPT     all  --  0.0.0.0/0            0.0.0.0/0
 ACCEPT     all  --  0.0.0.0/0            0.0.0.0/0

 Chain OUTPUT (policy ACCEPT)
 target     prot opt source               destination

 Chain DOCKER (1 references)
 target     prot opt source               destination

 Chain DOCKER-ISOLATION (1 references)
 target     prot opt source               destination
 RETURN     all  --  0.0.0.0/0            0.0.0.0/0
 ```