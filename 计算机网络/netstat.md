# 内核ip 路由表

```
netstat -rn
内核 IP 路由表
Destination     Gateway         Genmask         Flags   MSS Window  irtt Iface
0.0.0.0         192.168.3.1     0.0.0.0         UG        0 0          0 enp2s0
169.254.0.0     0.0.0.0         255.255.0.0     U         0 0          0 docker0
172.17.0.0      0.0.0.0         255.255.0.0     U         0 0          0 docker0
192.168.3.0     0.0.0.0         255.255.255.0   U         0 0          0 enp2s0

```