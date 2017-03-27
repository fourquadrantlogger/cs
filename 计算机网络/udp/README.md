# UDP

``` UDP
|          ip首部      |               UDP保文                 |
|           |  UDP 首部| UDP数据                    |
| <----- 20byte -----> |  UDP 首部| UDP数据                    |
```
+ udp首部
16位源端口号，16位目的端口号
16位udp长度，16位校验和