import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsAll {
public static void main(String [] args) {
	// Map is interface can derves linked hhsash tree hasgtable
	// interface <key,value> ref=new subclass<key,values>();
	HashMap<Integer,String> cskmap=new HashMap<Integer,String>();
	
	cskmap.put(7, "dhoni");// adding data into hashmap
	cskmap.put(1 , "jadeja");// adding data into hashmap
Map<Integer,String> rcbmap=new HashMap<Integer,String>();
//Map<Integer,String> rcbmap=new TreeMap<Integer,String>();
//Map<Integer,String> rcbmap=new LinkedHashMap<Integer,String>();
//Map<Integer,String> rcbmap=new Hashtable<Integer,String>();

	
	rcbmap.put(9, "Rohitha");// adding data into hashmap
	rcbmap.put(5 , "jadeja");// adding data into hashmap
	//System.out.println("key:"+ent.getKey()+" " +ent.getValue());
//Set<Entry<Integer,String>> s=rcbmap.entrySet();
//for(Entry<Integer,String> e:s)
//{
//	
//	System.out.println(e.getKey()+e.getValue());
//}
	//System.out.println(cskmap);//{1=jadeja, 7=dhoni}
	Map<Integer, String> iplmap=new HashMap<Integer,String>();
	iplmap.putAll(cskmap);// adding one set fv data into ontheer HashMap
	iplmap.putAll(rcbmap);// adding one set fv data into ontheer HashMap
	System.out.println("totasl plyers size ="+iplmap.size());//totasl plyers size =4
	System.out.println("key 7 prsent are there="+iplmap.containsValue(12));// to check values presnt in thaat conterner/key 7 prsent are there=false
	System.out.println("key 7 prsent are there="+iplmap.containsKey(12));// to check values presnt in thaat conterner//key 7 prsent are there=false
System.out.println("values present in "+iplmap.containsValue("Rohitha"));//true// thats value contins means it gives true
System.out.println(iplmap.get(5));//jadeja
System.out.println(iplmap.get(77));//null
// remove key  any values or key 
iplmap.remove(7);// it will removerd key and values
	
System.out.println(iplmap);//{1=jadeja, 9=Rohitha, 5=jaggu}
System.out.println(iplmap.size());//3
iplmap.put(7,"gggg");// we can replace key,values
iplmap.put(7, "llll");// we can replcae by this

System.out.println(iplmap);//{1=jadeja, 9=Rohitha, 5=jaggu}



System.out.println(iplmap.size());//4
// to itrate map we can do in two ways 1

for (Integer mk:iplmap.keySet())// to get  keys
{
System.out.println("keys"+" "+ mk);// to get values
}
//
//
for(String mv:iplmap.values())
{
	System.out.println("values"+mv);

//	
//}

	// by doing two times we can do one timne itterati 
for(Map.Entry<Integer,String>ent:iplmap.entrySet())
System.out.println("key:"+ent.getKey()+" " +ent.getValue());

//Iterator<Integer>a=iplmap.keySet().iterator();
//while(a.hasNext()) {
//	
//	int key=(Integer)a.next();
//	System.out.println(key+" "+iplmap);
//}
}

}
