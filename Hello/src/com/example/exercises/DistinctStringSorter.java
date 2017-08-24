import java.io.*;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: alext
 * Date: 21.04.12
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class DistinctStringGetter {

    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Invalid params length, expected 2 at least...");
            return;
        }
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            writer = new BufferedWriter(new FileWriter(args[1]));
            String lines[] = new String[3];
            int index = 0;
            HashSet<ParamContainer> set = new HashSet<ParamContainer>();
            while((lines[index] = reader.readLine()) != null){
                if(index == 2){
                    ParamContainer paramContainer = new ParamContainer(
                            lines[0].substring(lines[0].indexOf("=")),
                            lines[1].substring(lines[1].indexOf("=")),
                            lines[2].substring(lines[2].indexOf("="))
                    );
                    if(!set.contains(paramContainer)){
                        set.add(paramContainer);
                        writer.write(lines[0] + "\r\n");
                        writer.write(lines[1] + "\r\n");
                        writer.write(lines[2] + "\r\n");
                    }
                    index = 0;
                } else {
                    index++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ParamContainer {

        String _firstParam;

        String _secondParam;

        String _thirdParam;

        public ParamContainer(String _firstParam, String _secondParam, String _thirdParam) {
            this._firstParam = _firstParam;
            this._secondParam = _secondParam;
            this._thirdParam = _thirdParam;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ParamContainer that = (ParamContainer) o;

            if (_firstParam != null ? !_firstParam.equals(that._firstParam) : that._firstParam != null) return false;
            if (_secondParam != null ? !_secondParam.equals(that._secondParam) : that._secondParam != null)
                return false;
            if (_thirdParam != null ? !_thirdParam.equals(that._thirdParam) : that._thirdParam != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = _firstParam != null ? _firstParam.hashCode() : 0;
            result = 31 * result + (_secondParam != null ? _secondParam.hashCode() : 0);
            result = 31 * result + (_thirdParam != null ? _thirdParam.hashCode() : 0);
            return result;
        }
    }
}
