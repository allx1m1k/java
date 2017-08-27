package com.example.tickets;

/**
 * Created by dima on 8/28/2017.
 */

public class HistoryStep
{
    private String    mTime;
    private String    mAssignedBy;
    private String    mNewStep;
    private String    mCurrentUser;
    private Ticket    mTicket;
    private Integer   mStepID;

  /*public HistoryStep(String time, String assignedBy, String newStep, String currentUser)
   {
      this(time,assignedBy, newStep, currentUser, -1);
   }*/

    public HistoryStep(String time, String assignedBy, String newStep, String currentUser, int stepID)
    {
        setTime(time);
        setAssignedBy(assignedBy);
        setNewStep(newStep);
        setCurrentUser(currentUser);
        mStepID = stepID;
    }

    public String getTime()
    {
        return mTime;
    }

    public String getAssignedBy()
    {
        return mAssignedBy;
    }

    public String getNewStep()
    {
        return mNewStep;
    }

    public String getCurrentUser()
    {
        return mCurrentUser;
    }

    public void setTime(String newTime)
    {
        mTime = newTime;
    }

    public void setAssignedBy(String newAssignedBy)
    {
        mAssignedBy = newAssignedBy;
    }


    public void setNewStep(String newNewStep)
    {
        mNewStep = newNewStep;
    }

    public void setCurrentUser(String newCurrentUser)
    {
        mCurrentUser = newCurrentUser;
    }

    public void setTicket(Ticket t)
    {
        mTicket = t;
    }

    public Ticket getTicket()
    {
        return mTicket;
    }

    public int getStepID()
    {
        return mStepID;
    }
}
