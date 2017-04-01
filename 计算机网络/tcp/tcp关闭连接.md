
## FIN_WAIT
客户端发FIN后，自己进入FIN——WAIT状态
## CLOSE_WAIT
服务端接受FIN，发送ACK后，自己进入CLOSE——WAIT
再发送FIN后，自己进入LAST——ACK
## TIME_WAIT
客户端收到FIN后，进入TIME——WAIT状态，又称为2 MSL（最大生存时间）