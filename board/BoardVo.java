package board;

public class BoardVo {
  private  int  idx;
  private  String  title;
  private  String  name;
  
public int getIdx() {
	return idx;
}
public void setIdx(int idx) {
	this.idx = idx;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "BoardVo [idx=" + idx + ", title=" + title + ", name=" + name + "]";
}
  
  
}
