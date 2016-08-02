# Netty的基本使用
## 使用Netty实现服务端的案例
其中使用FixedLengthFrameDecoder(固定长度字符解码器)和StringDecoder处理粘包
案例中字符固定长度为20
需要配合telnet完成测试
cmd>telnet localhost 8080
之后按住"CTRL+]"设置字符回显
telnet>set localecho ，按enter以后回到telnet界面，输入一定长度字符串后，服务端每接收到20字节就会进行解码
或者可通过telnet>sen <字符串> 实现向服务端发送数据