package com.upoint.jni;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class Test {
    private static final Map<String, String> fieldAndStandard = new HashMap<>();
    public static final Men URP_URL = Men.getInstance();

    public static void main(String[] args) {

        String ttt = "a.b.c.c";
        ttt = ttt.replace("a", "").replace("d", "");
        System.out.println(ttt);
        while(ttt.lastIndexOf(".") > 0) {
            ttt = ttt.substring(0, ttt.lastIndexOf("."));
            System.out.println(ttt);
        }
        
/*        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if ("4".equals(iterator.next())) {
                iterator.remove();
            }
        }
        
         * for(String str : list) { if("3".equals(str)) { list.remove(str); } }
         
        System.out.println(list.size() + list.toString());

        String tt = "1234523244,,,";
        System.out.println(tt.split(",").length);
        // String concat = tt.concat("2");
        String replaceAll = tt.replace("2", "");
        System.out.println(replaceAll);*/
        // String id = "1e79da21-9ecd-7778-965b-38835d4e65b7";
       BufferedOutputStream bufferedOutputStream;
        Socket socket;
        try {
            socket = new Socket("127.0.0.1", 8003);
            bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
            for (int i = 0; i < 5; i++) {
                if (i % 10 == 0) {
                    socket = new Socket("127.0.0.1", 8003);
                    bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                }
                String str = "{\"Chipset\":\"075AE4\",\"FrameworkVer\":\"FraV4.7\",\"Event_Data\":{\"cloudclient\":{\"ccupgradesuccratio\":100,\"fwkupgradesuccratio\":100,\"pluginopsuccratio\":100,\"connexception\":[{\"description\":\"端口不可达\",\"Time\":1529048102648}],\"connsuccratio\":100,\"pluginplatformdelay\":\"50\",\"authdelay\":\"50\",\"msgreportsuccratio\":100,\"hbdelay\":\"50\",\"connevent\":[{\"Event\":\"事件发送\",\"Time\":1529048102648}]}},\"StrategyId\":\"[qDVjM9AphnIL, aL6jfb9IGVKy, aFJLhKfIjVMT, wdgMU4e4VUOG]\",\"FirmwareVer\":\"FirV0.3\",\"MAC\":\"0023C9556678\",\"Province\":\"6\",\"Event_Type\":\"MSG_SYS_RESOURCE\",\"Version\":\"4\",\"ID\":\"9c6c3330-b9fb-48a7-bd2e-c7c6562c9d7a\",\"Manufacture\":\"3vAmnwB248\",\"ProductClass\":\"rqLvYynelx\",\"CCVersion\":\"CCV6.8\",\"OSVer\":7}";
                bufferedOutputStream.write((str + "\r\n\r\n").getBytes());
                bufferedOutputStream.flush();
                Thread.sleep(500);
                System.out.println("send success" + i);
            }
            // bufferedOutputStream.flush();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        /*
         * Map<Integer,Object> ma1 = new HashMap<>(); ma1.put(1, 2); ma1.put(2, "2");
         * ma1.put(3, "2"); Map<Integer,Object> ma2 = new HashMap<>(); ma2.put(1, 1);
         * ma2.put(3, 1); ma2.putAll(ma1); System.out.println(ma2.toString()); Set ss =
         * null; Object aa = ss; System.out.println((Set)aa);
         */
        /*
         * Men men1 = new Men(21); Men men2 = new Men(22); Men men3 = new Men(23); Men
         * men4 = new Men(24); Men men5 = new Men(25); List<Men> menlist = new
         * ArrayList<>(); menlist.add(men1); menlist.add(men2); menlist.add(men3);
         * menlist.add(men4); menlist.add(men5); menlist.forEach(Men::showtoString);
         */
        /*
         * //test(men); new AB(men).start();
         * 
         * System.out.println("后台打印："+men.getAge()); try { Thread.sleep(1000); } catch
         * (InterruptedException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); }; System.out.println("后台打印："+men.getAge());
         * men.setAge(50);
         */
        // new User();
        /*
         * Map map = new HashMap(); System.out.println(map.get("dd"));
         * fieldAndStandard.put("123", "test");
         * System.out.println(fieldAndStandard.get("123")); fieldAndStandard.put("123",
         * "t2"); System.out.println(fieldAndStandard.get("123"));
         * System.out.println(URP_URL); URP_URL.setAge(1);; System.out.println(URP_URL);
         */
        // URP_URL = Men.getInstance();
        /*
         * Map<Integer,Boolean> aa = new HashMap<>(); Boolean bb = aa.get(11);
         * System.err.println(bb); UserSon userSon = new UserSon(); userSon.setId(1);
         * userSon.setName(""); userSon.setMax(1); User user = new User();
         * user.setId(1); user.setName("");
         * 
         * System.out.println(null instanceof User);
         */

        /*
         * String temp = "abddddbbbdfgdsfghdsghag"; temp.replaceAll("ddd", "cdd");
         * System.out.println("1212"+"abb".charAt(0));
         * System.out.println("abbd".charAt(2)); System.out.println("abbd".charAt(3));
         * System.out.println(deal01("abcab").toString());;
         */
        /*
         * String aggsField = "aa.bb"; String path =
         * aggsField.substring(0,aggsField.lastIndexOf(".")+1);
         * System.out.println(path); test(); AA aa = new Test().new AA();
         * aa.setAGE(123);
         */
        // new Test().testThread();
        // Men m = Men.getInstance();
        // m.getAge();
        /*
         * User user = new User(123,""); User user1 = user; User user2 = user; try {
         * user2 = user.clone(); } catch (CloneNotSupportedException e) { // TODO
         * Auto-generated catch block e.printStackTrace(); }
         * System.out.println(user.getId() + "user1: "+user1.getId()
         * +"user2:"+user2.getId()); user.setId(234); System.out.println(user.getId() +
         * "user1: "+user1.getId() +"user2:"+user2.getId());
         */
        /*
         * Set<Integer> macSet = new HashSet<>(); macSet.add(1); macSet.add(2);
         * macSet.add(1); System.out.println(macSet.size()+"macSet:"+macSet.toString());
         * int aa = 33 ;
         * 
         * aa = 100/aa; System.out.println(aa);
         */
        /*
         * StringBuilder sb = new StringBuilder().append("hhh"); aa(sb); bb(sb); cc(sb);
         * Integer aa = 1000; int bb = 1000; Integer aa1 = 100; int bb1 = 100;
         * System.out.println("aa::" + (bb==bb) + "bb::" + (aa1==bb1));
         */

    }

    public static void aa(StringBuilder sb) {
        sb.append("aa");
        System.out.println(sb.toString());
    }

    public static void bb(StringBuilder sb) {
        sb.append("bb");
        System.out.println(sb.toString());
    }

    public static void cc(StringBuilder sb) {
        sb.append("cc");
        System.out.println(sb.toString());
    }

    class AA {
        private int AGE;

        public int getAGE() {
            return AGE;
        }

        public void setAGE(int aGE) {
            AGE = aGE;
        }

    }

    public void testThread() {
        int i = 0;
        A a = new A(i);
        A a1 = new A(i);
        Thread thread01 = new Thread(a);
        Thread thread02 = new Thread(a);
        Thread thread03 = new Thread(a1);
        thread01.start();
        thread02.start();
        thread03.start();
        if (a.m == null) {
            System.out.println("it is null :" + a.m);
        }
        while (i < 1000) {
            if (a.m == a1.m) {
                System.out.println("it is true : " + i + a1.m);
            } else {
                System.out.println("it is true01 : " + i + a1.m + "a.m::" + a.m);
            }
            i++;
        }

    }

    class A extends Thread {
        public int index;
        public Men m;

        public A(int i) {
            this.index = i;
        }

        public void run() {
            this.index++;
            m = Men.getInstance();
            System.out.println(this.index);
        }
    }

    public static void test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:dd");
        System.out.println(new Date(System.currentTimeMillis()).toString());
        System.out.println(new Date(System.currentTimeMillis()).getDay());
        System.out.println(new Date(System.currentTimeMillis()).getMonth());
        System.out.println(sdf.format(new Date(1522397288424L)));
        System.out.println(new Date(1522397288424L).getMonth());
        // System.out.println(new Date(1522397288424L).getDate());
        System.out.println(new Date(1522397288424L).getDay());
        String str1 = "123";
        Float f1 = Float.valueOf(str1);
        System.out.println("str1" + f1);

    }

    public int[] deal(String src) {
        Integer[] temp = new Integer[src.length()];
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            temp[i] = 1;
        }
        return null;
    }

    public static int[] deal01(String src) {

        char[] strKey = src.toCharArray();
        int[] next = new int[strKey.length];

        // 初始条件
        int j = 0;
        int k = -1;
        next[0] = -1;

        // 根据已知的前j位推测第j+1位
        while (j < strKey.length - 1) {
            if (k == -1 || strKey[j] == strKey[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }

        return next;
    }

    public static void test04() {
        try {
            testPost02(
                    "https://openapitest.189cube.com/abilitysupport?ProvinceID=10001&AppID=1000000080249985&OperateID=GET_GATEAWY_INFO&Secret=23d582693d7ba8e1",
                    "{\"esurfingAccount\":\"\",\"mac\":\"0023C9556678\",\"logicId\":\"\"}");
        } catch (KeyManagementException | NoSuchAlgorithmException | NoSuchProviderException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void testPost02(String url, String param) throws MalformedURLException, IOException,
            KeyManagementException, NoSuchAlgorithmException, NoSuchProviderException {
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
        HttpsURLConnection httpsConnection = (HttpsURLConnection) new URL(url).openConnection();
        // Prepare SSL Context
        TrustManager[] tm = {};
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, tm, new java.security.SecureRandom());

        // 从上述SSLContext对象中得到SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();
        httpsConnection.setSSLSocketFactory(ssf);

        HttpsURLConnection conn = httpsConnection;
        // 设置通用的请求属性
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        conn.setRequestProperty("Content-Type", "application/json");
        if (param != null && !param.equals("")) {
            conn.setRequestMethod("POST");
        } else {
            conn.setRequestMethod("GET");
        }

        // http正文内，因此需要设为true,
        conn.setDoOutput(true);
        // 设置是否从httpUrlConnection读入
        conn.setDoInput(true);
        // Post 请求不能使用缓存
        conn.setUseCaches(false);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
        // 发送请求参数
        if (param != null && !param.equals("")) {
            out.print(param);
        }
        // flush输出流的缓冲
        out.flush();
        // 定义BufferedReader输入流来读取URL的响应
        in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        String line;
        while ((line = in.readLine()) != null) {
            result.append(line);
        }
        System.out.println(result.toString());
    }

    public void test01() {
        User user = new User();
        Method[] declaredMethods = user.getClass().getDeclaredMethods();
        try {
            Method declaredMethod = user.getClass().getDeclaredMethod("toString");
            try {
                Object invoke = declaredMethod.invoke(user);
                System.out.println(invoke);
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(declaredMethods.toString());
    }

    private static HostnameVerifier ignoreHostnameVerifier = (String s, SSLSession sslsession) -> true;

}
