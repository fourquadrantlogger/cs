# host


```
host  www.baidu.com
www.baidu.com is an alias for www.a.shifen.com.
www.a.shifen.com has address 119.75.218.70
www.a.shifen.com has address 119.75.217.109

```

```
host -v www.baidu.com
Trying "www.baidu.com"
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 28519
;; flags: qr rd ra; QUERY: 1, ANSWER: 3, AUTHORITY: 5, ADDITIONAL: 5

;; QUESTION SECTION:
;www.baidu.com.                 IN      A

;; ANSWER SECTION:
www.baidu.com.          614     IN      CNAME   www.a.shifen.com.
www.a.shifen.com.       600     IN      A       119.75.218.70
www.a.shifen.com.       600     IN      A       119.75.217.109

;; AUTHORITY SECTION:
a.shifen.com.           207     IN      NS      ns3.a.shifen.com.
a.shifen.com.           207     IN      NS      ns4.a.shifen.com.
a.shifen.com.           207     IN      NS      ns5.a.shifen.com.
a.shifen.com.           207     IN      NS      ns1.a.shifen.com.
a.shifen.com.           207     IN      NS      ns2.a.shifen.com.

;; ADDITIONAL SECTION:
ns1.a.shifen.com.       93      IN      A       61.135.165.224
ns2.a.shifen.com.       105     IN      A       180.149.133.241
ns3.a.shifen.com.       574     IN      A       61.135.162.215
ns4.a.shifen.com.       326     IN      A       115.239.210.176
ns5.a.shifen.com.       27      IN      A       119.75.222.17

Received 260 bytes from 127.0.1.1#53 in 6 ms
Trying "www.a.shifen.com"
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 33824
;; flags: qr rd ra; QUERY: 1, ANSWER: 0, AUTHORITY: 1, ADDITIONAL: 0

;; QUESTION SECTION:
;www.a.shifen.com.              IN      AAAA

;; AUTHORITY SECTION:
a.shifen.com.           313     IN      SOA     ns1.a.shifen.com. baidu_dns_master.baidu.com. 1703280007 5 5 86400 3600

Received 97 bytes from 127.0.1.1#53 in 4 ms
Trying "www.a.shifen.com"
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 51592
;; flags: qr rd ra; QUERY: 1, ANSWER: 0, AUTHORITY: 1, ADDITIONAL: 0

;; QUESTION SECTION:
;www.a.shifen.com.              IN      MX

;; AUTHORITY SECTION:
a.shifen.com.           600     IN      SOA     ns1.a.shifen.com. baidu_dns_master.baidu.com. 1703280007 5 5 86400 3600

Received 97 bytes from 127.0.1.1#53 in 9 ms

```