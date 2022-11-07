import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataTest {
    DataParser dataParser = new DataParser();


    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }

    @Test(expected = NullPointerException.class)
    public void exeptionOnEmptyJson()
    {
        //dataParser.parseJsonData("");
    }

}
