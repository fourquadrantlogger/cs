# TCP连接
抓包命令

sudo tcpdump  tcp port 23

```
timeloveboy@timeloveboy-desktop:~$ sudo tcpdump  tcp port 23
tcpdump: verbose output suppressed, use -v or -vv for full protocol decode
listening on enp2s0, link-type EN10MB (Ethernet), capture size 262144 bytes
16:47:16.625915 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [S], seq 2452848391, win 29200, options [mss 1460,sackOK,TS val 680249 ecr 0,nop,wscale 7], length 0
16:47:16.626843 IP 121.51.131.16.telnet > 192.168.3.2.48932: Flags [S.], seq 2991077286, ack 2452848392, win 29200, options [mss 1400,nop,wscale 0], length 0
16:47:16.626863 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [.], ack 1, win 229, length 0
16:47:16.626919 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [P.], seq 1:28, ack 1, win 229, length 27 [telnet DO SUPPRESS GO AHEAD, WILL TERMINAL TYPE, WILL NAWS, WILL TSPEED, WILL LFLOW, WILL LINEMODE, WILL NEW-ENVIRON, DO STATUS, WILL XDISPLOC [|telnet]
...
16:47:43.021204 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [P.], seq 1:28, ack 1, win 229, length 27 [telnet DO SUPPRESS GO AHEAD, WILL TERMINAL TYPE, WILL NAWS, WILL TSPEED, WILL LFLOW, WILL LINEMODE, WILL NEW-ENVIRON, DO STATUS, WILL XDISPLOC [|telnet]
16:47:49.896635 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [F.], seq 28, ack 1, win 229, length 0
16:48:10.669203 IP 192.168.3.2.48932 > 121.51.131.16.telnet: Flags [FP.], seq 1:28, ack 1, win 229, length 27 [telnet DO SUPPRESS GO AHEAD, WILL TERMINAL TYPE, WILL NAWS, WILL TSPEED, WILL LFLOW, WILL LINEMODE, WILL NEW-ENVIRON, DO STATUS, WILL XDISPLOC [|telnet]
```