package com.example.tickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dima on 8/28/2017.
 */

public class Ticket
{

    private ArrayList<HistoryStep> mHistory = new ArrayList<HistoryStep>();
    private Map<String, String> mParams;

    public Ticket()
    {
        mParams = new HashMap<String, String>();
    }

    public void setParamsList(Map<String, String> newParams)
    {
        if (null != newParams)
        {
            mParams = newParams;
        }
    }

    public void setParam(String key, String value)
    {
        if (null != value)
        {
            mParams.put(key, value);
        }
    }

    public void setParam(String key, Integer value)
    {
        if (null != value)
        {
            mParams.put(key, value.toString());
        }
    }

    public String getParam(String key)
    {
        String result = mParams.get(key);
        if (null == result)
            result = "";
        return result;
    }

    public Integer getParamAsInt(String key)
    {
        Integer result = 0;
        String param = mParams.get(key);
        if (null == param)
            param = "0";
        result = Integer.valueOf(param);
        return result;
    }

    public final Map<String, String> getParams()
    {
        return mParams;
    }

    public void addHistoryStep(HistoryStep step)
    {
        mHistory.add(step);
        step.setTicket(this);
    }

    public void setHistory(ArrayList<HistoryStep> steps)
    {
        if (null != steps && steps.size() > 0)
        {
            mHistory = steps;
            for (HistoryStep historyStep : steps)
            {
                historyStep.setTicket(this);
            }
        }
    }

    public ArrayList<HistoryStep> getHistory()
    {
        return mHistory;
    }

    public ArrayList<String> getHeaders()
    {
        ArrayList<String> result = new ArrayList<String>();
        result.addAll(mParams.keySet());
        return result;
    }
}

