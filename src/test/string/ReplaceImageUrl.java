package test.string;

public class ReplaceImageUrl {
    public static void main(String [] args) {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(System.currentTimeMillis());
        }
        System.currentTimeMillis();
        String originStr = "Given the roots <img src=\"https://latex.artofproblemsolving.com/b/b/6/bb60e0857a2c0a2c47acfbe81781032feb1f7150.png\" class=\"latex\" alt=\"$a,b,c,d$\" style=\"vertical-align: -3px\" width=\"59\" height=\"16\" /> of the equation <img src=\"https://latex.artofproblemsolving.com/9/7/3/973fd6662eae9b46351ad8e0eb1b9116a43825d1.png\" class=\"latex\" alt=\"$x^{4}+x^{3}-1=0$\" style=\"vertical-align: -1px\" width=\"122\" height=\"16\" />.First, Vieta\\'s relations give <img src=\"https://latex.artofproblemsolving.com/1/7/3/1735d1fff332e3a82d363bab562b7590d2e92917.png\" class=\"latex\" alt=\"$a+b+c+d = -1 , ab+ac+ad+bc+bd+cd=0, abcd = -1$\" style=\"vertical-align: -3px\" width=\"494\" height=\"16\" />.Then <img src=\"https://latex.artofproblemsolving.com/5/1/2/5122e8a7f3b669ffead178a2bebd1e9a27d709b9.png\" class=\"latex\" alt=\"$cd=-\\\\frac{1}{ab}$\" style=\"vertical-align: -12px\" width=\"75\" height=\"37\" /> and <img src=\"https://latex.artofproblemsolving.com/2/e/3/2e319fc5d9b4ed3a3c9661710ea71218fecca897.png\" class=\"latex\" alt=\"$c+d=-1-(a+b)$\" style=\"vertical-align: -4px\" width=\"161\" height=\"18\" />.The other coefficients give <img src=\"https://latex.artofproblemsolving.com/f/0/2/f0241d61753da1d7cce7662f19a416e014a87681.png\" class=\"latex\" alt=\"$ab+(a+b)(c+d)+cd = 0$\" style=\"vertical-align: -4px\" width=\"219\" height=\"18\" /> or <img src=\"https://latex.artofproblemsolving.com/4/7/1/47181f5b2ba7db474da3bf9c258ccfac8c6679a8.png\" class=\"latex\" alt=\"$ab+(a+b)[-1-(a+b)]-\\\\frac{1}{ab}=0$\" style=\"vertical-align: -12px\" width=\"279\" height=\"37\" />.Let <img src=\"https://latex.artofproblemsolving.com/0/1/6/0162211809d1f1d3e3fe5cf4408b4e138e0dcea1.png\" class=\"latex\" alt=\"$a+b=s$\" style=\"vertical-align: -1px\" width=\"72\" height=\"14\" /> and <img src=\"https://latex.artofproblemsolving.com/8/6/1/861f9a393c4d9383eb9de14217d3ea8bdd5add8c.png\" class=\"latex\" alt=\"$ab=p$\" style=\"vertical-align: -3px\" width=\"50\" height=\"16\" />, so <img src=\"https://latex.artofproblemsolving.com/5/f/4/5f4532841fbb7ed444621c07232d990855b27ff6.png\" class=\"latex\" alt=\"$p+s(-1-s)-\\\\frac{1}{p}=0$\" style=\"vertical-align: -16px\" width=\"177\" height=\"40\" />(1).Second, <img src=\"https://latex.artofproblemsolving.com/c/7/d/c7d457e388298246adb06c587bccd419ea67f7e8.png\" class=\"latex\" alt=\"$a$\" width=\"9\" height=\"8\" /> is a root, <img src=\"https://latex.artofproblemsolving.com/8/5/1/851109df4ff6b74049fd2c69a87ebebcb241e10b.png\" class=\"latex\" alt=\"$a^{4}+a^{3}=1$\" style=\"vertical-align: -1px\" width=\"88\" height=\"16\" /> and <img src=\"https://latex.artofproblemsolving.com/8/1/3/8136a7ef6a03334a7246df9097e5bcc31ba33fd2.png\" class=\"latex\" alt=\"$b$\" width=\"8\" height=\"12\" /> is a root, <img src=\"https://latex.artofproblemsolving.com/8/c/f/8cf27c53fd504a06e9cfd2a9ee9d235be39b0fcc.png\" class=\"latex\" alt=\"$b^{4}+b^{3}=1$\" style=\"vertical-align: -1px\" width=\"85\" height=\"16\" />.Multiplying: <img src=\"https://latex.artofproblemsolving.com/9/1/f/91fc440fb733e2475b63293803d877ae0b3434e8.png\" class=\"latex\" alt=\"$a^{3}b^{3}(a+1)(b+1)=1$\" style=\"vertical-align: -4px\" width=\"173\" height=\"19\" /> or <img src=\"https://latex.artofproblemsolving.com/1/c/5/1c582352bb7f9c6ef89688a1342abaf537cef0f7.png\" class=\"latex\" alt=\"$p^{3}(p+s+1)=1$\" style=\"vertical-align: -4px\" width=\"135\" height=\"19\" />.Solving <img src=\"https://latex.artofproblemsolving.com/8/f/c/8fc947dfb2228708976d2ca68eba41e06efc04a0.png\" class=\"latex\" alt=\"$s= \\\\frac{1-p^{4}-p^{3}}{p^{3}}$\" style=\"vertical-align: -16px\" width=\"122\" height=\"42\" />.In (1): <img src=\"https://latex.artofproblemsolving.com/6/a/9/6a963f5e8b130d116a2be9c73332e3daedf621e4.png\" class=\"latex\" alt=\"$\\\\frac{p^{8}+p^{5}-2p^{4}-p^{3}+1}{p^{6}}=0$\" style=\"vertical-align: -16px\" width=\"210\" height=\"42\" />.<img src=\"https://latex.artofproblemsolving.com/9/9/2/99257acacf33acb961e4f23f4b01663e7400fe36.png\" class=\"latex\" alt=\"$p^{8}+p^{5}-2p^{4}-p^{3}+1=0$\" style=\"vertical-align: -3px\" width=\"207\" height=\"18\" /> or <img src=\"https://latex.artofproblemsolving.com/5/7/2/572b3798106281b995eefe6292ada55f326e98db.png\" class=\"latex\" alt=\"$(p-1)(p+1)(p^{6}+p^{4}+p^{3}-p^{2}-1)= 0$\" style=\"vertical-align: -4px\" width=\"320\" height=\"19\" />.Conclusion: <img src=\"https://latex.artofproblemsolving.com/b/d/5/bd50f740104be65482b986b5b8687584b39f9ba9.png\" class=\"latex\" alt=\"$p =ab$\" style=\"vertical-align: -3px\" width=\"52\" height=\"16\" /> is a root of <img src=\"https://latex.artofproblemsolving.com/b/4/f/b4f4e823cdc3d71fbea6695fbb81773ce5bdd0f4.png\" class=\"latex\" alt=\"$x^{6}+x^{4}+x^{3}-x^{2}-1=0$\" style=\"vertical-align: -1px\" width=\"202\" height=\"16\" />.";
        System.out.println(replaceImgUrl(originStr));
    }
    
    public static String replaceImgUrl(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        String [] strArray = str.split("<img src=\"");
        if (strArray.length == 1) {
            return str;
        }
        result.append(strArray[0]);
        for (int i = 1; i < strArray.length; i++) {
            int index = strArray[i].indexOf('"');
            String originUrl = strArray[i].substring(0, index);
            result.append("<img src=\"");
            result.append("http://test.com" + strArray[i].substring(index));
        }
        return result.toString();
    }
}
