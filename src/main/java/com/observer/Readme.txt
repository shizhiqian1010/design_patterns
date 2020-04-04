观察者模式：
	分为：主题  观察者 两部分
		当 主题数据更新时，通知观察者

	主题：
		interface Subject 注册、删除、通知主题

	观察者
		interface Observer 更新数据

	jdk中，观察者模式的主题类为 java.util.Observable,观察者接口为 java.util.Observer