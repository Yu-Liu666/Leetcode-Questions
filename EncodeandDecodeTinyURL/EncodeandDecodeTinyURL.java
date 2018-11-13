package EncodeandDecodeTinyURL;

import java.util.HashMap;

public class EncodeandDecodeTinyURL {

    // Encodes a URL to a shortened URL.
	HashMap<String,String> map1=new HashMap<>();
	HashMap<String,String> map2=new HashMap<>();
	int index=0;
    public String encode(String longUrl) {
       map1.put(longUrl,index+"");
       map2.put(index+"",longUrl);
       index++;
       return index-1+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map2.get(shortUrl);
    }
}
