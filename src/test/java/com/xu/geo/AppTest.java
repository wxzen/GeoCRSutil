package com.xu.geo;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLngLatToPixelPoint(){
        double left = 73.502355;
        double right = 135.09567;
        double bottom = 3.83703;
        double top = 53.563624;
 
        CRSutil crsUtil = new CRSutil(new double[] {116.368324, 39.915085}, 1536, 731, 4);
        Point p = crsUtil.lngLatToPixelPoint(CRSutil.toLngLat(116.368324, 39.915085));
        System.out.println(p);
        

        // Point southWestPixel = crsUtil.lngLatToPixelPoint(new LngLat(left, bottom));
        // Point northEastPixel = crsUtil.lngLatToPixelPoint(new LngLat(right, top));

        // System.out.println("---southWestPixel---");
        // System.out.println(southWestPixel);
        // System.out.println("---northEastPixel---");
        // System.out.println(northEastPixel);
    }


    @Test
    public void testPixelPointToLngLat() {
        double left = 73.502355;
        double right = 135.09567;
        double bottom = 3.83703;
        double top = 53.563624;
 
        CRSutil crsUtil = new CRSutil(new double[] {116.368324, 39.915085}, 1536, 731, 4);
        LngLat lnglat = crsUtil.pixelPointToLngLat(CRSutil.toPoint(768.0, 366.0));
        System.out.println(lnglat.lng+", "+lnglat.lat);
    }
}
