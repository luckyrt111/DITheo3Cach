package tinhtong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 06/03/17.
 */
@Service("123")
public class TinhTong1 {

    @Autowired
    private TinhTong2 tt2;

    public TinhTong1(TinhTong2 tt2) {
        this.tt2 = tt2;
    }

    public int add(int a, int b){
        return a + b;
    }

}
