装饰者模式：
	以 制作咖啡 为例，咖啡类型为被装饰者，咖啡中的诸多添加项如：糖、牛奶 等为装饰者

	被装饰者：abstract Coffee

	装饰者：abstract Condiment

JDK源码中的装饰者模式：【IO模块】
	父接口：
		java.io.InputStream
		java.io.OutputStream

		java.io.Reader
		java.io.Writer

	被装饰者：
		java.io.ByteArrayInputStream
		java.io.FileInputStream
		java.io.ObjectInputStream

		java.io.ByteArrayOutputStream
		java.io.FileOutputStream
		java.io.ObjectOutputStream

		java.io.CharArrayReader
		java.io.StringReader
		java.io.BufferedReader
		java.io.InputStreamReader

		java.io.CharArrayWriter
		java.io.StringWriter
		java.io.BufferedWriter
		java.io.OutputStreamWriter
	装饰者：
		java.io.FilterInputStream
		java.io.FilterOutputStream

		java.io.FilterReader
		java.io.FilterWriter