package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubString {
    public static void main(String[] args) {
        String template = "glwhcebdjbdroiurzfxxrbhzibilmcfasshhtyngwrsnbdpzgjphujzuawbebyhvxfhtoozcitaqibvvowyluvdbvoqikgojxcefzpdgahujuxpiclrrmalncdrotsgkpnfyujgvmhydrzdpiudkfchtklsaprptkzhwxsgafsvkahkbsighlyhjvbburdfjdfvjbaiivqxdqwivsjzztzkzygcsyxlvvwlckbsmvwjvrhvqfewjxgefeowfhrcturolvfgxilqdqvitbcebuooclugypurlsbdfquzsqngbscqwlrdpxeahricvtfqpnrfwbyjvahrtosovsbzhxtutyfjwjbpkfujeoueykmbcjtluuxvmffwgqjgrtsxtdimsescgahnudmsmyfijtfrcbkibbypenxnpiozzrnljazjgrftitldcueswqitrcvjzvlhionutppppzxoepvtzhkzjetpfqsuirdcyqfjsqhdewswldawhdyijhpqtrwgyfmmyhhkrafisicstqxokdmynnnqxaekzcgygsuzfiguujyxowqdfylesbzhnpznayzlinerzdqjrylyfzndgqokovabhzuskwozuxcsmyclvfwkbimhkdmjacesnvorrrvdwcgfewchbsyzrkktsjxgyybgwbvktvxyurufsrdufcunnfswqddukqrxyrueienhccpeuqbkbumlpxnudmwqdkzvsqsozkifpznwapxaxdclxjxuciyulsbxvwdoiolgxkhlrytiwrpvtjdwsssahupoyyjveedgqsthefdyxvjweaimadykubntfqcpbjyqbtnunuxzyytxfedrycsdhkfymaykeubowvkszzwmbbjezrphqildkmllskfawmcohdqalgccffxursvbyikjoglnillapcbcjuhaxukfhalcslemluvornmijbeawxzokgnlzugxkshrpojrwaasgfmjvkghpdyxt";
       // boolean check=checkDx(template);
       // System.out.println(check);
        String palindromic = getPalindromic(template);
        System.out.println(palindromic);
    }

    static String getPalindromic(String s)
    {
        if(s == null) return "";
        List<String> stringList = new ArrayList<>();
        int count = s.length();
        if(count ==0) return "";
        for(int i=count;i>=1;i--)
        {
            for(int k = 0; k< count - i+1; k ++ ){
                String template = s.substring(k, k+ i);
                stringList.add(template);
                if(checkDx(template)){
                    return template;
                }
            }
        }
        return null;
    }

    static boolean checkDx(String s){

        int j=s.length()-1;
        for (int i = 0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
