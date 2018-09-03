package com.whatever.FirstSpring;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EarningsData{
    public String account;
    //entry_collect,
    public double entry_fees;
    public double entry_pl;
    public double entry_price;
    public int entry_shares;
    public int entry_side;
    public String entry_time;
    //exit_collect;
    public double exit_collect_prev_close;
    public double exit_collect_open;
    public double exit_collect_high;
    public double exit_collect_low;
    public double exit_collect_close;
    public double exit_collect_open_pct_gap;
    public double exit_collect_open_dollar_gap;
    public double exit_collect_close_perc_change;
    public double exit_collect_close_dollar_change;
    public double exit_collect_30_min_price_change;
    public double exit_collect_30_min_high;
    public double exit_collect_30_min_low;
    public double exit_collect_60_min_price_change;
    public double exit_collect_60_min_high;
    public double exit_collect_60_min_low;
    public double exit_collect_90_min_price_change;
    public double exit_collect_90_min_high;
    public double exit_collect_90_min_low;
    public String exit_collect_high_time;
    public String exit_collect_low_time;
    public double exit_collect_daily_LIR;
    public double exit_collect_atr;
    public double exit_collect_pc_bef_earn;
    public String exit_collect_symbol;
    public double exit_fees;
    public double exit_price;
    public int exit_shares;
    public int exit_side;
    public Date exit_time;
    public int matched_shares;
    public double mtm_pl;
    public String symbol;
    static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    public EarningsData(String[] s){
        account = s[0];
        //entry_collect,
        entry_fees = Double.parseDouble(s[2]);
        entry_pl = Double.parseDouble(s[3]);
        entry_price = Double.parseDouble(s[4]);
        entry_shares = Integer.parseInt(s[5]);
        entry_side = Integer.parseInt(s[6]);
        entry_time = s[7];
        //exit_collect = s[0];
        exit_collect_prev_close = Double.parseDouble(s[9]);
        exit_collect_open = Double.parseDouble(s[10]);
        exit_collect_high = Double.parseDouble(s[12]);
        exit_collect_low = Double.parseDouble(s[12]);
        exit_collect_close = Double.parseDouble(s[13]);
        exit_collect_open_pct_gap = Double.parseDouble(s[14]);
        exit_collect_open_dollar_gap = Double.parseDouble(s[15]);
        exit_collect_close_perc_change = Double.parseDouble(s[16]);
        exit_collect_close_dollar_change = Double.parseDouble(s[17]);
        exit_collect_30_min_price_change = Double.parseDouble(s[18]);
        exit_collect_30_min_high = Double.parseDouble(s[19]);
        exit_collect_30_min_low = Double.parseDouble(s[20]);
        exit_collect_60_min_price_change = Double.parseDouble(s[21]);
        exit_collect_60_min_high = Double.parseDouble(s[22]);
        exit_collect_60_min_low = Double.parseDouble(s[23]);
        exit_collect_90_min_price_change = Double.parseDouble(s[24]);
        exit_collect_90_min_high = Double.parseDouble(s[25]);
        exit_collect_90_min_low = Double.parseDouble(s[26]);
        exit_collect_high_time = s[27];
        exit_collect_low_time = s[28];
        exit_collect_daily_LIR = Double.parseDouble(s[29]);
        exit_collect_atr = Double.parseDouble(s[30]);
        exit_collect_pc_bef_earn = Double.parseDouble(s[31]);
        exit_collect_symbol = s[32];
        exit_fees = Double.parseDouble(s[33]);
        exit_price = Double.parseDouble(s[34]);
        exit_shares = Integer.parseInt(s[35]);
        exit_side = Integer.parseInt(s[36]);
        try {
            exit_time = df.parse(s[37]);
        } catch(ParseException pe){
            System.out.println("unable to parse " + s[37]);
        }
        matched_shares = Integer.parseInt(s[38]);
        mtm_pl = Double.parseDouble(s[39]);
        symbol = s[40];

    }
}
