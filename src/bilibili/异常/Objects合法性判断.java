package bilibili.异常;

import java.util.Objects;

/***
 * 异常的父类 Throwable
 *
 */
public class Objects合法性判断 {
    public static void main(String[] args) {
        Mythrow(null);
    }
    public static void Mythrow (Object obj){
  /*      if (obj==null){
            throw new NullPointerException("参数为空");
        }*/
        //上面可以使用以下来代替
        Objects.requireNonNull(obj,"参数为空");
    }
}
