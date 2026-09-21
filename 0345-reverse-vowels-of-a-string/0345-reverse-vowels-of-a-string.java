class Solution {
    public String reverseVowels(String s) {
        StringBuilder res= new StringBuilder();

        for(char c:s.toCharArray()){
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U'){
                res.append(c);
            }
        }
        res.reverse();
        System.out.print(res);
     
        char[] arr = s.toCharArray();
        int j = 0;
         for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'|| c=='E'||c=='I'||c=='O'||c=='U') {
                arr[i] = res.charAt(j++);
            }
        }

        return new String(arr);
    }
}