package com.airkisser.netty.codec.decoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.msgpack.MessagePack;

import java.util.List;

/**
 * MsgPackDecoder解码器
 * Created by AIR on 2016/8/3.
 */
public class MsgPackDecoder extends MessageToMessageDecoder<ByteBuf> {
    /*
        MsgPackDecoder首先从数据报byteBuf中获取需要解码的byte数组，
        然后MessagePack调用read方法将其反序列化为Object对象，
        将解码后的对象加入到解码列表list中
     */
    protected void decode(ChannelHandlerContext cxt, ByteBuf byteBuf, List<Object> list) throws Exception {
        final byte[] array;
        final int length = byteBuf.readableBytes();
        array = new byte[length];
        byteBuf.getBytes(byteBuf.readerIndex(), array, 0, length);
        MessagePack messagePack = new MessagePack();
        list.add(messagePack.read(array));
    }
}
