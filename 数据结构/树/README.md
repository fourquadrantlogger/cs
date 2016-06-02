# 树
>层次结构的数据

## 概念
+ 结点的度 :树中某个结点度子树的个数称为该结点的度。
+ 树的度 :树中某个结点的度的最大值称为树的度。
+ m次树 :通常将度为m的树称为m次树。
+ 树的深度 :树中的最大层次，也称树的高度。
+ 有序树、无序树：树中的结点如果是按照一定顺序从左向右排列，而且次数不能随意变换。
+ 森林：n个互不相交的树的集合，称之为森林 
+ 树的路径长度:从树根到树中每一结点的路径长度之和
>在结点数目相同的二叉树中，完全二叉树的路径长度最短。

+ 结点的带权路径长度：结点到树根之间的路径长度与该结点上权的乘积<img src="http://www.forkosh.com/mathtex.cgi? node.weight*node.L">。 
+ 树的带权路径长度(Weighted Path Length of Tree)：定义为树中所有叶结点的带权路径长度之和<img src="http://www.forkosh.com/mathtex.cgi? \sum( node[i].weight*node[i].L)">

## 特性
+ 只有一个根节点
+ 递归的
+ 每个节点可以有0～n个后继节点

## 性质
+ 树中的结点树等于所有结点的度数＋1
+ 度为m的树中第i层上至多有<img src="http://www.forkosh.com/mathtex.cgi? m^\(i-1">个结点，i>=1
>推导：第1层是最底层，最多1个结点
+ 高度为h的m次树，至多有<img src="http://www.forkosh.com/mathtex.cgi? \frac{m^h -1}{m-1}">个结点
><img src="http://www.forkosh.com/mathtex.cgi?n= \frac{m^h -1}{m-1} =m+m^2+...m^\(h-1">

