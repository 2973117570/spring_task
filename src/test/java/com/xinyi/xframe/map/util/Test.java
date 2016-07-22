package com.xinyi.xframe.map.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 案件工具栏：案发地址  转为 地图经纬度坐标
 * 
 * 
 * */
public class Test {

 public static void main(String[] args) throws Exception {
	 Map<String,String> map = new HashMap();
	 map.put("100","新南警务室");
	 map.put("101","华南城警务室");
	 map.put("102","长廊警务室");
	 map.put("103","富民警务室");
	 map.put("104","鹅公岭警务室");
	 map.put("105","白坭坑警务室");
	 map.put("106","良安田警务室");
	 map.put("107","辅城警务室");
	 map.put("108","岐岭警务室");
	 map.put("109","力昌警务室");
	 map.put("110","黄阁坑警务室");
	 map.put("111","黄阁坑警务室");
	 map.put("112","龙新警务室");
	 map.put("113","爱联警务室");
	 map.put("114","吉祥警务室");
	 map.put("130","大学城警务室");
	 map.put("131","大运中心警务室");
	 map.put("132","尚景警务室");
	 map.put("133","新木警务室");
	 map.put("134","愉园警务室");
	// map.put("34","紫薇警务室");
	// map.put("36","盛平警务室");
	// map.put("37","回龙埔警务室");
	// map.put("38","龙西警务室");
	 map.put("39","五联警务室");
	 map.put("40","龙翔警务室");
	 map.put("41","新屯警务室");
	 map.put("42","嶂背警务室");
	 map.put("43","中心警务室");
	 map.put("44","坪西警务室");
	 map.put("45","六联警务室");
	 map.put("46","东年埔警务室");
	 map.put("47","同乐警务室");
	 map.put("48","龙东警务室");
	 map.put("49","龙兴警务室");
	 map.put("50","杨梅岗警务室");
	 map.put("51","梨园警务室");
	 map.put("52","新生警务室");
	 map.put("53","南约警务室");
	 map.put("54","刘屋警务室");
	 map.put("55","建新警务室");
	 map.put("56","罗瑞合警务室");
	 map.put("57","宝龙警务室");
	 map.put("58","龙岭警务室");
	 map.put("59","新三村警务室");
	 map.put("60","一村警务室");
	 map.put("61","格塘警务室");
	 map.put("62","何屋警务室");
	 map.put("63","京荣警务室");
	 map.put("64","龙湾警务室");
	 map.put("65","大芬警务室");
	 map.put("66","南门墩警务室");
	 map.put("67","三联警务室");
	 map.put("68","丽湖警务室");
	 map.put("69","水径警务室");
	 map.put("70","甘坑警务室");
	 map.put("71","上八约警务室");
	 map.put("72","五和警务室");
	 map.put("73","坂田警务室");
	 map.put("74","大发埔警务室");
	 map.put("75","雪象警务室");
	 map.put("76","岗头警务室");
	 map.put("77","华为警务室");
	 map.put("78","上李朗警务室");
	 map.put("79","下李朗警务室");
	 map.put("80","新洲警务室");
	 map.put("81","樟树布警务室");
	 map.put("82","吉厦警务室");
	 map.put("83","南威警务室");
	 map.put("84","南岭警务室");
	 map.put("85","塘坑警务室");
	 map.put("86","牛始埔警务室");
	 map.put("87","坪地六联警务室");
	 map.put("88","大康警务室");
	 map.put("89","西坑警务室");
	 map.put("90","安良警务室");
	 map.put("91","金源警务室");
	 map.put("92","坳背警务室");
	 map.put("93","大福警务室");
	 map.put("94","横岗警务室");
	 map.put("95","排榜警务室");
	 map.put("96","华侨新村警务室");
	 map.put("97","山厦警务室");
	 map.put("98","上木古警务室");
	 map.put("99","凤凰警务室");
	 
	 String color[] = {
			 "57b76a",
			 "3f7b10",
			 "26fad1",
			 "f68542",
			 "ff7c37",
			 "923608",
			 "699d1a",
			 "89c9e9",
			 "ad0c18",
			 "440b2f",
			 "8c978e",
			 "b9243c",
			 "e94254",
			 "9567f2",
			 "79e053",
			 "65bc01",
			 "1d5b42",
			 "94b0b2",
			 "0d7825",
			 "842772",
			 "ef133e",
			 "cbf43a",
			 "54c701",
			 "8d98db",
			 "17eaee",
			 "44a3c4",
			 "fbb595",
			 "b23912",
			 "95b58d",
			 "2de3c6",
			 "7486ff",
			 "2f413d",
			 "88e7d6",
			 "a9abf0",
			 "b8f02f",
			 "6a1463",
			 "d4193a",
			 "546f85",
			 "4770de",
			 "548d5a",
			 "4673fa",
			 "46639d",
			 "92683f",
			 "79d2b9",
			 "597899",
			 "ee36b5",
			 "d0777c",
			 "6725b4",
			 "f1790d",
			 "6a9561",
			 "a1ecd5",
			 "72a2a3",
			 "7f0c1e",
			 "57ffb5",
			 "0080da",
			 "aa9509",
			 "4860cf",
			 "b63e4f",
			 "3c1f9c",
			 "8b88a8",
			 "bd09cd",
			 "791c12",
			 "0c7090",
			 "2ebe82",
			 "309a9a",
			 "32bafb",
			 "602a63",
			 "69bd80",
			 "9c76a6",
			 "80fe42",
			 "8861a3",
			 "130456",
			 "1d219d",
			 "0efab2",
			 "c40949",
			 "f0b5e7",
			 "1304ba",
			 "7d9061",
			 "3903e8",
	 };
	 
	 DecimalFormat df=new DecimalFormat("#.000000");
	 File file  = new File("D:/xml");
	 File xmls[] = file.listFiles();
	 
	 for (int i = 0; i < xmls.length; i++) {
		InputStreamReader read = new InputStreamReader(new FileInputStream(xmls[i]));
		
		BufferedReader bfReader = new BufferedReader(read);
		String line;
		StringBuffer content = new StringBuffer();
		while ((line = bfReader.readLine())!=null) {
			content.append(line);
		}
		read.close();
		
		//写文件
		String fileName = xmls[i].getName();
		String code = fileName.replaceAll(".xml","").replaceAll("jws","");
		
		//
        String[] lonlatArray=content.toString().split(";");
        StringBuffer gpsStr=new StringBuffer();
 
        for(int j=0;j<lonlatArray.length;j++){
       	String  pt=lonlatArray[j];
       	Point p0=new Point(Double.valueOf(pt.split(",")[0]),Double.valueOf(pt.split(",")[1]));
       	Point gpsPoint = CoordinateConversion.wgs_gcj_encrypts(p0.getLat(),p0.getLng());
       	//Point bdPoint = CoordinateConversion.bd_google_encrypt(p0.getLat(),p0.getLng());
       	gpsStr.append(df.format(gpsPoint.getLng())+","+df.format(gpsPoint.getLat())+";");
        }
 
        //System.out.println(gpsStr.toString());
		
		String xmlStr =
		"<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+ 
		"<result>\n"+ 
			"<areas>\n"+ 
				"<item>\n"+ 
					"<aid>"+fileName.replaceAll(".xml","")+"</aid>\n"+ 
					"<name>"+map.get(code)+"</name>\n"+  //<!-- 面名称(非空) -->
			        "<strlatlons>"+gpsStr.toString()+"</strlatlons>\n"+                                  //<!-- 经纬度(用;分隔) (非空,不能少于4个经纬度) -->
					"<level>0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18</level>\n"+  // <!-- 显示级别列表(用,分隔) (非空) 如：1,3,7,8,13 -->
					"<color>"+color[i]+"</color>\n"+                        // <!-- 面颜色列表((用,分隔) (非空) 16进制颜色 -->
					"<borderWidth>2,3</borderWidth>\n"+                 //<!-- 面边框宽度列表((用,分隔) (可空) int 默认0 -->
					"<borderColor>000000</borderColor>\n"+            //  <!-- 面边框颜色列表((用,分隔) (可空) 16进制颜色 默认000000 -->
					"<borderAlpha>20</borderAlpha>\n"+                // <!-- 面边框透明度列表((用,分隔) (可空)int 默认200 -->
					"<writeName>true</writeName>\n"+                  //  <!-- 是否显示文字:true/false，默认为false (可空) -->
					"<fontName>宋体</fontName>\n"+                     // <!-- 字体：当writeName 为true时使用该值，字体列表见附录5，默认为宋体(可空) -->
					"<fontStyle>BOLD</fontStyle>\n"+                  // <!-- 字样式：当writeName 为true时使用该值，取值PLAIN(普通)/BOLD(粗体)/ITALIC(斜体)，默认为” PLAIN”(可空) -->
					"<fontSize>14</fontSize>\n"+                       // <!-- 字大小：当writeName 为true时使用该值，默认为10(可空) int  -->
					"<fontColor>000000</fontColor>\n"+                //  <!-- 字颜色：当writeName 为true时使用该值，默认为000000(可空) 16进制颜色表示 -->
					"<fontFactor>1</fontFactor>\n"+                   //  <!-- 字间距：当writeName 为true时使用该值，默认为1 (可空)float -->
		  		"</item>\n"+ 
		  "</areas>\n"+
		  "</result>";
		 
		FileWriter fileWriter = new FileWriter("D:/xml2/"+fileName);
		BufferedWriter bfWriter = new BufferedWriter(fileWriter);
		bfWriter.write(xmlStr);
		bfWriter.close();
		fileWriter.close();
		
	}
	
}

}
