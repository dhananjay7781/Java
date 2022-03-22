import java.io.*;
class checkeddemo {
	public static void main(String [] args ) throws IOException {
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println(br.readLine());
		br.close();
		try {
		System.out.println(br.readLine());
		}
		catch (IOException e) {
			System.out.println("buffer pipe already closed");
		}
	}


}


//ekach code mdhe throw pn kelay n try catch pn kelay 
//mhnje second valya pipe la error nko deu tyadhi maza khalcha code run kr
