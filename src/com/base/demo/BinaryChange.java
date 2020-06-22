package com.base.demo;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Change Binary
 * @author Cherry
 * 2020年4月25日
 */
public class BinaryChange
{
    /*
     * Java中十进制转其它进制：
             *  十进制转二进制：Integer.toBinaryString(i);
             * 十进制转八进制：Integer.toOctalString(i); 
             * 十进制转十六进制：Integer.toHexString(i);
     */
	@SuppressWarnings("resource")
    public static void main(String[] args) throws ParseException{
	    Scanner scan = null;
		while(true) {
		    show("-----------十进制转换工具-----------");
		    show("\t1.十进制转二进制");
		    show("\t2.十进制转八进制");
		    show("\t3.十进制转十六进制");
		    show("\t4.退出程序");
		    scan = new Scanner(System.in);
		    int t = 0;
		    show("按编号选择：");
		    try {
		        t = scan.nextInt();
		        if(t >4 || t < 1) {
		            show("请输入选项中的数字！\n");
		            continue;
		        }
		        
		        switch (t) {
                case 1:
                    do {
                        scan = new Scanner(System.in);
                        show("-----------十进制转换二进制-----------");
                        show("输入十进制数：");
                        show("结果："+Integer.toBinaryString(scan.nextInt())+"\n");
                        show("-----------主菜单：0 \t继续：1~9------------");
                        show("选择：");
                        try {
                            t = scan.nextInt();
                        }catch (InputMismatchException e) {
                            show("请输入整数位数字！\n");
                        }
                        if(t == 0) {
                            break;
                        }
                    }while(true);
                    continue;
                case 2:
                    do {
                        scan = new Scanner(System.in);
                        show("-----------十进制转换八进制-----------");
                        show("输入十进制数：");
                        show("结果："+Integer.toOctalString(scan.nextInt())+"\n");
                        show("-----------主菜单：0 \t继续：1~9------------");
                        show("选择：");
                        try {
                            t = scan.nextInt();
                        }catch (InputMismatchException e) {
                            show("请输入整数位数字！\n");
                        }
                        if(t == 0) {
                            break;
                        }
                    }while(true);
                    continue;
                case 3:
                    do {
                        scan = new Scanner(System.in);
                        show("-----------十进制转换十六进制-----------");
                        show("输入十进制数：");
                        show("结果："+Integer.toHexString(scan.nextInt())+"\n");
                        show("-----------主菜单：0 \t继续：1~9-----------");
                        show("选择：");
                        try {
                            t = scan.nextInt();
                        }catch (InputMismatchException e) {
                            show("请输入整数位数字！\n");
                        }
                        if(t == 0) {
                            break;
                        }
                    }while(true);
                    continue;
                case 4:
                    show("退出.......");
                    System.exit(1000);
                    break;
                default:
                    show("没有此选项！\n");
                    continue;
                }
		    }catch (InputMismatchException e) {
                show("请输入整数位数字！");
            }
		}
	}
	
	public static void show(Object obj) {
	    System.out.println(obj);
	}
}