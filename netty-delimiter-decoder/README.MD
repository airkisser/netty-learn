# Netty的基本使用
## 使用Netty实现客户端向服务端请求和响应的案例
其中使用DelimiterBasedFrameDecoder(分隔符解码器)和StringDecoder处理粘包
案例中使用"$_"作为分隔符