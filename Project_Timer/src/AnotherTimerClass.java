public class AnotherTimerClass {


    // total time (in seconds) equals seconds+60*minutes
    private int seconds;// invariant: 0<=seconds<=59
    private int minutes;// invariant: 0<=minutes<=60 && (minutes<60 || seconds==0)


    //checks whether the count-down is not finished yet
    public boolean isRunning() {
        return (this.seconds > 0);
    }


   //returns the current time of the timer in seconds
    public int getTime() {
       return( (this.minutes*60)+this.seconds);
    }


    //decreases of one second the time of the timer if greater than 0
    public void tick() {
        if ( getTime() >0) this.seconds -- ;
    }


/*
    resets to minutes the time of the timer
    the time is in minutes
    returns the previous time of the timer in seconds
    throws an exception if minutes<0 or minutes>60
*/
    public int reset(int minutes) {
      if ( this.minutes < 0 || this.minutes > 60)
          throw new IllegalArgumentException();
      int prevTime = getTime();
      this.minutes = this.seconds /  60 ;
      return prevTime;
    }
}