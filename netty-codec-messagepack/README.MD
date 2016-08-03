# MessagePack编码器和解码器开发
## 使用MessagePack编解码的案例
Netty编解码框架集成MessagePack实现编码器和解码器开发，其中使用了LengthFieldBasedFrameDecoder和LengthFieldPrepender来处理粘包。

待编码类的处理：
    方式一：在类上加@Message注解；
    方式二：编码器继承MessageToByteEncoder时需要指定为如下格式；
        class MsgPackEncoder extends MessageToByteEncoder<UserInfo>
        而不可以是
        class MsgPackEncoder extends MessageToByteEncoder<Object>，
        否则会报编码异常错误。