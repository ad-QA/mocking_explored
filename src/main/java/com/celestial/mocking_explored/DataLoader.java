package com.celestial.mocking_explored;
public class DataLoader
{
    private final IDataSource dataSource;
    public  DataLoader( IDataSource ds )
    {
        dataSource = ds;
    }
    public  long    loadData(String fname)
    {
        var data = dataSource.loadData(fname);
        long count = 0;
        for( var datum : data )
        {
            count += datum.length();
        }
        return count;
    }
}
