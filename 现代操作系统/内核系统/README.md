# 内核

## posix系统调用

系统调用，可能会阻塞调用者

1.进程管理
+ fork
+ waitpid
+ exit


2.文件管理
+ open(file,mode)
+ close(f)
+ n=read(fd,buffer,n)
+ n=write(fd,buffer,n)
+ position=lseek(fd,offset,whence)

3.目录
+ mkdir
+ rmdir
+ link
+ unlink
+ mount
+ umount

4.杂项
chdir
chmod
kill(pid,signal)
time