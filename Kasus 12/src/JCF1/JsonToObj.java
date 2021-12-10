package JCF1;

import java.io.FileReader;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;

public class JsonToObj {
	
public static void main(String[] args) {
    Gson gson = new Gson();
    try {
        ArrayList<Barang> produk = gson.fromJson(
          new FileReader("D:\\Akademik\\SMT 3\\PBO\\Praktikum\\Praktikum-PBO\\Kasus 12\\src\\JCF1\\barang.json"), 
          new TypeToken<ArrayList<Barang>>() {}.getType()
        );
        for(int i=0;i<produk.size();i++){
            System.out.println("Barang ke- "+(i+1)+": "+produk.get(i).toString());
        }
    } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}
}

    

