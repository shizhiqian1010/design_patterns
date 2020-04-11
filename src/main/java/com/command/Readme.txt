命令模式：
	以 风扇遥控器为例

	关注点：
		即 将请求封装成对象，Eg:RemoteControlWithUndo 类

		将请求对象与执行请求的对象解耦，Eg:RemoteControlWithUndo 依赖 Command 接口，而不是依赖具体的执行请求对象