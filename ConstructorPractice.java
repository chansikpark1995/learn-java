package practice;

public class ConstructorPractice {
		String title;
		String writer;
		String content;
		String date;
		int hitcount;
		
	

ConstructorPractice(String title,String content){
	this(title,content,"���� �α����� ȸ�� ���̵�","���� ��ǻ�� ��¥",0);
}

ConstructorPractice(String title,String content, String writer){
	this(title,content,writer,"���� ��ǻ�� ��¥",0);
}

ConstructorPractice(String title,String content, String writer,String date){
	this(title,content,writer,date,0);
}
ConstructorPractice(String title,String content, String writer,String date,int hitcount){
	this.title = title;
	this.content = content;
	this.writer = writer;
	this.date = date;
	this.hitcount = hitcount;
	
}
}

