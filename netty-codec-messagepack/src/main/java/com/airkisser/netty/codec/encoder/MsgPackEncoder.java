package com.airkisser.netty.codec.encoder;

import com.airkisser.netty.entity.UserInfo;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.msgpack.MessagePack;

/**
 * MsgPackEncoder编码器
 * 负责将Object类型的POJO对象编码为byte数组，写入到ByteBuf中
 * 此处需要注意: 继承MessageToByteEncoder时，需做以下处理
 * 处理方式一：使用<UserInfo>而不是<Object>
 * 处理方式二：此处使用<Object>但是UserInfo类上面需要注解@Message
 * Created by AIR on 2016/8/3.
 */
public class MsgPackEncoder extends MessageToByteEncoder<UserInfo> {

    protected void encode(ChannelHandlerContext channelHandlerContext, UserInfo obj, ByteBuf byteBuf) throws Exception {
        MessagePack msgPack = new MessagePack();
        byte[] raw = msgPack.write(obj);
        byteBuf.writeBytes(raw);
    }

}
