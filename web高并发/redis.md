# redis

Redis使用的是单进程，在配置时，一个实例只会用到一个CPU

##　redis数据操作　时间复杂度

![时间复杂度](img/timecomplex.gif)

## key操作是涉及范围最广的操作

+ 列出 keys
```
keys  *user*
keys  *
```
*: 通配任意多个字符
?: 通配单个字符
[]: 通配括号内的某1个字符
注：生产已经禁止。更安全的做法是采用scan

+ exists key
返回1表示存在，0不存在

+ del key1 key2 ....keyN

+ type key
  返回 none 表示不存在key。string字符类型，list 链表类型 set 无序集合类型

+ type randomkey

+ rename oldkey newkey

## 字符串操作

+ set key value [ex 秒数] / [px 毫秒数]  [nx] /[xx]

返回1表示成功，0失败
注: 如果ex,px同时写,以后面的有效期为准

+ setnx key value

仅当key不存在时才Set，如果key已经存在，返回0 。nx 是not exist的意思。

+ mset key1 value1 ... keyN valueN
一次设置多个key的值，成功返回1表示所有的值都设置了

+ get key
如果key不存在返回nil

+ mget key1 key2 ... keyN
一次获取多个key的值

 * 增减操作

 * * incr key

     这个操作的应用场景：计数器

    * decr key

     减法操作