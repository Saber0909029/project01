package cn.yfh.java;

import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    //模板六，输入prsf调出private static final
    private static final HelloWord hw = new HelloWord();

    //变形，输入psf调出public static final
    public static final int i =1;

    //变形，输入psfi调出public static final int
    public static final int j=1;

    //变形，输入psfs调出public static final String
    public static final String str="xiao";





    //模板一，输入psvm直接调出main函数
    public static void main(String[] args) {
    //模板二，输入sout直接调出system.out.print()
        System.out.println();
    //soutp  soutm  soutv  XXX.sout
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("demo.main");
        //soutv
        int a=10;
        System.out.println("a = " + a);
        int b=20;
        System.out.println("b = " + b);
        //XXX.sout   如a.sout
        System.out.println(a);

        //模板三，fori调出for循环
        String[] arr=new String[]{"xiaoming","xiaohong","xiaolan","xiaohei"};
        for (int j = 0; j <arr.length ; j++) {
            //此处用arr[j].sout调出sysout,out.print(arr[j])
            System.out.println(arr[j]);

        }
        //变形iter，增强for循环
        for (String s : arr) {
            System.out.println(s);

        }
        //变形itar，生成一个普通for循环
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            //此处用s.sout调出System.out.println(s)
            System.out.println(s);
        }
        //模板四，list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //此处使用list.for,是一个加强for循环
        for (Object o : list) {
            System.out.println(o);

        }
        //变形list.fori,是一个普通for循环
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.println(i);
            System.out.println(list);

        }
        //变形list.forr,倒序遍历
        for (int p = list.size() - 1; p >= 0; p--) {
            System.out.println(p);
            System.out.println(list);
        }

        //模板五ifn，是否为空
        ArrayList list1 = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //此处使用ifn
        if (list1 == null) {
            System.out.println("为空");
        }
        //变形inn，是否不为空
        if (list1 != null) {
            System.out.println("不为空");
        }
        //变形XXX.nn  /  XXX.null
        //此处使用list.nn
        if (list != null) {

        }
        //此处使用list.null
        if (list == null) {

        }

    }

    }

