package unit17;

import java.util.HashMap;  
public class hashtest {  
  
    //重写Equals不重写HashCode  
    static class Key {  
        private Integer id;  
        private String value;  
          
        public Key(Integer id, String value) {  
            super();  
            this.id = id;  
            this.value = value;  
        }  
        @Override  
        public boolean equals(Object o) {  
            if(o == null || !(o instanceof Key)) {  
                return false;  
            }else {  
                return this.id.equals(((Key)o).id);  
            }  
        }  
    }  
    //重写Equals也重写HashCode  
        static class Key_ {  
            private Integer id;  
            private String value;  
              
            public Key_(Integer id, String value) {  
                super();  
                this.id = id;  
                this.value = value;  
            }  
            @Override  
            public boolean equals(Object o) {  
                if(o == null || !(o instanceof Key_)) {  
                    return false;  
                }else {  
                    return this.id.equals(((Key_)o).id);  
                }  
            }  
            @Override  
            public int hashCode() {  
                 return id.hashCode();  
            }  
               
        }  
    public static void main(String[] args) {  
        //test hashcode  
        HashMap<Object, String> values = new HashMap<Object, String>(5);  
        hashtest.Key key1 =   new hashtest.Key(1, "one");  
        hashtest.Key key2 =   new hashtest.Key(1, "one");  
        System.out.println(key1.equals(key2));  
        values.put(key1, "value 1");  
        System.out.println(values.get(key2));  
          
        hashtest.Key_ key_1 =   new hashtest.Key_(1, "one");  
        hashtest.Key_ key_2 =   new hashtest.Key_(1, "one");  
        System.out.println(key_1.equals(key_2));  
        System.out.println(key_1 == key_2);  
        values.put(key_1, "value 1");  
        System.out.println(values.get(key_2));  
    }  
}  
