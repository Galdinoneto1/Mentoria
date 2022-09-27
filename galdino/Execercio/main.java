//package galdino.Execercio;
//
//public class main {
//    public static void main(String[] args) {
//
//        public String longestCommonPrefix(String[] strs) {
//        StringBuilder resultString = new StringBuilder();
//        if (strs == null || strs.length == 0) {
//            return resultString.toString();
//        }
//            if (strs.length == 1) {
//                return strs[0];
//            }
//                int minimumLength = strs[0].length();
//                for (int i = 1; i < strs.length; i++) {
//                    minimumLength = Math.min(minimumLength, strs[i].length());
//                }
//
//                for (int i = 0; i < minimumLength; i++) {
//                    char current = strs[0].charAt(i);
//                    for (String str : strs) {
//                        if (str.charAt(i) != current) {
//                            return resultString.toString();
//                        }
//                    }
//                    resultString.append(current);
//                }
//                return resultString.toString();
//            }
//
//
//
//
//}
//
//
//
//
//
//
//
//
