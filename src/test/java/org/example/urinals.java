package org.example;


import org.junit.platform.engine.support.descriptor.FileSystemSource;

public class urinals {
        /** @author Monish V N S Nallamilli**/
        public static void main(String[] args) {
            urinals uri = new urinals();
            System.out.println(uri.goodString("10000001"));
        }

        static boolean goodString(String str) {
            String[] i = str.split("");
            boolean isValid = true;
            int len = i.length;
            for (int a = 0; a < len - 1; a++) {
                int b = Integer.parseInt(String.valueOf(i[a]));
                int c = Integer.parseInt(String.valueOf(i[a + 1]));
                if (b == 1 && c == 1) {
                    isValid = false;
                    break;
                }
            }
            return isValid;
        }

        static int countUrinals(String str) {
            urinals obj = new urinals();
            boolean isvalid = obj.goodString(str);
            if (!isvalid)
                return -1;
            String[] i = str.split("");
            int count = 0;
            int len = i.length;
            int status[] = new int[len];
            for (int a = 0; a < len; a++) {
                status[a] = Integer.parseInt(String.valueOf(i[a]));
            }
            if (len == 1 && status[0] == 0) {
                    count = 1;
                    status[0] = 1;

            } else {
                int a = 0;
                if (status[a] == 0 && status[a + 1] != 1) {
                    status[a] = 1;
                    count++;
                }
                int c = 1;
                while (c <= len - 1) {
                    if (status[c] == 0 && status[c - 1] != 1 && status[c + 1] != 1) {
                        status[c] = 1;
                        count++;
                    }
                    c++;
                }
            }
            return count;
        }
    }