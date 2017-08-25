package iterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

//https://www.youtube.com/watch?v=t3jxvshXDfg&index=11&list=PLB841C370FAFB8EC7
public class URLLibrary implements Iterable<String>{

    LinkedList<String> myList = new LinkedList<String>();

    private class URLIterator implements Iterator<String>
    {
        private int index = 0;
        @Override
        public boolean hasNext() {

            return index<myList.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(myList.get(index));
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                while ((line = (reader.readLine())) != null)
                {
                    sb.append(line);
                    sb.append("\n");
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        @Override
        public void remove() {
            myList.remove(index);
        }
    }

    public URLLibrary() {
        myList.add("http://www.google.com");
        myList.add("https://www.bing.com/");

    }



    public static void main(String[] args) {
        URLLibrary library = new URLLibrary();

        for(String html : library)
        {
            System.out.println(html);
        }

    }

    @Override
    public Iterator<String> iterator() {
        return new URLIterator();
    }
}
