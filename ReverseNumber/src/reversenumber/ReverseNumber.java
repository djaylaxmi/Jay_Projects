/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.Scanner;

/**
 *
 * @author jdeshpande
 */
public class ReverseNumber {

    
    public static void main(String[] args) {
        int n, reverse = 0;
        
        System.out.println("Enter the number to reverse: ");
        
        Scanner in = new Scanner (System.in);
        
        n = in.nextInt();
        
        while (n!=0)
        {
            
            reverse = reverse*10;
            reverse = reverse +n%10;
            n = n/10;
        }
        
        System.out.println("Reverse of entered number is " +reverse);
    }
    
}


/**_oo0oo_
3//                      o8888888o
4//                      88" . "88
5//                      (| -_- |)
6//                      0\  =  /0
7//                    ___/`---'\___
8//                  .' \\|     |// '.
9//                 / \\|||  :  |||// \
10//                / _||||| -:- |||||- \
11//               |   | \\\  -  /// |   |
12//               | \_|  ''\---/''  |_/ |
13//               \  .-\__  '-'  ___/-. /
14//             ___'. .'  /--.--\  `. .'___
15//          ."" '<  `.___\_<|>_/___.' >' "".
16//         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
17//         \  \ `_.   \_ __\ /__ _/   .-` /  /
18//     =====`-.____`.___ \_____/___.-`___.-'=====
19//                       `=---='
20//
21//
22//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
23//
24//               佛祖保佑         永无BUG
25//  */
