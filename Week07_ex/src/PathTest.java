import java.nio.file.*;

public class PathTest {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\sources\\test.txt"); 
		System.out.println("전체경로: "+ path);   
		System.out.println("파일 이름: "+path.getFileName());  
		System.out.println("부모 이름: "+path.getParent().getFileName());    
	}
    
}