# 为什么是3次握手
1、客户端：你能收到我的消息不？
2、服务器：我收到了你的消息。说明我的收是正常的，你的发是正常的；但是不确定我能不能发，你能不能收。
3、客户端：我收到了你的消息，说明我的发、收都是正常的，并且你的收、发也是正常的。
经过3次消息，能确定双方的收、发功能都是正常的，所以得3次握手