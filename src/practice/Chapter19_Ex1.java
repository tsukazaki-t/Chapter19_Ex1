package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chapter19_Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		try (FileReader fileReader = new FileReader("C:\\eclipse\\pleiades\\workspace\\input.csv")) {
			int c;//
			while ((c = fileReader.read()) != -1) {//バイナリ値を1文字取り出す
				System.out.println(Integer.toString(c));
			} //★取り出したバイナリ値を16進数に変換する					
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}

}
