package Calculadora;
import java.util.ArrayList;
import java.util.Arrays;
public class Eval{
    public static Object eval(String op){
        if (op.matches("[0-9+\\-*/.\\s]+")){
            String[] splited = op.split("");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(splited));


            while ((list.contains("*")) && (list.contains("/"))){
                int tempx=list.indexOf("*");
                int tempy=list.indexOf("/");
                if (tempx<tempy){
                    double r = (Double.parseDouble(list.get(tempx-1)))*(Double.parseDouble(list.get(tempx+1)));
                    list.set(tempx, Double.toString(r));
                    list.remove(tempx-1);
                    list.remove(tempx);
                    continue;
                }
                if (tempy<tempx){
                    double r = (Double.parseDouble(list.get(tempy-1)))/(Double.parseDouble(list.get(tempy+1)));
                    list.set(tempy, Double.toString(r));
                    list.remove(tempy-1);
                    list.remove(tempy);
                }

            }
            while(list.contains("*")){
                int temp = list.indexOf("*");
                double r = (Double.parseDouble(list.get(temp-1)))*(Double.parseDouble(list.get(temp+1)));
                list.set(temp, Double.toString(r));
                list.remove(temp-1);
                list.remove(temp);
            }
            while(list.contains("/")){
                int temp = list.indexOf("/");
                double r = (Double.parseDouble(list.get(temp-1)))/(Double.parseDouble(list.get(temp+1)));
                list.set(temp, Double.toString(r));
                list.remove(temp-1);
                list.remove(temp);
            }
            while (list.contains("+") && list.contains("-")){
                int tempx=list.indexOf("+");
                int tempy=list.indexOf("-");
                if (tempx<tempy){
                    double r = (Double.parseDouble(list.get(tempx-1)))+(Double.parseDouble(list.get(tempx+1)));
                    list.set(tempx, Double.toString(r));
                    list.remove(tempx-1);
                    list.remove(tempx);
                    continue;
                }
                if (tempy<tempx){
                    double r = (Double.parseDouble(list.get(tempy-1)))-(Double.parseDouble(list.get(tempy+1)));
                    list.set(tempy, Double.toString(r));
                    list.remove(tempy-1);
                    list.remove(tempy);
                }
            }
            while(list.contains("+")){
                int temp = list.indexOf("+");
                double r = (Double.parseDouble(list.get(temp-1)))+(Double.parseDouble(list.get(temp+1)));
                list.set(temp, Double.toString(r));
                list.remove(temp-1);
                list.remove(temp);
            }
            while(list.contains("-")){
                int temp = list.indexOf("-");
                double r = (Double.parseDouble(list.get(temp-1)))-(Double.parseDouble(list.get(temp+1)));
                list.set(temp, Double.toString(r));
                list.remove(temp-1);
                list.remove(temp);
            }
            return list;
        }
        else{return "Valores no permitidos fueron ingresados";}
    }
}