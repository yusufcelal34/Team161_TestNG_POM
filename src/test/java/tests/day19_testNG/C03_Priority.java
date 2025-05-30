package tests.day19_testNG;

import org.testng.annotations.Test;

public class C03_Priority {

    @Test
    public void bTest(){


    }

    @Test
    public void aTest(){


    }

    @Test (priority = -2)
    public void cTest(){


    }

    @Test(priority = 5)
    public void test04(){


    }

    @Test(priority = 20)
    public void test05(){


    }

    @Test
    public void test06(){


    }

}
